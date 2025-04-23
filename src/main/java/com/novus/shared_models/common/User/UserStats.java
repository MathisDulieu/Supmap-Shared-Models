package com.novus.shared_models.common.User;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class UserStats {
    private int totalReportsSubmitted;
    private int validatedReports;
    private int invalidatedReports;
    private int totalRoutesCompleted;
    private int totalDistanceTraveled;
    private int totalTimeSaved;

    @Builder.Default
    private UserRank rank = UserRank.NAVIGATOR_NOVICE;
    private String rankImage;

    @Builder.Default
    private Date lastActiveDate = new Date(System.currentTimeMillis() + 7200000);;

    @Builder.Default
    private int trustScore = 50;

    @Builder.Default
    private int reportsValidatedByOthers = 0;

}
