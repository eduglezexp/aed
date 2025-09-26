<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    $datos=file_get_contents("resources/datos_numericos.txt");
    echo $datos;
    $datos=explode(",",$datos);

    echo "\n" . array_sum($datos);
?>