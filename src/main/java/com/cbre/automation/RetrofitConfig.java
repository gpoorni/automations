package com.cbre.automation;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

	public IClient iClient(String prefix) throws Exception {

		Retrofit retrofit = new Retrofit.Builder()
				.addConverterFactory(GsonConverterFactory.create())

				.baseUrl(prefix)

				.client(new OkHttpClient()).build();

		return retrofit.create(IClient.class);

	}
	
}
