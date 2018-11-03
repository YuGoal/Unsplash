package io.caoyu.unsplash.app;

import android.app.Application;
import android.content.Context;

/**
 * @author caoyu
 */
public class UnsplashApplication extends Application {

    private static UnsplashApplication instance;

    public static UnsplashApplication get(Context context) {
        return (UnsplashApplication) context.getApplicationContext();
    }
}
