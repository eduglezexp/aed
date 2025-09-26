<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function guardarLeerNombres(array $nombres): string {
        $file = fopen("resources/nombres.txt", "w+r");
        foreach ($nombres as $nombre) { 
            fwrite($file, "$nombre\n");
        }
        $nombres = file_get_contents("resources/nombres.txt");
        return $nombres;
    }

    $nombres = ["Ana","Luis","Marta","Carlos","Julia"];
    echo guardarLeerNombres($nombres);
?>