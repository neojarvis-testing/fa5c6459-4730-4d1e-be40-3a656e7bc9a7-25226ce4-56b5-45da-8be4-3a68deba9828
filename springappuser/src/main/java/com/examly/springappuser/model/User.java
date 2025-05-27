package main.java.com.examly.springappuser.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    
    private int userId;
    private String email;
    private String password;
    private String username;
    private String mobileNumber;
    private String userRole;


}
