package com.dave.walletsys.model;

import com.dave.walletsys.blueprint.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

    @Column(length = 45)
    private double amount;

    private String type;

}
