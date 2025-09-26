<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function guardarFechaDiario($frase){
        $path = "resources/diario.txt";
        $file = fopen($path, "a");
        $fechaActual = date('[Y-m-d H:i:s]');
        $entradaFormato = "$fechaActual $frase \n";
        fwrite($file, $entradaFormato);
        echo file_get_contents($path);
        fclose($file);
   }

   guardarFechaDiario("Hoy aprendí PHP con ficheros 😄");
?>