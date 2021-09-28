package com.example;


import java.io.*;
import java.net.*;


public class MatteoClient {
    //definizione delle variabili da utilizzare nella classe;
    String nomeServer="localHost";
    int portaServer=6789;
    Socket matteoSocket;
    BufferedReader tastiera;
    String stringaUtente;
    String stringaRicevutaDalServer;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;

    public Socket connetti (){//defini9zione metodo che definisce la connessione con il server;
        System.out.println("2 client partito in esecuzione...");
        try{
            //per l'input da tastiera ;
            tastiera=new BufferedReader(new InputStreamReader(System.in));

        }

        return matteoSocket;
    }

}
