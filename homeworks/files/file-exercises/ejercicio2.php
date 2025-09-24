<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    try {
        $file = fopen("resources/numeros.txt", "w");
        if (!$file) {
            throw new Exception("Archivo no encontrado");
        }
    } catch (Exception $e) {
        echo "Error: " . $e->getMessage();
    }
?>