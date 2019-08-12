package com.microservices2.exercise1.customer.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Account implements Serializable {

    private static final long serialVersionUID = 6477159315301663811L;

    private Integer accountId;
    private Double balance;
    private Integer customerId;
    private String accountType;
    private String branchCode;
    private String bank;
}
