<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function guardarPuntuacion(array $juegos): void {
        $path = "resources/ranking.txt";
        $file = fopen($path, "w");
        arsort($juegos);
        foreach ($variable as $key => $value) {
            
        }

        $contador=3;
        foreach ($juegos as $juego => $puntuacion) {
            print("$juego: $puntuacion\n");
            $contador--;
            if($contador<=0){
                break;
            }
        }

    } 

    $juegos = ["Zelda" => 10, 
               "Sonic" => 8,
               "Mario" => 9,
               "For Honor" => 9];
    guardarPuntuacion($juegos);
?>