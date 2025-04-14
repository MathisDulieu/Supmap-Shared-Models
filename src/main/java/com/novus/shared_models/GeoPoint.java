package com.novus.shared_models;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GeoPoint {
    private Double latitude;
    private Double longitude;
}
