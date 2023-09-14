package com.picpaysimplificado.dtos;

import java.math.BigDecimal;

import com.picpaysimplificado.domain.user.UserType;

public record UserDto(String firstName, String LastName, String document,BigDecimal balance, String email, String password, UserType userType) {
    
}
