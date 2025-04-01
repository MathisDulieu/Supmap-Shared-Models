package com.novus.shared_models.response.Map;

import com.novus.shared_models.GeoPoint;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetNearbyUsersUserResponse {
    private String username;
    private String profileImage;
    private GeoPoint lastKnownLocation;
    private String userRank;
    private String rankImage;
}
