package com.novus.shared_models.response.User;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserActivityMetricsResponse {
    private Integer dailyActiveUsers;
    private Integer monthlyActiveUsers;
    private Double retentionRate;
}
