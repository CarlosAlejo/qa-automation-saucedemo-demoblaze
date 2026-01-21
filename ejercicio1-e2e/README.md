## 🚀 Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java JDK 17** (recomendado)
- **Maven 3.8+**
- **Git**
- **Google Chrome o Firefox**
- IDE recomendado: **IntelliJ IDEA**

Verifica las versiones con:

```bash
java -version
mvn -version
git --version
```

## 📥 Clonar el repositorio

 - Clona el repositorio desde GitHub:
```bash
git clone https://github.com/CarlosAlejo/qa-automation-saucedemo-demoblaze.git
```
- Ingresa al directorio del proyecto E2E:
```bash
cd qa-automation-saucedemo-demoblaze/ejercicio1-e2e
```

## ▶️ Ejecutar las pruebas automatizadas
Una vez dentro del directorio ejercicio1-e2e, ejecuta el siguiente comando:
```bash
mvn clean verify
```
Este comando:

 - Compila el proyecto
 - Ejecuta los escenarios Cucumber
 - Genera el reporte Serenity automáticamente

## 📊 Ver el reporte de Serenity
- Al finalizar la ejecución, abre el reporte en tu navegador:
```bash
target/site/serenity/index.html
```