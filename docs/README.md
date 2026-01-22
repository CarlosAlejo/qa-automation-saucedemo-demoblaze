## 📊 README - Informe de Prueba de Carga
Descripción del Proyecto
Este repositorio contiene los resultados y análisis de una prueba de carga realizada el 24 de abril de 2025 en la aplicación "App Transaction Balance". La prueba fue ejecutada utilizando k6 como herramienta de testing de performance.
## 📁 Estructura del Repositorio
```text
├── InformeResultados.doc         # Informe técnico completo en formato Word
├── textSummary.txt               # Datos crudos de resultados de la prueba
├── grafico_vus_throughput.png    # Gráfico de relación VUs vs. peticiones/segundo
└── README.md                     # Este archivo
```
##  🔍 Objetivo de la Prueba

Evaluar el comportamiento del sistema bajo carga sostenida para:

Determinar la capacidad máxima de usuarios concurrentes

Identificar cuellos de botella y puntos de mejora

Validar la estabilidad del servicio en condiciones de estrés

Establecer métricas de rendimiento de referencia

## 📈 Resultados Clave Resumidos
 Categoría   | Métrica                  | Valor             | Estado        
-------------|--------------------------|-------------------|---------------
 Rendimiento | Tasa de éxito            | 97.55%            | ✅Aceptable  
             | VUs máximos              | 140               | ✅ Alcanzado
             | Throughput pico          | 82.6 req/s        | ✅ Alcanzado       
 Calidad     | Tiempo respuesta (p95)   | 1.57 segundos     |⚠️ Necesita mejora
             | Variabilidad             | 191ms - 29.93s    |⚠️ Inconsistente      
 Estabilidad | Errores 5xx              | 5,987 (2.16%)     | ❌ Crítico
             | Tasa de fallo total      | 2.44%             | ❌ Elevada                                        