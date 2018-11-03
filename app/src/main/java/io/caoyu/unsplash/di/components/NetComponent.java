package io.caoyu.unsplash.di.components;

import javax.inject.Singleton;

import dagger.Component;
import io.caoyu.unsplash.di.modules.NetModule;
import io.caoyu.unsplash.model.ApiService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Component(modules = NetModule.class)
@Singleton
public interface NetComponent {
    ApiService getApiService();

    OkHttpClient getOkHttp();

    Retrofit getRetrofit();
}
