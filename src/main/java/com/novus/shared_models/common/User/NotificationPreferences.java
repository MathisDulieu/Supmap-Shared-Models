package com.novus.shared_models.common.User;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class NotificationPreferences {
    private boolean emailEnabled;

    @Builder.Default
    private int proximityAlertDistance = 500;
}
