# PRUEBAS DE CAJA NEGRA Y CAJA BLANCA

# Descripción del programa

El programa solicita números enteros al usuario hasta que se introduce 0.  
Al finalizar, calcula:

- La media de los números positivos.
- La media de los números negativos.

---

# PRUEBAS DE CAJA NEGRA

Las pruebas de caja negra se basan únicamente en las entradas y salidas del programa, sin analizar su código interno.

---

## Caso 1 – Solo números positivos

**Entrada:**
5  
10  
15  
0  

**Salida esperada:**
Media de los números positivos introducidos: 10  

**Explicación:**  
(5 + 10 + 15) / 3 = 10  

---

## Caso 2 – Solo números negativos

**Entrada:**
-3  
-6  
-9  
0  

**Salida esperada:**
Media de los números negativos introducidos: -6  

**Explicación:**  
(-3 + -6 + -9) / 3 = -6  

---

## Caso 3 – Mezcla de positivos y negativos

**Entrada:**
4  
-2  
6  
-4  
0  

**Salida esperada:**
Media de los números positivos introducidos: 5  
Media de los números negativos introducidos: -3  

**Explicación:**  
Positivos: (4 + 6) / 2 = 5  
Negativos: (-2 + -4) / 2 = -3  

---

## Caso 4 – Solo 0

**Entrada:**
0  

**Salida esperada:**
No se muestra ninguna media.

**Explicación:**  
No se introducen números positivos ni negativos.

---

## Caso 5 – Un solo número positivo

**Entrada:**
8  
0  

**Salida esperada:**
Media de los números positivos introducidos: 8  

---

## Caso 6 – Detección de error en división

**Entrada:**
1  
2  
0  

**Salida real del programa:**
Media de los números positivos introducidos: 1.0  

**Salida correcta matemática:**
1.5  

**Problema detectado:**  
Se realiza división entera (int / int) antes de asignar el resultado a float.

---

# PRUEBAS DE CAJA BLANCA

Las pruebas de caja blanca analizan la estructura interna del código y sus caminos de ejecución.

---

## Análisis de caminos

### Camino 1 – No entra en el bucle
Entrada: 0  
- La condición (num != 0) es falsa.
- No se ejecuta el while.
- No se calculan medias.


---

### Camino 2 – Entra con número positivo
- Se cumple (num > 0).
- Se incrementa cont_pos.
- Se acumula en suma_pos.


---

### Camino 3 – Entra con número negativo
- No se cumple (num > 0).
- Se ejecuta el else.
- Se incrementa cont_neg.
- Se acumula en suma_neg.

---

### Camino 4 – Se ejecuta cálculo de media positiva
Condición: (cont_pos != 0)

---

### Camino 5 – Se ejecuta cálculo de media negativa
Condición: (cont_neg != 0)

---