package com.order.controller;


import com.responsewrappers.CustomerOrderResponseWrapper;
import com.serviceimpl.GreetingCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import java.util.Arrays;
import java.util.List;


@RestController
@Api(value = "/", description = "Controller for greeting card")
public class GreetingCardController {

    @Autowired
    GreetingCardService customerOrderService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success - record found"),
            @ApiResponse(code = 404, message = "Unable to find record"),
            @ApiResponse(code = 500, message = "Internal Server error")})
    @ApiOperation(value = "Customer Order", produces = "application/json",
            response = ResponseEntity.class, httpMethod = "GET")
    @RequestMapping(method = RequestMethod.GET, value = "/greetingCard",
            produces = "application/json")
    public ResponseEntity<List<Object>> getOrderResponse(
            @RequestParam(value = "limit") Integer limit,
            @RequestParam(value = "category") String category
    ) throws Exception{
        List<CustomerOrderResponseWrapper> customerOrderResponseWrapperList = null;

        customerOrderResponseWrapperList = customerOrderService.getGreetingCards(limit, category);

        if (CollectionUtils.isEmpty(customerOrderResponseWrapperList)) {
            return new ResponseEntity(Arrays.asList("No orders found given a filter."), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(customerOrderResponseWrapperList, HttpStatus.OK);
    }


}