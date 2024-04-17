package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.enums.SectorType;
import com.patika.kredinbizdeservice.model.constant.BankEntityColumnConstants;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = BankEntityColumnConstants.NAME, unique = true, nullable = false)
    private String title;

    @Column(name = BankEntityColumnConstants.NAME, unique = true, nullable = false)
    private String content;

    @Column(name = BankEntityColumnConstants.NAME, unique = true, nullable = false)
    private LocalDate dueDate;

    @Column(name = BankEntityColumnConstants.NAME, unique = true, nullable = false)
    private LocalDate createDate;

    @Column(name = BankEntityColumnConstants.NAME, unique = true, nullable = true)
    private LocalDate updateDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "sector_status")
    private SectorType sector;

    @ManyToOne
    @JoinColumn(name = "credit_card_id")
    private CreditCard creditCard;

}
