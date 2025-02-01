import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;






public class ProjectActivity {
	
	 String sshkey;
	 int keysId;
	RequestSpecification reqSpec;			
	ResponseSpecification resSpec;
	String baseURL = "https://api.github.com";
	String token ="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";
	
	
	@BeforeClass
	
	public void setup() {
		
		reqSpec =new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.addHeader("Authorization", "token " + token)
				.setBaseUri(baseURL)
				.build();
		
		resSpec = new ResponseSpecBuilder()
				.expectContentType("application/json")
				.expectStatusCode(200)
				.build();
				
	
	}
	
	@Test(priority=1)
	public void postMethod() {
		
		String reqBody = """
			{
					"title" : "test",
					"key" : "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIGwtdjSCyN/OuOax+FoQMEFZoabKo5GcjguoCsEd4RXd"
			}""";
		
		
					
		Response response = given().spec(reqSpec).body(reqBody).post("/user/keys");
		response.then().log().all();
		
		response.prettyPrint();
		
		keysId = response.then().extract().path("id");	
		
		response.then().statusCode(201);
		
			
	
	}
	
	@Test(priority=2)
	
	public void getMethod() {
		
		Response response = given().spec(reqSpec)
				.when()
				.pathParam("keyId", keysId)   
				.get("/user/keys/{keyId}");
		
		response.prettyPrint();
		
		response.then().statusCode(200);
	}
	
	@Test(priority=3)
	
	public void deleteMethod() {
		
		Response response = given().spec(reqSpec)
				.when()
				.pathParam("keyId", "keysId")   
				.delete("/user/keys/{keyId}");
		
		response.then().log().all();
		
		response.prettyPrint();
		
		response.then().statusCode(204);
		
	}
	
	/**
	 * @Test(priority = 3)
	public void deleteSSH() {
		
		Response response = given().spec(reqspec)
				.when().pathParam("keyid", id).delete("/user/keys/{keyid}");
		
		response.then().statusCode(204);
		Reporter.log(response.toString());
		
		
	}
	 */
	
}
