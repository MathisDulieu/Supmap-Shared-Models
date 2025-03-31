package com.novus.shared_models.request.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAuthenticatedUserDetailsRequest {
    private String username;
    private String email;
    private String oldPassword;
    private String newPassword;
}
