package com.dave.walletsys.dto;

import com.dave.walletsys.blueprint.AuditEntityDTO;
import com.dave.walletsys.blueprint.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class WalletDTO extends AuditEntityDTO {

    private String ownerName;

}
