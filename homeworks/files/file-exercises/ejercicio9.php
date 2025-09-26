<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function guardarLeerUsuarios(array $usuarios): string {
        $file = fopen("resources/usuarios.txt", "w+r");
        foreach ($usuarios as $usuario) { 
            fwrite($file, "$usuario\n");
        }
        $usuarios = file_get_contents("resources/usuarios.txt");
        return $usuarios;
    }

    $usuarios = ["Ana","Pedro","Lucía"];
    echo guardarLeerUsuarios($usuarios);
?>