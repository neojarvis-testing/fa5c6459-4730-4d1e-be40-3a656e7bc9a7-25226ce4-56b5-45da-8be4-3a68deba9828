package com.examly.springappfeedback.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int userId;
    private String email;
    private String password;
    private String username;
    private String mobileNumber;
    private String userRole;
}
