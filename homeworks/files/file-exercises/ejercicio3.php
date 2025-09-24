<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */
    
    $file = file_get_contents("resources/texto.txt");
    echo str_word_count($file);
?>