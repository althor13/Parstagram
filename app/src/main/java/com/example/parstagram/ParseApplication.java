package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zt5SFANzW1urgSi9DCCpij02WTNVwMbUWkhNfWvg")
                .clientKey("rv2dKjfCt8b8TlehAzQUkuySOegDlx08JXaTPjp9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
