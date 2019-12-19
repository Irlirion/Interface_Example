package com.company;

import java.util.ArrayList;
import java.util.List;

class Client {

    private List<Messenger> messengers = new ArrayList<>();

    void startTelegram() {
        messengers.add(new Telegram());
    }

    void startWhatsApp() {
        messengers.add(new WhatsApp());
    }

    void startViber() {
        messengers.add(new Viber());
    }

    void sendAllMessage() {
        for (Messenger messenger : messengers) {
            messenger.sendMessage();
        }
    }

    void getAllMessage() {
        for (Messenger messenger : messengers) {
            messenger.getMessage();
        }
    }

}
