package com.dao;

/**
 * Created by ashis on 3/28/2018.
 */
public class QueryConstant {

    public static final String GET_GREETINGS = "SELECT Greeting_card_id,Greeting_Card_Image_URL,Greeting_Card_Price,Greeting_Card_Category FROM GreetingCard where Greeting_card_Category = :category LIMIT :LIMIT";

}
