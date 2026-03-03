# Estudio de Caja Negra — `Ejercicio1.java`

## Descripción funcional

El programa genera dos números enteros aleatorios en el rango **[0, 99]** y determina cuál de los dos es mayor, o si ambos son iguales. El usuario no introduce ningún dato; las entradas son generadas internamente por el sistema.

---
## Particiones de equivalencia

Se identifican **3 clases de equivalencia** válidas basadas en la relación entre num1 y num2:

| Clase | Condición | Representativo |
|-------|-----------|---------------|
| CE-1 | num1 > num2 | num1=70, num2=30 |
| CE-2 | num2 > num1 | num1=15, num2=80 |
| CE-3 | num1 == num2 | num1=45, num2=45 |

---   
## Análisis de valores límite

Los valores extremos del rango `[0, 99]` son 0 y 99.

| Caso | num1 | num2 | Salida esperada |
|------|:----:|:----:|-----------------|
| Mínimo == Mínimo | 0 | 0 | "Los dos números son iguales" |
| Máximo == Máximo | 99 | 99 | "Los dos números son iguales" |
| Mínimo vs Máximo | 0 | 99 | "El segundo numero es mayor." |
| Máximo vs Mínimo | 99 | 0 | "El primer numero es mayor." |
| Mínimo vs Mínimo+1 | 0 | 1 | "El segundo numero es mayor." |
| Máximo-1 vs Máximo | 98 | 99 | "El segundo numero es mayor." |

---
## Casos de prueba

| ID | Escenario | num1 | num2 | Salida esperada | Resultado |
|----|-----------|:----:|:----:|-----------------|:---------:|
| CP-01 | num1 mayor que num2 | 70 | 30 | "El primer numero es mayor." | ✅ |
| CP-02 | num2 mayor que num1 | 15 | 80 | "El segundo numero es mayor." | ✅ |
| CP-03 | Ambos iguales (valor medio) | 45 | 45 | "Los dos números son iguales" | ✅ |
| CP-04 | Límite inferior — ambos en 0 | 0 | 0 | "Los dos números son iguales" | ✅ |
| CP-05 | Límite superior — ambos en 99 | 99 | 99 | "Los dos números son iguales" | ✅ |
| CP-06 | Mínimo vs Máximo | 0 | 99 | "El segundo numero es mayor." | ✅ |
| CP-07 | Máximo vs Mínimo | 99 | 0 | "El primer numero es mayor." | ✅ |
| CP-08 | Diferencia de 1 (num2 mayor) | 50 | 51 | "El segundo numero es mayor." | ✅ |
| CP-09 | Diferencia de 1 (num1 mayor) | 51 | 50 | "El primer numero es mayor." | ✅ |

---
## Tabla de decisión

| Regla | num1 > num2 | num2 > num1 | num1 == num2 | Salida |
|-------|:-----------:|:-----------:|:------------:|--------|
| R1 | ✅ | ❌ | ❌ | "El primer numero es mayor." |
| R2 | ❌ | ✅ | ❌ | "El segundo numero es mayor." |
| R3 | ❌ | ❌ | ✅ | "Los dos números son iguales" |
