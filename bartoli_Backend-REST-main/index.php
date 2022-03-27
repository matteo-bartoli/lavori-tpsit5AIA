<?php

    $request = $_SERVER["Request_Method"];

    switch($request){
        case: "GET";
            break;
            
        case: "POST";
            break;
            
        case: "DELETE";
            break;
            
        case: "PUT";
            break;
            
        default: 
            echo: "Mi dispiace non so che cosa fare.";
            break;

?>
