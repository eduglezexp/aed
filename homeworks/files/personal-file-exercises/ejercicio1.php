<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function leerFichero(): array {
        $path = "resources/alumnos.csv";
        if (!file_exists($path)) {
            throw new Exception("The file does not exits");
        }
        $datos = [];
        if (($handle = fopen($path, "r")) !== false) {
            while (($fila = fgetcsv($handle, 0, ",")) !== false) {
                $datos[] = $fila;
            }
            fclose($handle);
        }
        return $datos;
    }

    function escribirFichero($aprobados) {
        $path = "resources/aprobados.csv";
        $file = fopen($path, "w");
        fputcsv($file, ["nombre", "nota"]);
        foreach ($aprobados as [$nombre, $nota]) {
            fputcsv($file, [$nombre, $nota]);
        }
        fclose($file);
    }

    function encontrarAprobados() {
        $alumnos = leerFichero();
        $aprobados = [];
        foreach ($alumnos as [$nombre, $nota]) {
            if ((float)$nota >= 5) {
                $aprobados[] = [$nombre, $nota];
            }
        }
        escribirFichero($aprobados);
    }

    encontrarAprobados();
?>