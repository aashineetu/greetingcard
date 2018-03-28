package com.serviceimpl;

import com.dao.GreetingCardDao;
import com.exception.GreetingCardException;
import com.responsewrappers.CustomerOrderResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ashis on 3/28/2018.
 */


@Service
public class GreetingCardService {

    @Autowired
    private GreetingCardDao greetingCardDao;

    public List<CustomerOrderResponseWrapper> getGreetingCards(Integer numOfRec, String category) throws GreetingCardException {
//       List<CustomerOrderResponseWrapper> orderResponseList= new ArrayList<CustomerOrderResponseWrapper>();
//        CustomerOrderResponseWrapper customerOrderResponseWrapper = new CustomerOrderResponseWrapper();
//        customerOrderResponseWrapper.setId(1111);
//        customerOrderResponseWrapper.setOrderDate("8/12/2017");
//
//        GreetingCard customers = new GreetingCard();
//        customers.setId(1);
//        customers.setName("ashish");
//        customerOrderResponseWrapper.setCustomers(customers);
//
//        List<Parts> partsList = new ArrayList<Parts>();
//        Parts parts = new Parts();
//        parts.setId(111);
//        parts.setName("RAM");
//        parts.setDescription("RAM for laptop");
//        parts.setQuantity(4);
//        Supplier supplier = new Supplier();
//        supplier.setId(11);
//        supplier.setName("ABC Electronic");
//        parts.setSupplier(supplier);
//        partsList.add(parts);
//        customerOrderResponseWrapper.setParts(partsList);
//        orderResponseList.add(customerOrderResponseWrapper);


        return greetingCardDao.getGreetingCards(numOfRec, category);
    }
}


