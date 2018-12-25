package com.cbre.automation;

import org.junit.Assert;
import org.junit.Test;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

public class PipelineTest {

	@Test
	public void testPipeline() throws Exception {

		IClient iClient = new RetrofitConfig().iClient("http://10.21.58.31:9090/");

		iClient.callSignUp();

		iClient.callLogin();
		Call<ResponseBody> refreshCall = iClient.callGetRefresh();
		Response refreshRsp = refreshCall.execute();
		
		System.out.println(refreshRsp.code());
		System.out.println(refreshRsp.errorBody().string());
		Assert.assertEquals(1l, 1l);
	}

}
