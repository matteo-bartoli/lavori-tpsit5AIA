package com.bencini;
import java.net.*;
import java.util.zip.DataFormatException;
import java.io.*;


public class ClientStr {
    String nomeServer = "localhost";
    int portaServer = 6789;
    Socket miosocket ;
    BufferedReader tastiera;
    String stringaUtente;
    String stringaRicevutaDalServer;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;

    public Socket connetti(){
        System.out.println("2 CLIENT partito in esecuzione ...");
        try {
            tastiera = new BufferedReader(new InputStreamReader(System.in));
            miosocket = new  Socket(nomeServer, portaServer);

            outVersoServer = new DataOutputStream(miosocket.getOutputStream());
            inDalServer = new BufferedReader(new InputStreamReader(miosocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Host sconosciuto");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Errore durante la connessione");
            System.exit(1);
        }
        return miosocket;
    }

    public void comunica(){
        try{
            System.out.println("4... Inserisci la stringa da trasmettere al server:" + "\n");
            stringaUtente = tastiera.readLine();

            System.out.println("5... invio la stringa ");
        }
    }
}
