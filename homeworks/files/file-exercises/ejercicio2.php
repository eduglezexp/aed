<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    $file = fopen("resources/numeros.txt", "w");
    for ($i=1; $i <= 10; $i++) { 
        fwrite($file, "$i\n");
    }
    fclose($file);
?>