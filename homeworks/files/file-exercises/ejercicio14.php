<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function excusas(): array {
        $content = explode("\n",file_get_contents("resources/excusas.txt"));
        return $content;
    }

    function obtenerExcusasRandom(): string {
        $content = excusas();
        $index = array_rand($content);
        return $content[$index];
    }
    echo obtenerExcusasRandom();
?>