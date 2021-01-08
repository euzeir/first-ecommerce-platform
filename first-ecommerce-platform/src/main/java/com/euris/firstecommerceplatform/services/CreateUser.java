package com.euris.firstecommerceplatform.services;

import com.euris.firstecommerceplatform.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateUser {
    private User user;
}
