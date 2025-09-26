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
        $juegos = explode("\n", file_get_contents($path));
        sort($juegos);
        for ($i=0; $i < 3; $i++) { 
            print("$juegos[$i]\n");
        }
    }

    $juegos = ["Zelda" => 10, 
               "Sonic" => 8,
               "Mario" => 9,
               "For Honor" => 9];
    guardarPuntuacion($juegos);
    leerListaJuegos();
?>