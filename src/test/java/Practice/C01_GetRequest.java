package Practice;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_GetRequest {




    @Test
    public void test01(){

           /*
        url : https://reqres.in/api/users/
        get request
        cevabı yazdırın
         */

        //api dan donen cevap response objesine kaydlur
        Response response =given().when().get("https://reqres.in/api/users/");
        response.prettyPrint();


    }
}
