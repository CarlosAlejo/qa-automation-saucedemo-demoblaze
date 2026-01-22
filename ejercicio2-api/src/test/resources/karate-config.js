function fn() {
    var config = {
        baseUrl: 'https://api.demoblaze.com',
        username: 'testuser_' + Math.floor(Math.random() * 10000),
        password: 'TestPass123!',
        existingUser: 'existing_user',
        existingPass: 'ExistingPass123!'
    };

    // Para pruebas de usuario existente, puedes ajustar estos valores
    // config.existingUser = 'tu_usuario_existente';
    // config.existingPass = 'tu_password_existente';

    return config;
}