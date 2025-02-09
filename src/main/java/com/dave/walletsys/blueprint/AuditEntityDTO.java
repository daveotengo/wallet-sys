package com.dave.walletsys.blueprint;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class AuditEntityDTO {

    private LocalDateTime createdDate;

    private String createdBy;

    private String lastModifiedBy;

    private String lastModifiedDate;
}
