<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function guardarPuntuacion(array $juegos): void {
        $juegosOrdenados = arsort($juegos);
        foreach ($juegos as $juego => $puntuacion) {
            print("$juego: $puntuacion\n");
        }
    } 

    $juegos = ["Zelda" => 10, 
               "Sonic" => 8,
               "Mario" => 9];
    guardarPuntuacion($juegos);
?>