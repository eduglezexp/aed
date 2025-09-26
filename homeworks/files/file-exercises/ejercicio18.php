<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function guardarComida(string $archivo): void {
        echo "¿Que comida te gusta? ";
        $comida = readline("que comida te gusta? ");

        $file = fopen($archivo, "a");
        fwrite($file, $comida . "\n");
        fclose($file);
    }

    function generarRanking(string $archivo): array {
        $ranking = [];

        $file = fopen($archivo, "r");
        while ($linea = fgets($file)) {
            $comida = trim($linea);
            if (!empty($comida)) {
                if (isset($ranking[$comida])) {
                    $ranking[$comida] += 1;
                } else {
                    $ranking[$comida] = 1;
                }
            }
        }
        fclose($file);
        arsort($ranking);
        return $ranking;
    }

    function mostrarRanking(array $ranking): void {
        echo "Ranking de comidas:\n";
        foreach ($ranking as $comida => $veces) {
            echo "$comida: $veces\n";
        }
    }

    $archivo = "resources/comidas.txt";
    guardarComida($archivo);
    $ranking = generarRanking($archivo);
    mostrarRanking($ranking);
?>