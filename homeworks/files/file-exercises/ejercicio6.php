<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    file_put_contents("resources/frase.txt", "Hola PHP");
    $texto = file_get_contents("resources/frase.txt");
    $textoInvertido = strrev($texto);
    file_put_contents("resources/frase_invertida.txt", $textoInvertido);
    echo file_get_contents("resources/frase_invertida.txt");
?>