package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ashis on 3/28/2018.
 */

import java.util.HashMap;
import java.util.Map;

public class GreetingCard {


    public String getGreeting_card_id() {
        return greeting_card_id;
    }

    public void setGreeting_card_id(String greeting_card_id) {
        this.greeting_card_id = greeting_card_id;
    }

    public String getGreeting_card_image_URL() {
        return greeting_card_image_URL;
    }

    public void setGreeting_card_image_URL(String greeting_card_image_URL) {
        this.greeting_card_image_URL = greeting_card_image_URL;
    }

    public String getGreeting_card_price() {
        return greeting_card_price;
    }

    public void setGreeting_card_price(String greeting_card_price) {
        this.greeting_card_price = greeting_card_price;
    }

    public String getGreeting_card_category() {
        return greeting_card_category;
    }

    public void setGreeting_card_category(String greeting_card_category) {
        this.greeting_card_category = greeting_card_category;
    }

    private String greeting_card_id;
    private String greeting_card_image_URL;
    private String greeting_card_price;
    private String greeting_card_category;


    /**
     * No args constructor for use in serialization
     *
     */
    public GreetingCard() {
    }




}