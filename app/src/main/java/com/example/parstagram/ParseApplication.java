package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zt5SFANzW1urgSi9DCCpij02WTNVwMbUWkhNfWvg")
                .clientKey("rv2dKjfCt8b8TlehAzQUkuySOegDlx08JXaTPjp9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
