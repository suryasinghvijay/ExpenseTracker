package com.visusi.tracker.Requests;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Expenses {
    private String details;
    private Double amount;
    private String account;
    private String transactionType;
}
