<?php
    /**
     * @author eduglezexp
     * @version 1.0.0
     */

    function escribirTweets(string $archivo): void {
        $tweets = fopen($archivo, "a");

        do {
            $datetime = date("Y-m-d H:i");
            echo "Escribe tu tweet (Enter vacio para salir): ";
            $tweet = trim(fgets(STDIN));

            if (strlen($tweet) > 0) {
                fwrite($tweets, "[$datetime] @usuario: $tweet\n");
            }
        } while ($tweet);

        fclose($tweets);
    }

    function mostrarTweets(string $archivo): void {
        if (file_exists($archivo)) {
            echo "\n--- Timeline ---\n";
            echo implode("", file($archivo));
        } else {
            echo "No hay tweets todavia.\n";
        }
    }

    $archivo = "resources/tweets.txt";
    escribirTweets($archivo);
    mostrarTweets($archivo);
?>