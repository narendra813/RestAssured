package com.rest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class DemoRestApi {
	
	@Test(priority=1)
	void GetUser() {
		
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();	
		
	}
	

   @Test(priority=2)
   void postRequest() {
	   
	   HashMap map = new HashMap();
	   map.put("name","nandu");
	   map.put("job", "trainer");
	   
	   given()
	   .contentType("application/json")
	   .body(map)
	  
	   
	   .when()
	   .post("https://reqres.in/api/users")
	   
	   .then()
	   .statusCode(201)
	   .log().all();
	    
   }
   
   
          @Test(priority=3)
         void putRequest() {
	   
	   HashMap map = new HashMap();
	   map.put("name","lucky");
	   map.put("job", "tester");
	   
	   given()
	   .contentType("application/json")
	   .body(map)
	  
	   
	   .when()
	   .post("https://reqres.in/api/users")
	   
	   .then()
	   .statusCode(201)
	   .log().all();
	   
   
}
              @Test(priority=4)
             void deleteRequest() {
            	  
            	  given()
            	  
            	  .when()
            	    .delete("https://reqres.in/api/users/2")
            	  
            	  .then()
            	  .statusCode(204)
            	  .log().all();
            	 
             }
         
}


