package com.onlyu.oauth2demo01.factories;

import com.google.gson.Gson;

public class GsonFactory {

    private static Gson GSON_INSTANCE;

    public static Gson getInstance() {
        if (GSON_INSTANCE == null)
            GSON_INSTANCE = new Gson();
        return GSON_INSTANCE;
    }

}
