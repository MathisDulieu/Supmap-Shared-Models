package com.novus.shared_models.common;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class GeoPoint {
    private Double latitude;
    private Double longitude;
}
