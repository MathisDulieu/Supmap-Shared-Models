package com.novus.shared_models.request.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserNavigationPreferencesRequest {
    private boolean avoidTolls;
    private boolean avoidHighways;
    private boolean avoidTraffic;
    private boolean showUsers;
    private int proximityAlertDistance;
    private String preferredTransportMode;
}
