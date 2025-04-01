package com.novus.shared_models.response.User;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MonthlyUserStatsResponse {
    private String month;
    private Integer newUsers;
    private Integer totalUsers;
}
