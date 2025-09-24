<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    copy("resources/origen.txt", "resources/copia.txt");
    echo file_get_contents("resources/copia.txt");
?>