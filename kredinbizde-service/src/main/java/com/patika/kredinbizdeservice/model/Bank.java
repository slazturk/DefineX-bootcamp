package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.model.constant.BankEntityColumnConstants;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = BankEntityColumnConstants.NAME, unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Loan> loanList;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<CreditCard> creditCards;
}
