package com.novus.shared_models.response.User;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetUserAdminDashboardDataResponse {
    private Map<Integer, Double> appRatingByNumberOfRate;
    private List<UserContributionResponse> topContributors;
    private List<MonthlyUserStatsResponse> userGrowthStats;
    private UserActivityMetricsResponse userActivityMetrics;
    private String error;
}
