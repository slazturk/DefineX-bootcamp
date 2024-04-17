package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.enums.LoanType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "house_loan")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class HouseLoan extends Loan {

    @Enumerated(EnumType.STRING)
    @Column(name = "loan_type")
    private LoanType loanType = LoanType.KONUT_KREDISI;

}
