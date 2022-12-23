package com.example.onlineecommerce.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseClass {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
