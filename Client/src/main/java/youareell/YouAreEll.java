package youareell;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import controllers.*;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import models.Id;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class YouAreEll {

    private MessageController msgCtrl;
    private IdController idCtrl;
    private String mainUrl = "http://zipcode.rocks:8085";

    public YouAreEll() {

    }

    public YouAreEll (MessageController m, IdController j) {
        // used j because i seems awkward
        this.msgCtrl = m;
        this.idCtrl = j;
    }

    public static void main(String[] args) {
        // hmm: is this Dependency Injection?

        YouAreEll urlhandler = new YouAreEll(new MessageController(), new IdController());
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }

//    public String createId(Id id) {
//        String payload = new Gson().toJson(id);
//        return MakeURLCall(mainUrl + "/ids", "POST", payload);
//    }
//
//    public String updateId(Id id) {
//        String payload = new Gson().toJson(id);
//        return MakeURLCall(mainUrl + "/ids", "PUT", payload);
//    }
//
//    public String get_ids() {
//        return MakeURLCall(mainUrl + "/ids", "GET", "");
//    }
//
//    public String get_messages() {
//        return MakeURLCall(mainUrl + "/messages", "GET", "");
//    }
    public String MakeURLCall(String url, String method, String payload){
        return null;
    }

}
