package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime CreatedAt;

    @Column(updatable = false)
    private String CreatedBy;

    @Column(insertable = false)
    private LocalDateTime UpdatedAt;

    @Column(insertable = false)
    private String UpdatedBy;
}
