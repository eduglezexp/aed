<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function generarFrase(string $plantillaPath, array $diccionarios): string {
        $plantilla = file_get_contents($plantillaPath);

        foreach ($diccionarios as $clave => $archivo) {
            $palabras = file($archivo, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
            if (!empty($palabras)) {
                $aleatoria = $palabras[array_rand($palabras)];
                $plantilla = str_replace("[$clave]", $aleatoria, $plantilla);
            }
        }

        return $plantilla;
    }

    $diccionarios = [
        "animal" => "resources/ejercicio20/animales.txt",
        "lugar"  => "resources/ejercicio20/lugares.txt",
        "comida" => "resources/ejercicio20/comidas.txt"
    ];

    echo generarFrase("resources/ejercicio20/plantilla.txt", $diccionarios) . "\n";
?>