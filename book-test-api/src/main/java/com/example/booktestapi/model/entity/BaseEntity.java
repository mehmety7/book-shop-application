package com.example.booktestapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    private Date createdAt;
    private Date updatedAt;
}
