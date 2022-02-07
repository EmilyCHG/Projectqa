
package projectqa;

import com.jayway.jsonpath.JsonPath;
import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import io.restassured.response.Response;
import org.junit.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;

import org.skyscreamer.jsonassert.JSONCompareMode;
import projectqa.api.GetUserMethod;
import projectqa.api.PostUserMethod;

public class ApiSampleTest extends AbstractTest{

	//@Test
	public void testUserCreation() {
		PostUserMethod postUserMethod = new PostUserMethod();
		//postUserMethod.addProperty("name", "Emily");
		Response response = postUserMethod.callAPI();
		postUserMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

		//System.out.println(postUserMethod.getProperties().get("name"));
		//System.out.println(response.asString());
		//System.out.println("id: "+ JsonPath.read(response.asString(),"tittle"));
	}

	//@Test
	public void testMissingWord(){
		PostUserMethod postUserMethod = new PostUserMethod();
		postUserMethod.removeProperty("name");
		postUserMethod.callAPI();
		postUserMethod.validateResponse();
	}

	@Test
	public void testGetUsers() {
		GetUserMethod getUserMethod = new GetUserMethod();
		getUserMethod.callAPI();
		getUserMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getUserMethod.validateResponseAgainstSchema("api/user/get/rs.schema");
	}


}