<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    file_put_contents("resources/datos.txt", "Hola Mundo desde PHP");
    echo file_get_contents("resources/datos.txt");
?>