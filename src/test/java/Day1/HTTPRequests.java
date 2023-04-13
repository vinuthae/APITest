package Day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HTTPRequests {

	@Test(priority=1)
	void getUser()
	{
		given()
		
		.when()
		  .get("https://reqres.in/api/users?page2")
		 
		.then()
			.statusCode(200)
			.body("page",equalTo(1))
			.log().all();
	}
	
	//void createUser()
	
	
}
