<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function leerJson(){
        $path = "resources/datos.json"; 
        $file = fopen($path, "r");
        $datosJson = file_get_contents($path);
        $datos = json_decode($datosJson);
        fclose($file);
        print_r($datos);
    }

    leerJson();
?>