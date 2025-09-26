<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function mostrarChisteDistinto() {
        $file = file_get_contents("resources/chistes.txt");
        $canciones = explode("\n", $file);
        $index = array_rand($canciones);
        unset($index);
        return $canciones[$index];
    }

    echo mostrarChisteDistinto()
?>