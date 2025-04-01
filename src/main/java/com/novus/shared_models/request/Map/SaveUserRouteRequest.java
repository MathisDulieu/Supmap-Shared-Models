package com.novus.shared_models.request.Map;

import com.novus.shared_models.GeoPoint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaveUserRouteRequest {
    private String startAddress;
    private String endAddress;
    private GeoPoint startPoint;
    private GeoPoint endPoint;
    private Double kilometersDistance;
    private Integer estimatedDurationInSeconds;
}
