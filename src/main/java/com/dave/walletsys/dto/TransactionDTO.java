package com.dave.walletsys.dto;

import com.dave.walletsys.blueprint.AuditEntityDTO;
import com.dave.walletsys.blueprint.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class TransactionDTO extends AuditEntityDTO {

    private WalletDTO walletDTO;

    @Column(length = 45)
    private double amount;

    private String type;

}
