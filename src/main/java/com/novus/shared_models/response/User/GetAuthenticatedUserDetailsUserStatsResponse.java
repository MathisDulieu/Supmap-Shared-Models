package com.novus.shared_models.response.User;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetAuthenticatedUserDetailsUserStatsResponse {
    private int totalReportsSubmitted;
    private int validatedReports;
    private int totalRoutesCompleted;
    private int totalDistanceTraveled;
    private int totalTimeSaved;
    private int reportsValidatedByOthers;
}
