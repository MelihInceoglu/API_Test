package Calisma;

import org.json.JSONObject;
import org.junit.Test;

public class C2 {

     /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.
        {
        “title”:“Ahmet”,
        “body”:“Merhaba”,
        “userId”:1
        }
     */




    @Test
    public void JsonObjeOlusturma(){

        JSONObject jsonObject=new JSONObject();

        jsonObject.put("title","Melih");
        jsonObject.put("body","İnceoğlu");
        jsonObject.put("userId",5);


        System.out.println(jsonObject);




    }
}
