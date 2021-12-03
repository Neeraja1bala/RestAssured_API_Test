package restAPIBDD;



import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteRequest {
	
	@Test
	public void DeleteCall() {
		
		
		RestAssured.given()
		   .baseUri("http://localhost:7000")
		   .contentType(ContentType.JSON) //not required
		   .accept(ContentType.JSON) //not required
		   .when()
		   .delete("/employees/12")
		   .then()
		   .statusCode(200)
		   .log() //not required
		   .all(); //not required
		
	}

}
