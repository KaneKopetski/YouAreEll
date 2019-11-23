package controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import models.Id;
import models.Message;

public class MessageController {

    private HashSet<Message> messagesSeen;
    // why a HashSet??

//URL: http://zipcode.rocks:8085/messages/
    public ArrayList<Message> getMessages() {

//        JsonNode responseBody = jsonResponse.getBody();
//        JSONArray jsonArray = responseBody.getArray();
//        ArrayList<Message> messageList = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<Message>>(){}.getType());
//        return messageList;
        return null;
    }

    public ArrayList<Message> getMessagesForId(Id Id) {
        return null;
    }

    public Message getMessageForSequence(String seq) {
        return null;
    }

    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
        return null;
    }

    public Message postMessage(Id myId, Id toId, Message msg) {
        return null;
    }
 
}