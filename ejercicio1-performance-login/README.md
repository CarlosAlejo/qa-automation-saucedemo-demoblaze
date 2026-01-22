# Ejercicio 1 – Prueba de Carga Login API

## 📌 Objetivo
Realizar una prueba de carga al servicio de **login** expuesto por la API pública **FakeStoreAPI**, alcanzando al menos **20 TPS**, validando tiempos de respuesta y estabilidad del servicio bajo carga.

---

## 🛠 Herramienta utilizada
- **k6** v0.49.0  
- **Node.js** v18+ (solo como prerequisito del entorno)

La herramienta k6 fue seleccionada por su facilidad de uso, soporte nativo para pruebas de carga, manejo de datos parametrizados y definición de thresholds.

---

## 🌐 Endpoint probado
POST https://fakestoreapi.com/auth/login
Payload de ejemplo:
```json
{
  "username": "user",
  "password": "passwd"
}
```
## 📂 Estructura del proyecto
```bash
ejercicio1-performance-login/
│
├── data/
│   └── users.csv
│
├── scripts/
│   └── login_test.js
│
├── reports/
│   └── summary.txt
│
├── readme.md
└── conclusiones.txt
```
## 📑 Datos de entrada
Los datos de usuario y contraseña se parametrizan desde un archivo CSV:

data/users.csv
```bash
user,passwd
donero,ewedon
kevinryan,kev02937@
johnd,m38rmF$
derek,jklg*_56
mor_2314,83r5^_
```
## ⚙️ Escenario de prueba

Tipo de ejecución: Constant Arrival Rate

Throughput: 20 transacciones por segundo (TPS)

Duración: 1 minuto

Usuarios virtuales: dinámicos (hasta 40 VUs)
## ✅ Validaciones aplicadas

Tiempo de respuesta:

Percentil 95 (p95) menor a 1.5 segundos

Respuestas válidas:

Códigos HTTP 200 y 401 son considerados válidos, ya que 401 Unauthorized corresponde a un comportamiento esperado del negocio cuando las credenciales no son válidas.

Nota: Los códigos 401 no se consideran errores técnicos del sistema, sino respuestas funcionales esperadas del endpoint de autenticación.
## ▶️ Ejecución de la prueba
## 1️⃣ Prerrequisitos

  - Tener instalado k6

  - Tener clonado el repositorio
## 2️⃣ Ejecutar la prueba

Desde la raíz del proyecto:  
```bash
k6 run scripts/login_test.js
```
## 📊 Resultados
Al finalizar la ejecución, k6 muestra en consola:

 - TPS alcanzados

 - Tiempo de respuesta promedio y percentiles

 - Checks ejecutados

 - Estado de los thresholds

La salida de la ejecución puede guardarse en:
```bash
reports/summary.txt
```