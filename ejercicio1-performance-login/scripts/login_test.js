import http from 'k6/http';
import { check, sleep } from 'k6';
import { SharedArray } from 'k6/data';

// Cargar datos desde CSV
const users = new SharedArray('users', function () {
  return open('../data/users.csv')
    .split('\n')
    .slice(1)
    .map(row => {
      const [user, passwd] = row.split(',');
      return { user, passwd };
    });
});

export const options = {
  scenarios: {
    login_load_test: {
      executor: 'constant-arrival-rate',
      rate: 20,           // 👉 20 TPS
      timeUnit: '1s',
      duration: '1m',
      preAllocatedVUs: 20,
      maxVUs: 40,
    },
  },
  thresholds: {
    http_req_duration: ['p(95)<1500'], // ⏱ <= 1.5s
    http_req_failed: ['rate<0.03'],    // ❌ < 3% errores
  },
};

export default function () {
  const user = users[Math.floor(Math.random() * users.length)];

  const payload = JSON.stringify({
    username: user.user,
    password: user.passwd,
  });

  const headers = {
    'Content-Type': 'application/json',
  };

  const res = http.post(
    'https://fakestoreapi.com/auth/login',
    payload,
    { headers }
  );

  check(res, {
    'status is 200': r => r.status === 200,
    'response time < 1500ms': r => r.timings.duration < 1500,
  });

  sleep(1);
}
