# 🧪 Demoblaze API Automation Tests – Karate

Este proyecto contiene pruebas automatizadas de servicios REST para la plataforma **Demoblaze**, específicamente para los servicios de **Signup** y **Login**, utilizando **Karate DSL** como herramienta principal.

El objetivo es validar el comportamiento de los endpoints expuestos por la API y documentar los hallazgos obtenidos durante la ejecución de las pruebas.

---

## 📌 Servicios evaluados

- **Signup**
    - `POST https://api.demoblaze.com/signup`
- **Login**
    - `POST https://api.demoblaze.com/login`

---

## ✅ Casos de prueba implementados

### Signup
1. Crear un nuevo usuario
2. Intentar crear un usuario ya existente

### Login
3. Login con usuario y password correctos
4. Login con usuario y password incorrectos

Cada escenario captura y muestra la respuesta del servicio para su análisis.

---

## 🛠️ Herramientas utilizadas

- **Java 11+**
- **Maven**
- **Karate DSL**
- **JUnit 5**

---

## 📁 Estructura del proyecto

```text
demoblaze-api-test
│
├── pom.xml
├── README.md
├── conclusiones.txt
│
└── src
    └── test
        ├── java
        │   └── runners
        │       └── TestRunner.java
        │
        └── resources
            ├── karate-config.js
            └── features
                ├── signup.feature
                └── login.feature
```
## ⚙️ Configuración del proyecto

El archivo karate-config.js define la URL base de la API:
```bash
function fn() {
  var config = {
    baseUrl: 'https://api.demoblaze.com'
  };
  return config;
}
```
## ▶️ Ejecución de las pruebas
## 1️⃣ Clonar el repositorio
```bash
    git clone https://github.com/<tu-usuario>/demoblaze-api-test.git
```
## 2️⃣ Ingresar al proyecto
```bash
    cd demoblaze-api-test
```
## 3️⃣ Ejecutar las pruebas
```bash
    mvn test
``` 
## 📊 Reportes

Karate genera automáticamente reportes en formato HTML.

## 📍 Ruta del reporte principal:
target/karate-reports/karate-summary.html