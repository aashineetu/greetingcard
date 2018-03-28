package com.dao;

import com.exception.GreetingCardException;

import com.responsewrappers.CustomerOrderResponseWrapper;

import java.util.List;

/**
 * Created by ashis on 3/28/2018.
 */

public interface GreetingCardDao {

    List<CustomerOrderResponseWrapper> getGreetingCards(Integer numOfRec, String category) throws GreetingCardException;

}
