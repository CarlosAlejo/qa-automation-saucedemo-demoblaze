INSTRUCCIONES DE EJECUCIÓN PASO A PASO

1. PREREQUISITOS:
   - Java JDK 11 o superior instalado
   - Maven 3.6.0 o superior instalado
   - Git instalado (para clonar el repositorio)

2. CONFIGURACIÓN DEL PROYECTO:

   Paso 1: Clonar el repositorio
   git clone <url-del-repositorio>
   cd demoblaze-api-tests

   Paso 2: Verificar la estructura del proyecto
   Asegúrate de tener la siguiente estructura:
   - src/test/java/demoblaze/APITestRunner.java
   - src/test/resources/demoblaze/demoblaze.feature
   - src/test/resources/demoblaze/karate-config.js
   - pom.xml
   - README.txt
   - conclusiones.txt

3. EJECUCIÓN DE LAS PRUEBAS:

   Opción A: Ejecutar todas las pruebas con Maven
   mvn test -Dtest=APITestRunner

   Opción B: Ejecutar pruebas específicas
   mvn test -Dtest=APITestRunner -Dkarate.options="--tags @signup"

   Opción C: Generar reportes HTML detallados
   mvn test -Dtest=APITestRunner -DargLine="-Dkarate.env=html"

4. VISUALIZACIÓN DE RESULTADOS:

   Los reportes se generan en: target/karate-reports/
   Abrir en navegador: target/karate-reports/karate-summary.html

5. CONFIGURACIÓN ADICIONAL:

   Para pruebas de usuario existente:
   - Editar el archivo karate-config.js
   - Modificar las variables existingUser y existingPass
   - Usar credenciales de un usuario previamente registrado

6. EJECUCIÓN PARALELA (opcional):
   mvn test -Dtest=APITestRunner -Dkarate.options="--threads 2"

NOTAS:
- Las pruebas generan usuarios aleatorios para evitar conflictos
- Se recomienda ejecutar en un entorno de pruebas
- Los servicios API de Demoblaze pueden tener limitaciones de tasa