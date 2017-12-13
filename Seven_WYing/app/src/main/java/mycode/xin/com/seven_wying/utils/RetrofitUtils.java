package mycode.xin.com.seven_wying.utils;

import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit+RxJava+OkHttp
 */

public class RetrofitUtils {

    private static RetrofitUtils retrofitUtils;

    public RetrofitUtils() {
    }
    public static RetrofitUtils getInstance(){
        if(retrofitUtils == null){
            synchronized (RetrofitUtils.class){
                if(retrofitUtils == null){
                    retrofitUtils = new RetrofitUtils();
                }
            }
        }
        return retrofitUtils;
    }
    private static Retrofit retrofit;
    public static synchronized Retrofit getRetrofit(String url){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i("XXX",message);
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .readTimeout(1000, TimeUnit.SECONDS)
                .writeTimeout(1000,TimeUnit.SECONDS)
                .connectTimeout(1000,TimeUnit.SECONDS)
                .retryOnConnectionFailure(false)
                .build();
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .callFactory(okHttpClient)
                    .build();
        }
        return retrofit;
    }
    public <T>T getApiService(String url,Class<T> cl){
        Retrofit retrofit = getRetrofit(url);
        return retrofit.create(cl);
    }
}
