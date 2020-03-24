package com.stackroute;

import com.mongodb.*;

import java.net.UnknownHostException;

public class MongodbDemo {
    public static void main(String[] args) {
        try {
            MongoOperations mongoOperations = new MongoOperations();
            mongoOperations.createDocument();
            mongoOperations.updateDocument();
            mongoOperations.deleteDocument();
        } catch (MongoException | UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
