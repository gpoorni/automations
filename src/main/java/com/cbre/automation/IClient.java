package com.cbre.automation;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface IClient {

	
	@GET("/public/refresh")
	@Headers({"Content-Type: application/json"})
	Call<ResponseBody> callGetRefresh();
	
	Call<ResponseBody> callSignUp();
	
	Call<ResponseBody> callLogin();
}
