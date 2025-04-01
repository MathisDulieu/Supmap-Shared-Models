package com.novus.shared_models.response.User;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserContributionResponse {
    private String userId;
    private String username;
    private Integer contributionCount;
    private Double trustScore;
    private String rank;
    private String rankImage;
}
