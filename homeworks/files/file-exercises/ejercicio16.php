<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function elegirPalabra(): string {
        $path = "resources/palabras.txt";
        $palabras = file($path, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
        return $palabras[array_rand($palabras)];
    }

    function ocultarPalabra(string $palabra): string {
        $longitud = strlen($palabra);
        $posiciones = array_rand(range(0, $longitud - 1), 2);
        $resultado = str_repeat("_", $longitud);

        $resultado[$posiciones[0]] = $palabra[$posiciones[0]];
        $resultado[$posiciones[1]] = $palabra[$posiciones[1]];

        return $resultado;
    }

    $palabra = elegirPalabra();
    $oculta = ocultarPalabra($palabra);
    echo "Adivina la palabra: $oculta\n";
    $respuesta = readline("Tu respuesta: ");

    if (strtolower($respuesta) === strtolower($palabra)) {
        echo "¡Correcto! La palabra era '$palabra'\n";
    } else {
        echo "Incorrecto. La palabra era '$palabra'\n";
    }
?>