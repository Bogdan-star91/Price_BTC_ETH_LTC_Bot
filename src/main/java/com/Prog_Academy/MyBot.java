package com.Prog_Academy;

import net.thauvin.erik.crypto.CryptoPrice;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    public MyBot() {
        super("6126033799:AAFmx9AWp9uTzJ8il0_JVtSFuSnGhwUGpGE");
    }

    @Override
    public void onUpdateReceived(Update update) {
        var chatId = update.getMessage().getChatId();
        var text = update.getMessage().getText();

        try {
            if (text.equals("/start")) {
                sendMessage(chatId, "Hello!");
            } else if (text.equals("btc")) {
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");

            } else if (text.equals("eth")) {
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");

            } else if (text.equals("ltc")) {
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");

            } else if (text.equals("doge")) {
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");

            } else if (text.equals("all")) {
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");


            } else if (text.equals("btc,eth,ltc")) {
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");

            } else if (text.equals("doge,btc,eth,ltc")) {
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");

            } else if (text.equals("btc,eth,ltc,doge")) {
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");

            } else if (text.equals("doge,btc,ltc,eth")) {
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");

            } else if (text.equals("ltc,doge,btc,eth")) {
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");

            } else if (text.equals("doge,eth,ltc")) {
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");

            } else if (text.equals("doge,btc,ltc")) {
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");

            } else if (text.equals("ltc,doge")) {
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");

            } else if (text.equals("doge,ltc")) {
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");

            } else if (text.equals("btc,ltc")) {
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");

            } else if (text.equals("ltc,btc")) {
                sendPicture(chatId, "LTC.png");
                sendPrice(chatId, "LTC");
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");

            } else if (text.equals("eth,doge")) {
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");

            } else if (text.equals("doge,eth")) {
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");


            } else if (text.equals("eth,btc,doge")) {
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");

            } else if (text.equals("btc,eth,doge")) {
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "DOGE.png");;
                sendPrice(chatId, "DOGE");

            } else if (text.equals("btc,doge")) {
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");

            } else if (text.equals("doge,btc")) {
                sendPicture(chatId, "DOGE.png");
                sendPrice(chatId, "DOGE");
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");

            } else if (text.equals("btc,eth")) {
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");

            } else if (text.equals("eth,btc")) {
                sendPicture(chatId, "ETH.png");
                sendPrice(chatId, "ETH");
                sendPicture(chatId, "BTC.png");
                sendPrice(chatId, "BTC");


            } else {
                sendMessage(chatId, "Unknown command!");
            }

        } catch (Exception e) {
            System.err.println("Error: command not found!");
        }
    }

    void sendPrice(long chatId, String name) throws Exception {
        var price = CryptoPrice.spotPrice(name);
        sendMessage(chatId, name + " price: " + price.getAmount().doubleValue() + " $");
    }

    void sendPicture(long chatId, String name) throws Exception {
        var photo = getClass().getClassLoader().getResourceAsStream(name);

        var message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile(photo, name));
        execute(message);
    }

    void sendMessage(long chatId, String text) throws Exception {
        var message = new SendMessage();
        message.setChatId(chatId);
        message.setText(text);
        execute(message);
    }

    @Override
    public String getBotUsername() {
        return "Price_BTC_ETH_LTC_DOGE_bot";
    }
}


