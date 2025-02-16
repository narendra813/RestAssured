package com.rest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class PostRequestusingHashMap {
	
	                     @Test
                        void usinghashmap() {
	                    	 
	                    	 HashMap data = new HashMap();
	                    	 data.put("name", "nandu");
	                    	 data.put("location", "hyderabad");
	                    	 data.put("phone", "123456");
	                    	  String couserarr[] = {"java","c"};
	                    	  data.put("coursers", couserarr);
	                    	 
	                   	 given()
	                   	 .contentType("application/json")
	                   	 .body(data)
	                   	 
	                   	 .when()
	                   	 .post(" http://localhost:3000/students")
	                   	 
	                   	 .then()
	                   	 .statusCode(201)
	                   	 .body("name",equalTo("nandu"))
	                   	 .body("location",equalTo("hyderabad"))
	                   	 .log().all();
                        	
                        }
	
	

}
