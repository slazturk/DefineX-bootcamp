package com.patika.kredinbizdeservice.model;


import com.patika.kredinbizdeservice.model.constant.LoanEntityColumnConstants;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loan")
public abstract class Loan implements Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = LoanEntityColumnConstants.AMOUNT, unique = false, nullable = false)
    private BigDecimal amount;

    @Column(name = LoanEntityColumnConstants.INSTALLMENT, unique = false, nullable = false)
    private Integer installment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Bank bank;

    @Column(name = LoanEntityColumnConstants.INTEREST_RATE, unique = false, nullable = false)
    private Double interestRate;
    // private Campaign campaign; // kampanyalı kredileri üstte çıkart

    //sponsorlu kampanyaları üstte çıkart
}
