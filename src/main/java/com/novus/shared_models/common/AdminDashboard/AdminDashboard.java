package com.novus.shared_models.common.AdminDashboard;

import com.novus.shared_models.response.Map.HourlyRouteRecalculationResponse;
import com.novus.shared_models.response.User.MonthlyUserStatsResponse;
import com.novus.shared_models.response.User.UserActivityMetricsResponse;
import com.novus.shared_models.response.User.UserContributionResponse;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@Document(collection = "ADMIN_DASHBOARD")
public class AdminDashboard {

    @Builder.Default
    private Map<Integer, Double> appRatingByNumberOfRate = Map.of(0, 0.0);

    @Builder.Default
    private List<UserContributionResponse> topContributors = new ArrayList<>();

    @Builder.Default
    private List<MonthlyUserStatsResponse> userGrowthStats = new ArrayList<>();

    @Builder.Default
    private UserActivityMetricsResponse userActivityMetrics = UserActivityMetricsResponse.builder().build();

    @Builder.Default
    private List<HourlyRouteRecalculationResponse> routeRecalculations = new ArrayList<>();

    private Double incidentConfirmationRate;

    @Builder.Default
    private Map<String, Integer> incidentsByType = new HashMap<>();

    private int totalRoutesProposed;

}
