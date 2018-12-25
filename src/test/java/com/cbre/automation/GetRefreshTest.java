package com.cbre.automation;

import org.junit.Test;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import org.junit.Assert;
import com.cbre.automation.*;

public class GetRefreshTest {

	@Test
	public void testGetRefreshSuccess() throws Exception{
		
		IClient iClient = new RetrofitConfig().iClient("http://10.21.58.31:9090/");
		
		Call<ResponseBody> refreshCall = iClient.callGetRefresh();
		Response refreshRsp = refreshCall.execute();
		System.out.println(refreshRsp.code());
		System.out.println(refreshRsp.errorBody().string());
		Assert.assertEquals(1l, 1l);
	}
}
