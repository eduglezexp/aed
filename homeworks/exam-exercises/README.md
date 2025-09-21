# Code, Learn & Practice("Introducción a Php, uso de funciones")

## Número capicúa (palíndromo numérico)

Implementa una función __esCapicua(int $n): bool__ que determine si un número entero positivo es capicúa.

- Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.

> Ejemplo: `12321` → `true`

_Código:_

```php
function esCapicua(int $numero): bool {
    $numeroAlReves = strrev((string)$numero);
    return (string)$numero === $numeroAlReves;
}

function esCapicuaOtraForma(int $numero): bool {
    $original = $numero;
    $invertido = 0;
    while ($numero > 0) {
        $digito = $numero % 10;
        $invertido = $invertido * 10 + $digito;
        $numero = intdiv($numero, 10);
    }
    return $original === $invertido;
}

$numero = 12321;
if (esCapicua($numero)) {
    echo "$numero es capicua";
} else {
    echo "$numero no es capicua";
}
```

_Salida:_

```
12321 es capicua
```

## Escalera de asteriscos

Implementa una función __montañaAsteriscos(int $n, $m): void__ que imprima una escalera de asteriscos de altura `N`y el tamaño M.

- La primera fila contiene 1 asterisco, la segunda 2, y así hasta `N`, `M` veces.

_Código:_

```php
function montaniaAsteriscos(int $n, int $m): void {
    for ($i = 1; $i <= $n; $i++) {
        $line = "";
        $spaces = str_repeat(" ", $n - $i);
        $stars  = str_repeat("*", $i);

        for ($j = 0; $j < $m; $j++) {
            if ($j % 2 != 0) {
                $line .= $spaces . $stars;
            } else {
                $line .= $stars . $spaces;
            }
        }
        echo $line . "\n";
    }
}

echo "<pre>";
montaniaAsteriscos(4, 2);
echo "</pre>";
```

_Salida:_

```
*      *
**    **
***  ***
********
```

## Suma de dígitos

Implementa una función __sumaDigitos(int $n): int__ que calcule la suma de los dígitos de un número entero positivo.

- Descompón el número en dígitos y súmalos.

> Ejemplo: `2025` → `9` (2+0+2+5)

_Código:_

```php
function sumaDigitos($numero): int {
    $suma = 0;
    $temporal = $numero;

    while ($temporal > 0) {
        $digito = $temporal % 10;
        $suma += $digito;
        $temporal = intdiv($temporal, 10);
    }

    return $suma;
}

function sumaDigitosOtraForma(int $numero): int {
    return array_sum(str_split($numero));
}
    
$numero = 2025;
echo sumaDigitos($numero);
echo sumaDigitosOtraForma($numero);
```

_Salida:_

```
9
```

## Número secreto (múltiplos de 3 o 5)

Implementa una función __multiplosTresOCinco(int $n): array__ que devuelva todos los múltiplos de 3 o 5 menores que `N`.

- Además, calcula la suma de dichos múltiplos.

_Código:_

```php
function multiplosTresOCinco(int $numero): array {
    $multiplos = [];
    for($i = 1; $i < $numero; $i++) {
        if($i % 3 == 0 || $i % 5 == 0) {
            array_push($multiplos, $i);
        }
    }
    return $multiplos;
}
    
function sumarMultiplos(array $multiplos): int {
    $suma = 0;
    foreach($multiplos as $multiplo) {
    	$suma += $multiplo;
    }
    return $suma;
}
    
$numero = 10;
$multiplos = multiplosTresOCinco($numero);
foreach($multiplos as $multiplo) {
    echo $multiplo . " ";
}
echo "Suma = " . sumarMultiplos($multiplos);
```

_Salida:_

```
3 5 6 9 Suma = 23
```

## Secuencia de Collatz

Implementa una función __secuenciaCollatz(int $n): array__ que genere la secuencia de Collatz a partir de un entero positivo.

- Si el número es par → dividir entre 2.  
- Si es impar → multiplicar por 3 y sumar 1.  
- Repetir hasta llegar a 1.

_Código:_

```php
function secuenciaCollatz(int $numero): array {
    $numeros = [];
    array_push($numeros, $numero);
    do {
        if($numero % 2 == 0) {
            $numero /= 2;
            array_push($numeros, $numero);
        } else {
            $numero = $numero * 3 + 1;
            array_push($numeros, $numero);
        }
    } while ($numero != 1);
    return $numeros;
}

$numero = 6;
$numeros = secuenciaCollatz($numero);
foreach($numeros as $numero) {
    echo $numero . " ";
}
```
_Salida:_

```
6 3 10 5 16 8 4 2 1 
```
