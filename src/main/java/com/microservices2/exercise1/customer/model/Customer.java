package com.microservices2.exercise1.customer.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "CUSTOMER")
@Entity
@EqualsAndHashCode
public class Customer implements Serializable {
    private static final long serialVersionUID = -8108784097235286223L;

    @Id
    @Column(name = "CUSTOMERID")
    private Integer customerId;

    @Column(name = "CUSTOMERNAME")
    private String customerName;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CITY")
    private String city;

    @Transient
    private List<Account> account;
}
