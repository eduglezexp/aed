<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */
    
    function leerFichero(): array {
        try {
            $path = "resources/texto.txt";
            if (!file_exists($path)) {
                throw new Exception("El fichero no existe");
            }
            $frases = file($path, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
            return $frases;
        } catch (Exception $e) {
            echo "Excepcion: ",  $e->getMessage(), "\n";
            die();
        }
    }

    function escribirArchivos() {
        try {
            $path = "resources/estadisticas.csv";
            if (!file_exists($path)) {
                throw new Exception("El fichero no existe");
            }
            $frases = fopen($path, "w");
            return $frases;
        } catch (Exception $e) {
            echo "Excepcion: ",  $e->getMessage(), "\n";
            die();
        }
    }

    function contarPalabras() {
        $frases = leerFichero();
        $estadisticas = escribirArchivos();
        foreach ($frases as $frase) {
            $frase = strtolower($frase);
            $fraseSinPuntuacion = preg_replace("/[[:punct:]]/", " ", $frase);
            $palabras = preg_split('/\s+/', $fraseSinPuntuacion, -1, PREG_SPLIT_NO_EMPTY);
            $frecuencias = array_count_values($palabras);
            foreach ($frecuencias as $palabra => $frecuencia) {
                fwrite($estadisticas, "$palabra,$frecuencia\n");
            }
            fclose($estadisticas);
        }
    }

    contarPalabras();
?>