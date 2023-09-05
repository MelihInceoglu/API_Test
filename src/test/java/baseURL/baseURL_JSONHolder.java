package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class baseURL_JSONHolder {

    //BaseURL oluştururken RequestSpecification interfac'inden bir specobje oluşturdurk

    protected RequestSpecification specJSONHolder;

    @BeforeTest
    public void setUP (){
        specJSONHolder  =new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .build();

    }



}