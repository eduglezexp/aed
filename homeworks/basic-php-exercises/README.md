# Bloque 1: Conceptos básicos (introducción a php)

### 1️⃣ Variables y Condicionales

1. **Mayor de dos números**  
   Pide dos números y muestra cuál es mayor o si son iguales.

- _Código:_

    ```php
    function obtenerMayorDosNumeros($numero1, $numero2) {
        if($numero1 > $numero2) {
            return "El numero 1 es mayor que el numero 2";
        }
        if($numero1 == $numero2) {
            return "El numero 1 y 2 son iguales";
        }
        return "El numero 2 es mayor que el numero 1";
    }
        
    $numero1 = 21;
    $numero2 = 16;
    echo obtenerMayorDosNumeros($numero1, $numero2);
    ```

- _Salida:_

    ```
    El numero 1 es mayor que el numero 2
    ```

</br>

2. **Edad permitida**  
   Pide la edad de una persona y muestra:  
   - `"Eres menor de edad"` si es < 18.  
   - `"Eres mayor de edad"` si es ≥ 18.  

- _Código:_

    ```php
    function esMayorEdad($edad) {
      	if($edad >= 18) {
          	return "Eres mayor de edad";
      	}
        if($edad >= 0) {
    		return "Eres menor de edad";
     	}
    	return "Debe ser un numero positivo";
    }
    
    $edad = 21;
	echo esMayorEdad($edad);
    ```

- _Salida:_

    ```
    Eres mayor de edad
    ```

</br>

3. **Positivo, negativo o cero**  
   Comprueba si un número almacenado en una variable es positivo, negativo o cero.  

- _Código:_

    ```php
    function esMayorEdad($numero) {
      	if($numero > 0) {
          	return "El numero es positivo";
      	}
        if($numero == 0) {
    		return "El numero es cero";
     	}
    	return "El numero es negativo";
    }
    
    $numero = 21;
	echo esMayorEdad($numero);
    ```

- _Salida:_

    ```
    El numero es positivo
    ```

</br>

4. **Nota final**  
   Pide la nota de un alumno y muestra:  
   - `"Suspenso"` (< 5), `"Aprobado"` (5–6), `"Notable"` (7–8), `"Sobresaliente"` (9–10).

- _Código:_

    ```php
    function saberNotaFinal($nota) {
        if ($nota < 0 || $nota > 10) {
            return "Nota no valida";
        }

        switch (true) {
            case ($nota < 5):
                return "Suspenso";
            case ($nota <= 6):
                return "Aprobado";
            case ($nota <= 8):
                return "Notable";
            case ($nota <= 10):
                return "Sobresaliente";
            }
    }

    $nota = 8;
    echo saberNotaFinal($nota);
    ```

- _Salida:_

    ```
    Notable
    ```  

---

</br>

### 2️⃣ Bucles (for, while, foreach)

5. **Contar del 1 al 100**  
   Muestra los números del 1 al 100 en pantalla.  

- _Código:_

    ```php
    for ($i = 1; $i <= 100; $i++) {
        echo $i . PHP_EOL;
    }
    ```

- _Salida:_

    ```
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
    ```

</br>

6. **Suma acumulada**  
   Calcula la suma de los números del 1 al 50 usando un bucle.

- _Código:_

    ```php
    for ($i = 1; $i <= 50; $i++) {
        $suma += $i;
        echo $suma . PHP_EOL;
    }
    ```

- _Salida:_

    ```
    1 3 6 10 15 21 28 36 45 55 66 78 91 105 120 136 153 171 190 210 231 253 276 300 325 351 378 406 435 465 496 528 561 595 630 666 703 741 780 820 861 903 946 990 1035 1081 1128 1176 1225 1275
    ```

</br>

7. **Tabla de multiplicar**  
   Pide un número y genera su tabla de multiplicar del 1 al 10.

- _Código:_

    ```php
    function tablaMultiplicar($numero) {
    	for($i = 1; $i <= 10; $i++) {
        	$multiplicacion = $numero * $i;
        	echo $multiplicacion . PHP_EOL;
        }
    }
    
    $numero = 3;
    echo tablaMultiplicar($numero);
    ```

- _Salida:_

    ```
    3 6 9 12 15 18 21 24 27 30
    ```  

</br>

8. **Números pares**  
   Muestra todos los números pares entre 1 y 50.  

- _Código:_

    ```php
    for($i = 1; $i <= 50; $i++) {
        if($i % 2 == 0) {
            echo $i . PHP_EOL;
        }
    }
    ```

- _Salida:_

    ```
    2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
    ```

</br>

9. **Cuenta atrás**  
   Haz un bucle que cuente de 10 a 1 y luego muestre `"¡Fin!"`.  

- _Código:_

    ```php
    for($i = 10; $i >= 1; $i--) {
        echo $i . PHP_EOL;
    }
    echo "¡Fin!";
    ```

- _Salida:_

    ```
    10 9 8 7 6 5 4 3 2 1 ¡Fin!
    ```  

</br>

10. **Factorial**  
    Calcula el factorial de un número introducido (ejemplo: `5! = 120`).  

- _Código:_

    ```php
    function calcularFactorial($numero) {
    	if ($numero < 0) {
            return "El numero no es valido";
        }

        $factorial = 1;
        for ($i = 1; $i <= $numero; $i++) {
            $factorial *= $i;
        }

        return $factorial;
    }
    
    $numero = 5;
    echo calcularFactorial($numero);
    ```

- _Salida:_

    ```
    120
    ```  

</br>

---

### 3️⃣ Combinando Condicionales y Bucles

11. **Números primos**  
    Escribe un algoritmo que muestre los números primos entre 1 y 50. 

- _Código:_

    ```php
    function esPrimo($numero) {
    	if ($numero < 2) return false;

    	for ($i = 2; $i <= sqrt($numero); $i++) {
        	if ($numero % $i == 0) {
            	return false;
        	}
    	}
    	return true;
    }

    for ($i = 1; $i <= 50; $i++) {
        if (esPrimo($i)) {
            echo $i . PHP_EOL;
        }
    }
    ```

- _Salida:_

    ```
    2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
    ```  

</br> 

12. **Fibonacci**  
    Genera los primeros 20 términos de la secuencia de Fibonacci.  

- _Código:_

    ```php
    $primero = 0;
    $segundo = 1;

    echo $primero . PHP_EOL . $segundo . PHP_EOL;

    for ($i = 3; $i <= 20; $i++) {
        $siguiente = $primero + $segundo;
        echo $siguiente . PHP_EOL;
        $primero = $segundo;
        $segundo = $siguiente;
    }
    ```

- _Salida:_

    ```
    0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
    ```  

</br>

13. **Múltiplos de un número**  
    Pide un número `n` y muestra sus múltiplos hasta 100.

- _Código:_

    ```php
    function multiplosNumero($numero) {
    	for ($i = $numero; $i <= 100; $i += $numero) {
    		echo $i . " ";
		}
    }
    
    $numero = 3;
    echo multiplosNumero($numero);
    ```

- _Salida:_

    ```
    3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87 90 93 96 99
    ```  

</br>

14. **Suma de pares e impares**  
    Calcula la suma de los números pares e impares entre 1 y 100 por separado.

- _Código:_

    ```php
    $sumaPares = 0;
    $sumaImpares = 0;
    
    for ($i = 1; $i <= 100; $i++) {
        if ($i % 2 == 0) {
            $sumaPares += $i;
        } else {
            $sumaImpares += $i;
        }
    }

    echo "Suma de numeros pares: $sumaPares" . PHP_EOL;
    echo "Suma de numeros impares: $sumaImpares";
    ```

- _Salida:_

    ```
    Suma de numeros pares: 2550 Suma de numeros impares: 2500
    ```  

</br>

15. **Adivinar número**  
    Genera un número aleatorio entre 1 y 20.  
    Pide al usuario que lo adivine y usa un bucle con condicionales para dar pistas: `"Mayor"` o `"Menor"`.

- _Código:_

    ```php
    $numeroSecreto = rand(1, 20);
    
    echo "Adivina el número entre 1 y 20:" . PHP_EOL;

    do {
        $intento = (int)readline("Introduce tu intento: ");

        if ($intento < $numeroSecreto) {
            echo "Mayor" . PHP_EOL;
        } elseif ($intento > $numeroSecreto) {
            echo "Menor" . PHP_EOL;
        } else {
            echo "¡Correcto! El número era $numeroSecreto" . PHP_EOL;
        }
    } while ($intento != $numeroSecreto);
    ```

- _Salida:_

    ```
    
    ```  

</br>

---

### 4️⃣ Construcción de Algorítmicos

16. **Número perfecto**  
    Comprueba si un número es perfecto (la suma de sus divisores propios es igual al número).

- _Código:_

    ```<?php

    ```

- _Salida:_

    ```
    
    ```  

</br>  

17. **Invertir número**  
    Escribe un algoritmo que invierta los dígitos de un número (ejemplo: `123 → 321`).  

- _Código:_

    ```<?php

    ```

- _Salida:_

    ```
    
    ```  

</br>

18. **Palíndromo**  
    Comprueba si una palabra almacenada en una variable es palíndroma.

- _Código:_

    ```<?php

    ```

- _Salida:_

    ```
    
    ```  

</br>  

19. **Máximo común divisor (MCD)**  
    Escribe un algoritmo que calcule el MCD de dos números.

- _Código:_

    ```<?php

    ```

- _Salida:_

    ```
    
    ```  

</br>

20. **Triángulo de asteriscos**  
    Muestra en pantalla un triángulo de altura `n` usando `*`.  
    Ejemplo con `n = 5`:  

- _Código:_

    ```<?php

    ```

- _Salida:_

    ```
    *
    **
    ***
    ****
    *****
    ```  

</br>
