package com.Prog_Academy;

import net.thauvin.erik.crypto.CryptoPrice;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
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
            var message = new SendMessage();
            message.setChatId(chatId);

            if (text.equals("/start")) {
                message.setText("Hello!");

            } else if (text.equals("btc")) {
                var price = CryptoPrice.spotPrice("BTC");
                message.setText("Price BTC: " + price.getAmount().doubleValue() + " $");

            } else if (text.equals("eth")) {
                var price = CryptoPrice.spotPrice("ETH");
                message.setText("Price ETH: " + price.getAmount().doubleValue() + " $");

            } else if (text.equals("ltc")) {
                var price = CryptoPrice.spotPrice("LTC");
                message.setText("Price LTC: " + price.getAmount().doubleValue() + " $");

            } else if (text.equals("doge")) {
                var price = CryptoPrice.spotPrice("DOGE");
                message.setText(" Price DOGE: " + price.getAmount().doubleValue() + " $");

            } else if (text.equals("all")) {
                var price1 = CryptoPrice.spotPrice("BTC");
                var price2 = CryptoPrice.spotPrice("ETH");
                var price3 = CryptoPrice.spotPrice("LTC");
                var price4 = CryptoPrice.spotPrice("DOGE");
                message.setText("Price : " + "BTC= " + price1.getAmount() + " $ " + ";" + "  " + "ETH= " +
                        price2.getAmount() + " $ " + ";" + "  " + "LTC= " + price3.getAmount() + " $" + ";" + "  " +
                        "DOGE= " + price4.getAmount() + " $ " + " ." );

            } else {
                message.setText("Unknown command !!!");
            }

            execute(message);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    @Override
    public String getBotUsername() {
        return "Price_BTC_ETH_LTC_bot";
    }
}


