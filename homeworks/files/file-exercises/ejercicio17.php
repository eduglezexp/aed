<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function generarCombinaciones(): string {
        $adjetivos = file("resources/adjetivos.txt");
        $animales = file("resources/animales.txt");

        $adjetivo = $adjetivos[array_rand($adjetivos)];
        $animal = $animales[array_rand($animales)];

        $combinacion = trim($adjetivo) . " " . trim($animal);
        return $combinacion;
    }

    echo generarCombinaciones();
?>