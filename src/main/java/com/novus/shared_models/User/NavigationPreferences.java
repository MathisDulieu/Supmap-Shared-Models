package com.novus.shared_models.User;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class NavigationPreferences {
    private boolean avoidTolls;
    private boolean avoidHighways;
    private boolean avoidTraffic;

    @Builder.Default
    private TransportMode preferredTransportMode = TransportMode.CAR;
}