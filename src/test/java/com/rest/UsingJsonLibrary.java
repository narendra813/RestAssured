package com.rest;
import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;


public class UsingJsonLibrary {
	
	
	@Test
	 void jsonlibrary() {
		 JSONObject data = new JSONObject();
		 data.put("name", "lucky");
		 data.put("location","banglore");
		 data.put("phone","123456");
		 
		 given()
		 .contentType("application/json")
		 .body(data.toString())
		 
		 .when()
		 .post("http://localhost:3000/students")
		 
		 .then()
		 .statusCode(201)
		 .body("name", equalTo("lucky"))
		 .body("location",equalTo("banglore"))
		 .body("phone",equalTo("123456"))
		 .log().all();
		 
	 }
	
	
	                     
	
	

}
