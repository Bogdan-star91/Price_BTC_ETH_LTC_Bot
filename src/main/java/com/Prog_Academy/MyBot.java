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
                message.setText("Price BTC: " + "\n" + price.getAmount().doubleValue() + " $");

            } else if (text.equals("eth")) {
                var price = CryptoPrice.spotPrice("ETH");
                message.setText("Price ETH: " + "\n" + price.getAmount().doubleValue() + " $");

            } else if (text.equals("ltc")) {
                var price = CryptoPrice.spotPrice("LTC");
                message.setText("Price LTC: " + "\n" + price.getAmount().doubleValue() + " $");

            } else if (text.equals("doge")) {
                var price = CryptoPrice.spotPrice("DOGE");
                message.setText(" Price DOGE: " + "\n" + price.getAmount().doubleValue() + " $");

            } else if (text.equals("btc,eth,ltc")) {
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceEth = CryptoPrice.spotPrice("ETH");
                var priceLtc = CryptoPrice.spotPrice("LTC");
                message.setText("Price: " + "\n" + "BTC = " + priceBtc.getAmount() + " $" + "; " + "\n" + "ETH = " +
                        priceEth.getAmount() + " $ " + "; " + "\n" + "LTC =" + priceLtc.getAmount() + " $" + " .");

            } else if (text.equals("doge,btc,eth,ltc")) {
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceEth = CryptoPrice.spotPrice("ETH");
                var priceLtc = CryptoPrice.spotPrice("LTC");
                message.setText("Price: " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + "; " + "\n" +
                        "BTC = " + priceBtc.getAmount() + " $" + "; " + "\n" + "ETH = " +
                        priceEth.getAmount() + " $ " + "; " + "\n" + "LTC =" + priceLtc.getAmount() + " $" + " .");

            } else if (text.equals("btc,eth,ltc,doge")) {
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceEth = CryptoPrice.spotPrice("ETH");
                var priceLtc = CryptoPrice.spotPrice("LTC");
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                message.setText("Price: " + "\n" + "BTC = " + priceBtc.getAmount() + " $" + "; " + "\n" +
                        "ETH = " + priceEth.getAmount() + " $" + "; " + "\n" + "LTC= " +
                        priceLtc.getAmount() + " $ " + "; " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + " .");

            } else if (text.equals("doge,btc,ltc,eth")) {
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceLtc = CryptoPrice.spotPrice("LTC");
                var priceEth = CryptoPrice.spotPrice("ETH");
                message.setText("Price: " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + "; " + "\n" +
                        "BTC = " + priceBtc.getAmount() + " $" + "; " + "\n" + "LTC = " +
                        priceLtc.getAmount() + " $ " + "; " + "\n" + "ETH = " + priceEth.getAmount() + " $" + " .");

            } else if (text.equals("ltc,doge,btc,eth")) {
                var priceLtc = CryptoPrice.spotPrice("LTC");
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceEth = CryptoPrice.spotPrice("ETH");
                message.setText("Price: " + "\n" + "LTC= " + priceLtc.getAmount() + " $" + "DOGE = " +
                        priceDoge.getAmount() + " $" + "; " + "\n" + "BTC = " + priceBtc.getAmount() + " $" + "; " +
                        "\n" + "ETH = " + priceEth.getAmount() + " $ " + "; " + "\n" + " .");

            } else if (text.equals("doge,eth,ltc")) {
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                var priceEth = CryptoPrice.spotPrice("ETH");
                var priceLtc = CryptoPrice.spotPrice("LTC");
                message.setText("Price: " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + "; " + "\n" + "ETH = " +
                        priceEth.getAmount() + " $ " + "; " + "\n" + "LTC = " + priceLtc.getAmount() + " $" + " .");

            } else if (text.equals("doge,btc,ltc")) {
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceLtc = CryptoPrice.spotPrice("LTC");
                message.setText("Price: " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + "; " + "\n" + "BTC = " +
                        priceBtc.getAmount() + " $" + "; " + "\n" + "LTC = " + priceLtc.getAmount() + " $" + " .");

            } else if (text.equals("ltc,doge")) {
                var priceLtc = CryptoPrice.spotPrice("LTC");
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                message.setText("Price: " + "\n" + "LTC =" + priceLtc.getAmount() + " $" + "; " + "\n" +
                        "DOGE = " + priceDoge.getAmount() + " $" + " .");

            } else if (text.equals("doge,ltc")) {
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                var priceLtc = CryptoPrice.spotPrice("LTC");
                message.setText("Price: " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + "; " + "\n" +
                        "LTC = " + priceLtc.getAmount() + " $" + " .");

            } else if (text.equals("btc,ltc")) {
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceLtc = CryptoPrice.spotPrice("LTC");
                message.setText("Price: " + "\n" + "BTC = " + priceBtc.getAmount() + " $" + "; " +
                        "\n" + "LTC = " + priceLtc.getAmount() + " $" + " .");

            } else if (text.equals("ltc,btc")) {
                var priceLtc = CryptoPrice.spotPrice("LTC");
                var priceBtc = CryptoPrice.spotPrice("BTC");
                message.setText("Price: " + "\n" + "LTC = " + priceLtc.getAmount() + " $" + "\n" + "BTC = " +
                        priceBtc.getAmount() + " $" + " .");

            } else if (text.equals("eth,doge")) {
                var priceEth = CryptoPrice.spotPrice("ETH");
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                message.setText("Price: " + "\n" + "ETH = " + priceEth.getAmount() + " $" + "; " + "\n" +
                        "DOGE = " + priceDoge.getAmount() + " $" + " .");

            } else if (text.equals("doge,eth")) {
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                var priceEth = CryptoPrice.spotPrice("ETH");
                message.setText("Price: " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + "; " + "\n" +
                        "ETH = " + priceEth.getAmount() + " $" + " .");


            } else if (text.equals("eth,btc,doge")) {
                var priceEth = CryptoPrice.spotPrice("ETH");
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                message.setText("Price: " + "\n" + "ETH = " + priceEth.getAmount() + " $" + "; " + "\n" + "BTC = " +
                        priceBtc.getAmount() + " $ " + "; " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + " .");

            } else if (text.equals("btc,eth,doge")) {
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceEth = CryptoPrice.spotPrice("ETH");
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                message.setText("Price: " + "\n" + "BTC= " + priceBtc.getAmount() + " $" + "; " + "\n" + "ETH = " +
                        priceEth.getAmount() + " $ " + "; " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + " .");

            } else if (text.equals("btc,doge")) {
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                message.setText("Price: " + "\n" + "BTC = " + priceBtc.getAmount() + " $" + "; " + "\n" +
                        "DOGE = " + priceDoge.getAmount() + " $" + " .");

            } else if (text.equals("doge,btc")) {
                var priceDoge = CryptoPrice.spotPrice("DOGE");
                var priceBtc = CryptoPrice.spotPrice("BTC");
                message.setText("Price: " + "\n" + "DOGE = " + priceDoge.getAmount() + " $" + "; " + "\n" +
                        "BTC = " + priceBtc.getAmount() + " $" + " .");

            } else if (text.equals("btc,eth")) {
                var priceBtc = CryptoPrice.spotPrice("BTC");
                var priceEth = CryptoPrice.spotPrice("ETH");
                message.setText("Price: " + "\n" + "BTC = " + priceBtc.getAmount() + " $" + "; " + "\n" + "ETH = " +
                        priceEth.getAmount() + " $ " + " .");

            } else if (text.equals("eth,btc")) {
                var priceEth = CryptoPrice.spotPrice("ETH");
                var priceBtc = CryptoPrice.spotPrice("BTC");
                message.setText("Price: " + "\n" + "ETH = " + priceEth.getAmount() + " $ " + "\n" + "BTC = " +
                        priceBtc.getAmount() + " $" + " .");


            } else if (text.equals("all")) {
                var price1 = CryptoPrice.spotPrice("BTC");
                var price2 = CryptoPrice.spotPrice("ETH");
                var price3 = CryptoPrice.spotPrice("LTC");
                var price4 = CryptoPrice.spotPrice("DOGE");
                message.setText("Price : " + "\n" + "BTC = " + price1.getAmount() + " $ " + ";" + "\n" + "ETH = " +
                        price2.getAmount() + " $ " + ";" + "\n" + "LTC = " + price3.getAmount() + " $" + ";" + "\n" +
                        "DOGE = " + price4.getAmount() + " $ " + " .");

            } else {
                message.setText("Unknown command!");
            }

            execute(message);
        } catch (Exception e) {
            System.err.println("Error: command not found!");
        }
    }

    @Override
    public String getBotUsername() {
        return "Price_BTC_ETH_LTC_bot";
    }
}


