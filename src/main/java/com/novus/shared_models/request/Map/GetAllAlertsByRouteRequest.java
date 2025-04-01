package com.novus.shared_models.request.Map;

import com.novus.shared_models.GeoPoint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllAlertsByRouteRequest {
    private List<GeoPoint> routePoints;
}
