# Estudio de Caja Blanca — `Ejercicio1.java`

## Descripción del enfoque

El estudio de caja blanca analiza la **estructura interna del código**, examinando los caminos lógicos, condiciones, y ramas de ejecución. A diferencia de la caja negra, aquí se tiene acceso y conocimiento completo del código fuente.

---

## Grafo de flujo de control
```
        [N1] INICIO
          |
          v
        [N2] Generar num1 y num2
          |
          v
        [N3] num1 > num2?
         / \
       SI   NO
       /      \
     [N4]    [N5] num2 > num1?
  "primer"    / \
  mayor     SI   NO
      \      /     \
      [N6]  [N7]  [N8]
   "segundo" "iguales"
        \      |     /
         \     |    /
          [N9] FIN
```

### Nodos identificados

| Nodo | Descripción |
|------|-------------|
| N1 | Inicio del programa |
| N2 | Generación de `num1` y `num2` |
| N3 | Condición `if`: `num1 > num2` |
| N4 | Salida: "El primer numero es mayor." |
| N5 | Condición `else if`: `num2 > num1` |
| N6 | Salida: "El segundo numero es mayor." |
| N7 | Salida: "Los dos números son iguales" |
| N8 | Fin del programa |

### Aristas identificadas

| Arista | Origen → Destino | Condición |
|--------|-----------------|-----------|
| A1 | N1 → N2 | — |
| A2 | N2 → N3 | — |
| A3 | N3 → N4 | `num1 > num2` = true |
| A4 | N3 → N5 | `num1 > num2` = false |
| A5 | N5 → N6 | `num2 > num1` = true |
| A6 | N5 → N7 | `num2 > num1` = false |
| A7 | N4 → N8 | — |
| A8 | N6 → N8 | — |
| A9 | N7 → N8 | — |

---

## Complejidad Ciclomática

### Fórmula
```
CC = E - N + 2
```

| Elemento | Valor |
|----------|:-----:|
| Aristas (E) | 9 |
| Nodos (N) | 8 |
| **CC = 9 - 8 + 2** | **3** |

> Una CC de **3** indica baja complejidad. Umbral recomendable: CC ≤ 10.

---

## Caminos independientes

### Camino 1 — num1 mayor
```
N1 → N2 → N3 → N4 → N8
```

| Paso | Nodo | Acción |
|------|------|--------|
| 1 | N1 | Inicio |
| 2 | N2 | Genera num1=70, num2=30 |
| 3 | N3 | `70 > 30` = **true** → entra al `if` |
| 4 | N4 | Imprime "El primer numero es mayor." |
| 5 | N8 | Fin |

### Camino 2 — num2 mayor
```
N1 → N2 → N3 → N5 → N6 → N8
```

| Paso | Nodo | Acción |
|------|------|--------|
| 1 | N1 | Inicio |
| 2 | N2 | Genera num1=15, num2=80 |
| 3 | N3 | `15 > 80` = **false** → pasa al `else if` |
| 4 | N5 | `80 > 15` = **true** → entra al `else if` |
| 5 | N6 | Imprime "El segundo numero es mayor." |
| 6 | N8 | Fin |

### Camino 3 — ambos iguales
```
N1 → N2 → N3 → N5 → N7 → N8
```

| Paso | Nodo | Acción |
|------|------|--------|
| 1 | N1 | Inicio |
| 2 | N2 | Genera num1=45, num2=45 |
| 3 | N3 | `45 > 45` = **false** → pasa al `else if` |
| 4 | N5 | `45 > 45` = **false** → entra al `else` |
| 5 | N7 | Imprime "Los dos números son iguales" |
| 6 | N8 | Fin |

---

## Cobertura de sentencias (Statement Coverage)

| Sentencia | Camino que la cubre |
|-----------|-------------------|
| `int num1 = ...` | C1, C2 o C3 |
| `int num2 = ...` | C1, C2 o C3 |
| `if(num1 > num2)` | C1, C2 o C3 |
| `println("El primer numero...")` | **C1** |
| `else if(num2 > num1)` | C2 o C3 |
| `println("El segundo numero...")` | **C2** |
| `println("Los dos números...")` | **C3** |

> Con los 3 caminos se alcanza **cobertura de sentencias del 100%**.

---

## Cobertura de ramas (Branch Coverage)

| Decisión | Rama TRUE | Rama FALSE |
|----------|:---------:|:----------:|
| `num1 > num2` | C1 ✅ | C2, C3 ✅ |
| `num2 > num1` | C2 ✅ | C3 ✅ |

> Con los 3 caminos se alcanza **cobertura de ramas del 100%**.

---

## Cobertura de condiciones MC/DC

| Caso | `num1 > num2` | `num2 > num1` | Camino ejecutado |
|------|:-------------:|:-------------:|-----------------|
| TC-01 | ✅ true | — *(no se evalúa)* | C1 — rama `if` |
| TC-02 | ❌ false | ✅ true | C2 — rama `else if` |
| TC-03 | ❌ false | ❌ false | C3 — rama `else` |

> Con 3 casos se satisface la cobertura **MC/DC al 100%**.

---

## Resumen de casos de prueba

| ID | Camino | num1 | num2 | Condición clave | Salida esperada | Cobertura |
|----|--------|:----:|:----:|-----------------|-----------------|:---------:|
| CB-01 | C1 | 70 | 30 | `num1 > num2` = true | "El primer numero es mayor." | Sentencias, Ramas, MC/DC |
| CB-02 | C2 | 15 | 80 | `num2 > num1` = true | "El segundo numero es mayor." | Sentencias, Ramas, MC/DC |
| CB-03 | C3 | 45 | 45 | Ambas condiciones false | "Los dos números son iguales" | Sentencias, Ramas, MC/DC |

---

## Métricas de calidad

| Métrica | Valor | Interpretación |
|---------|:-----:|----------------|
| Complejidad Ciclomática (CC) | 3 | Baja — código simple y mantenible |
| Caminos independientes | 3 | Todos cubiertos con 3 casos de prueba |
| Cobertura de sentencias | 100% | ✅ Todas las líneas ejecutadas |
| Cobertura de ramas | 100% | ✅ Todas las ramas recorridas |
| Cobertura MC/DC | 100% | ✅ Todas las condiciones verificadas |
| Bucles | 0 | No aplica cobertura de bucles |
| Bugs estructurales detectados | 0 | ✅ Código correcto |

---

## Conclusiones

El código presenta una estructura lineal sencilla con una única decisión anidada (`if / else if / else`). La complejidad ciclomática de **3** indica que el programa es fácil de probar exhaustivamente, requiriendo únicamente **3 casos de prueba** para alcanzar cobertura total de sentencias, ramas y condiciones MC/DC.

No se detectaron caminos inalcanzables (*dead code*), bucles infinitos, ni condiciones redundantes. La lógica interna es coherente y cada camino produce una salida distinta y correcta.