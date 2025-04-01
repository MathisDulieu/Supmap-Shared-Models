package com.novus.shared_models.response.User;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserStatsResponse {
    private int totalReportsSubmitted;
    private int validatedReports;
    private int totalRoutesCompleted;
    private int totalDistanceTraveled;
    private int totalTimeSaved;
    private int reportsValidatedByOthers;
    private String rank;
    private String rankImage;
    private String error;
}
