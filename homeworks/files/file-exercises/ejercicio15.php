<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function mostrarChisteDistinto() {
        $path = "resources/chistes.txt";
        $chistes = file($path, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
        if (empty($chistes)) {
            return "No hay chistes disponibles";
        }
        $chiste = array_shift($chistes);
        $chistes[] = $chiste;
        file_put_contents($path, implode("\n", $chistes));
        return $chiste;
    }
    echo mostrarChisteDistinto()
?>