package com.company;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        client.startTelegram();
        client.startWhatsApp();
        client.startViber();

        client.getAllMessage();
        client.sendAllMessage();
    }
}
