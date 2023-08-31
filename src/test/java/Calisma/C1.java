package Calisma;

import io.restassured.response.Response;
import org.apache.http.StatusLine;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C1 {

    /*
        C1_Get_ApiSorgulama
        https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
        gonderdigimizde donen Response'un,
        status code'unun 200,
        ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
        ve status Line'in HTTP/1.1 200 OK
        ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
 */

    // 1-URL belirlenip Url e gidilecektir
    // 2-  Expected Data belirlenecek
    // 3 - Actual Data belirlenecek
    //4 - Assertion işlemi yapılacak


    @Test
    public void get01(){

        String url="https://restful-booker.herokuapp.com/booking/10";
        Response response =given().when().get(url);
        //response.prettyPrint();

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server","Cowboy")
                .statusLine("HTTP/1.1 200 OK");

    }

}
