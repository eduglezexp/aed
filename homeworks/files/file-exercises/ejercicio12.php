<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function guardarPuntuacion(array $juegos): void {
        $path = "resources/ranking.txt";
        $file = fopen($path, "w");
        foreach ($juegos as $juego => $puntuacion) {
            fwrite($file, "$juego: $puntuacion\n");
        }
        fclose($file);
    } 

    function leerListaJuegos(): void {
        $path = "resources/ranking.txt";
        $lineas = file($path, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
        $juegos = [];
        foreach ($lineas as $linea) {
            [$juego, $puntuacion] = explode(": ", $linea);
            $juegos[$juego] = $puntuacion;
        }
        arsort($juegos);
        $top = array_slice($juegos, 0, 3, true);
        foreach ($top as $juego => $puntuacion) {
            echo "$juego: $puntuacion\n";
        }
    }

    $juegos = ["Zelda" => 10, 
               "Sonic" => 8,
               "Mario" => 9,
               "For Honor" => 9];
    guardarPuntuacion($juegos);
    leerListaJuegos();
?>