package com.onlyu.base.demo00.factories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonFactory {

    private static Gson GSON_INSTANCE;

    public static Gson getInstance() {
        if (GSON_INSTANCE == null)
            GSON_INSTANCE = new GsonBuilder()
                    .serializeNulls()
                    .create();
        return GSON_INSTANCE;
    }

}
