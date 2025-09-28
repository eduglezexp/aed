<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */
    
    function leerFichero(): array {
        $path = "resources/texto.txt";
        if (!file_exists($path)) {
            throw new Exception("El fichero no existe");
        }
        return file($path, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
    }

    function escribirArchivos(array $estadisticas) {
        $path = "resources/estadisticas.csv";
        $file = fopen($path, "w");
        if (!$file) {
            throw new Exception("No se pudo abrir el fichero para escritura");
        }
        fputcsv($file, ["palabra", "frecuencia"]);
        foreach ($estadisticas as $palabra => $frecuencia) {
            fputcsv($file, [$palabra, $frecuencia]);
        }
        fclose($file);
    }

    function contarPalabras() {
        $frases = leerFichero();
        $contador = [];
        foreach ($frases as $frase) {
            $frase = strtolower($frase);
            $fraseSinPuntuacion = preg_replace("/[[:punct:]]/", " ", $frase);
            $palabras = preg_split("/\s+/", $fraseSinPuntuacion, -1, PREG_SPLIT_NO_EMPTY);
            foreach ($palabras as $palabra) {
                if (isset($contador[$palabra])) {
                    $contador[$palabra]++;
                } else {
                    $contador[$palabra] = 1;
                }
            }
        }
        escribirArchivos($contador);
    }

    try {
        contarPalabras();
        echo "Archivo 'estadisticas.csv' generado correctamente.\n";
    } catch (Exception $e) {
        echo "Excepción: ", $e->getMessage(), "\n";
    }
?>
