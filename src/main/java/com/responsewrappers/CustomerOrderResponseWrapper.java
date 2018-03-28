package com.responsewrappers;


import java.util.Map;
import java.util.HashMap;

import java.util.List;
import com.entity.*;

/**
 * Created by ashis on 3/28/2018.
 */

public class CustomerOrderResponseWrapper {


    public List<GreetingCard> getGreetingCardList() {
        return greetingCardList;
    }

    public void setGreetingCardList(List<GreetingCard> greetingCardList) {
        this.greetingCardList = greetingCardList;
    }

    private List<GreetingCard> greetingCardList = null;



    public CustomerOrderResponseWrapper() {
    }

//    /**
//     *
//     * @param id
//     * @param orderDate
//     * @param parts
//     * @param customers
//     */
//    public CustomerOrderResponseWrapper(Customers customers, List<Parts> parts, Integer id, String orderDate) {
//        super();
//        this.customers = customers;
//        this.parts = parts;
//        this.id = id;
//        this.orderDate = orderDate;
//    }



}