package com.novus.shared_models.response.User;

import com.novus.shared_models.GeoPoint;
import com.novus.shared_models.common.User.NavigationPreferences;
import com.novus.shared_models.common.User.NotificationPreferences;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetAuthenticatedUserDetailsResponse {
    private String username;
    private String email;
    private String profileImage;
    private String role;
    private GeoPoint lastKnownLocation;
    private NavigationPreferences navigationPreferences;
    private List<UserDetailsLocationResponse> favoriteLocations;
    private UserStatsResponse stats;
    private NotificationPreferences notificationSettings;
    private boolean isValidEmail;
    private boolean hasVoted;

    private String error;
}
