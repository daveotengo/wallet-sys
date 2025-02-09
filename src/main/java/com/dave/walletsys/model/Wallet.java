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
public class Wallet extends BaseEntity {

    @Column(length = 45)
    private String ownerName;

}
