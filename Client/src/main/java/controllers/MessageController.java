package controllers;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Id;
import models.Message;

public class MessageController {
    TransactionController transactionController = new TransactionController();

    private HashSet<Message> messagesSeen;
    // why a HashSet??

    public ArrayList<Message> getMessages() {
        String messages = transactionController.makeURLCall("/messages", "GET", "");
        Type listType = new TypeToken<List<Message>>(){}.getType();
        return new Gson().fromJson(messages, listType);
    }

    public ArrayList<Message> getMessagesForId(Id id) {
        String targetId = id.getGithub();
        String messages = transactionController.makeURLCall("/ids/" + targetId + "/messages", "GET", "");
        Type listType = new TypeToken<List<Message>>(){}.getType();
        return new Gson().fromJson(messages, listType);
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

    public String toString(ArrayList<Message> messages) {
        StringBuilder sb = new StringBuilder();
        for (Message message : messages) {
            sb.append("sequence: " + message.getSequence() + "\n" +
                    "timestamp: " + message.getTimestamp() + "\n" +
                    "fromid: " + message.getFromid() + "\n" +
                    "toid: " + message.getToid() + " \n" +
                    "message: " + message.getMessage() + "\n\n");
        } return sb.toString();
    }
}