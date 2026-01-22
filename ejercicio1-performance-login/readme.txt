PRUEBA DE CARGA – LOGIN API

Herramienta utilizada:
- K6 v0.49.0
- Node.js v18+

Estructura del proyecto:
- data/: datos parametrizados CSV
- scripts/: scripts K6
- reports/: resultados de ejecución

Ejecución:
1. Instalar K6
2. Clonar repositorio
3. Ejecutar:
   cd scripts
   k6 run login_test.js

Escenario:
- 20 TPS constantes
- Duración: 1 minuto
- Usuarios tomados desde CSV

Validaciones:
- Tiempo de respuesta <= 1.5s (p95)
- Tasa de error < 3%
