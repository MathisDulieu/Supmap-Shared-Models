package com.novus.shared_models.response.Map;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetMapAdminDashboardDataResponse {
    private List<HourlyRouteRecalculationResponse> routeRecalculations;
    private Double incidentConfirmationRate;
    private Map<String, Integer> incidentsByType;
    private Integer totalRoutesProposed;
    private String error;
}
