package com.novus.shared_models.common.User;

import com.novus.shared_models.GeoPoint;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@Document(collection = "USERS")
public class User {

    @Id
    private String id;

    @Indexed(unique = true)
    private String username;

    @Indexed(unique = true)
    private String email;

    private String password;
    private String profileImage;

    @Builder.Default
    private UserRole role = UserRole.USER;

    @Builder.Default
    private Date createdAt = new Date(System.currentTimeMillis() + 7200000);;

    @Builder.Default
    private Date updatedAt = new Date(System.currentTimeMillis() + 7200000);;

    @Builder.Default
    private UserStatus todayStatus = UserStatus.ACTIVE;

    @Builder.Default
    private UserStatus monthStatus = UserStatus.ACTIVE;

    private GeoPoint lastKnownLocation;

    @Builder.Default
    private NavigationPreferences navigationPreferences = NavigationPreferences.builder().build();

    @Builder.Default
    private List<String> recentLocationIds = new ArrayList<>();

    @Builder.Default
    private List<String> recentRouteIds = new ArrayList<>();

    @Builder.Default
    private List<String> favoriteLocationIds = new ArrayList<>();

    @Builder.Default
    private UserStats stats = UserStats.builder().build();

    @Builder.Default
    private NotificationPreferences notificationSettings = NotificationPreferences.builder().build();

    private boolean isValidEmail;
    private boolean hasVoted;

    private Date lastLoginDate;
    private Date lastActivityDate;
    private String lastLoginIp;
}
