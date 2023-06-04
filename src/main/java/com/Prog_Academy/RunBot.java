package com.Prog_Academy;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * @author Bohdan Hrytsai
 * @version 1.0.0
 */

public class RunBot {

    public static void main(String[] args) throws Exception {
        var api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(new MyBot());
    }
}

//Price_BTC_ETH_LTC_bot

//6126033799:AAFmx9AWp9uTzJ8il0_JVtSFuSnGhwUGpGE

//https://core.telegram.org/bots/api