<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function tablaMultiplicar($numero) {
        $file = fopen("resources/tabla5.txt","r+w");
        for ($i=1; $i <= 10 ; $i++) { 
            $multiplicacion=$numero*$i;
            fwrite($file,"$numero x $i = $multiplicacion  \n");
        }
        fclose($file);
        return explode("  ", file_get_contents("resources/tabla5.txt"));
    }

    $tablas=tablaMultiplicar(5);
    foreach ($tablas as $value) {
        echo "$value \n";
    }   
?>