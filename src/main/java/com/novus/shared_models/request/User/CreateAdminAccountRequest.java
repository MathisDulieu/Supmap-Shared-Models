package com.novus.shared_models.request.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAdminAccountRequest {
    private String username;
    private String email;
    private String password;
    private String profileImage;
    private boolean isValidEmail;
}
