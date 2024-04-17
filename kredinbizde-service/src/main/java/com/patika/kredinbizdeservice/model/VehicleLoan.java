package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.enums.LoanType;
import com.patika.kredinbizdeservice.enums.VehicleStatuType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle_loan")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class VehicleLoan extends Loan {

    @Enumerated(EnumType.STRING)
    @Column(name = "loan_type")
    private LoanType loanType = LoanType.ARAC_KREDISI;

    @Enumerated(EnumType.STRING)
    @Column(name = "vehicle_statu_type")
    private VehicleStatuType vehicleStatuType;
}
