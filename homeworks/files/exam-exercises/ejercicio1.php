<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function leerFichero(): array {
        try {
            $path = "resources/ops.csv";
            if (!file_exists($path)) {
                throw new Exception("El fichero no existe");
            }
            $file = fopen($path, "r");
            $operaciones = [];
            while (($datos = fgetcsv($file, 0, ",")) !== false) {
                $operaciones[] = $datos;
            }
            fclose($file);
            return $operaciones;
        } catch (Exception $e) {
            echo "Excepcion: ",  $e->getMessage(), "\n";
            die();
        }
    }

    function realizarOperacion() {
        $path = "resources/resultado.csv";
        $file = fopen($path, "w");
        $datos = leerFichero();
        foreach ($datos as $dato) {
            $numero1 = $dato[0];
            $numero2 = $dato[1];
            $operacion = strtolower(trim($dato[2]));
            switch ($operacion) {
                case 'suma':
                    $resultado = sumar($numero1, $numero2);
                    break;
                case 'resta':
                    $resultado = restar($numero1, $numero2);
                    break;
                case 'producto':
                    $resultado = producto($numero1, $numero2);
                    break;
                case 'division':
                    $resultado = dividir($numero1, $numero2);
                    break;
                default:
                    $resultado = "La operacion no existe";
                    break;
            }
            $linea = implode(",", $dato) . "," . $resultado . "\n";
            fwrite($file, $linea);
        }
        fclose($file);
    }

    function sumar(int $numero1, int $numero2): int {
        return $numero1 + $numero2;
    }
    
    function restar(int $numero1, int $numero2): int {
        return $numero1 - $numero2;
    }

    function producto(int $numero1, int $numero2) {
        return $numero1 * $numero2;
    }

    function dividir(int $numero1, int $numero2) {
        if ($numero2 === 0) {
            return "ERROR";
        }
        return $numero1 / $numero2;
    }

    function mostrarFicheroResultado(): void {
        try {
            $path = "resources/resultado.csv";
            if (!file_exists($path)) {
                throw new Exception("El fichero no existe");
            }
            $resultados = file($path, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
            foreach ($resultados as $resultado) {
                print($resultado . "\n");
            }
        } catch (Exception $e) {
            echo "Excepcion: ",  $e->getMessage(), "\n";
            die();
        }
    }

    realizarOperacion();
    mostrarFicheroResultado();
?>