package com.dao;


import com.entity.GreetingCard;
import com.exception.GreetingCardException;
import com.responsewrappers.CustomerOrderResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class GreetingCardDaoImpl implements GreetingCardDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public List<CustomerOrderResponseWrapper> getGreetingCards(Integer LIMIT, String category) throws GreetingCardException {

        System.out.println("Inside getGreetingCard ");
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("category", category);
        parameters.addValue("LIMIT", LIMIT);

        List<CustomerOrderResponseWrapper> orderResponseList = new ArrayList<CustomerOrderResponseWrapper>();
        CustomerOrderResponseWrapper wrapper = null;
        try {
            SqlRowSet rowSet = namedParameterJdbcTemplate.queryForRowSet(QueryConstant.GET_GREETINGS, parameters);

            wrapper = new CustomerOrderResponseWrapper();
            List<GreetingCard> greetingCardList = new ArrayList<GreetingCard>();

            while (rowSet.next()) {

                GreetingCard greetingCard = new GreetingCard();
                String greeting_card_id = rowSet.getString("Greeting_card_id");
                String greeting_Card_Image_URL = rowSet.getString("Greeting_Card_Image_URL");
                String greeting_Card_Price = rowSet.getString("Greeting_Card_Price");
                String greeting_Card_Category = rowSet.getString("Greeting_Card_Category");
                greetingCard.setGreeting_card_id(greeting_card_id);
                greetingCard.setGreeting_card_image_URL(greeting_Card_Image_URL);
                greetingCard.setGreeting_card_price(greeting_Card_Price);
                greetingCard.setGreeting_card_category(greeting_Card_Category);

                greetingCardList.add(greetingCard);

                wrapper.setGreetingCardList(greetingCardList);

            }
            orderResponseList.add(wrapper);
        } catch (Exception e) {
            System.out.println(e);//implement logger(sl4j) instead of console print-- todo

            throw new GreetingCardException(e);

        }

        return orderResponseList;
    }


}
