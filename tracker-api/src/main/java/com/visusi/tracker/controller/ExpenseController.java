package com.visusi.tracker.controller;

import com.visusi.tracker.Requests.Expenses;
import com.visusi.tracker.Responses.BaseResponse;
import com.visusi.tracker.service.Entity.ExpenseEntity;
import com.visusi.tracker.service.buisness.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @Autowired
    public ExpenseService expenseService;

    @RequestMapping(path = "api/addExpense", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> addExpense(@RequestBody Expenses request) {
        System.out.println(request.toString());
        final ExpenseEntity expenseEntity = new ExpenseEntity().setAccount(request.getAccount())
                .setDetails(request.getDetails()).setAmount(request.getAmount()).setTransactionType(request.getTransactionType());
        final ExpenseEntity savedExpense = expenseService.addExpense(expenseEntity);
        final BaseResponse response = new BaseResponse().setId(savedExpense.getUuid()).setSuccess(true)
                .setStatusCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
