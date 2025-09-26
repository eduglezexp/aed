<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function guardarCanciones(array $canciones): void {
        $file = fopen("resources/canciones.txt", "w");
        foreach ($canciones as $cancion) {
            fwrite($file, "$cancion\n");
        }
    }

    function obtenerCancionRandom(): string {
        $file = file_get_contents("resources/canciones.txt");
        $canciones = explode("\n", $file);
        $index = array_rand($canciones);
        return $canciones[$index];
    }

    $canciones = ["Hysteria", "Bohemian Rhapsody", "Africa"];
    guardarCanciones($canciones);
    echo obtenerCancionRandom();
?>