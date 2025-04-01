package com.novus.shared_models.response.User;

import com.novus.shared_models.common.User.User;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetAllUsersResponse {
    private List<User> users;
    private int totalPages;
    private String error;
}
