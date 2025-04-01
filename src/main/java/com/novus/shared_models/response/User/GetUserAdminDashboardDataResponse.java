package com.novus.shared_models.response.User;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetUserAdminDashboardDataResponse {
    private Double appRating;
    private List<UserContributionResponse> topContributors;
    private List<MonthlyUserStatsResponse> userGrowthStats;
    private UserActivityMetricsResponse userActivityMetrics;
    private String error;
}
