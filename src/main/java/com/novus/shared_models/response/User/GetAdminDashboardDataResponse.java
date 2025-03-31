package com.novus.shared_models.response.User;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetAdminDashboardDataResponse {
    private int totalUsers;
    private int usersRegisteredThisMonth;
}
