package com.novus.shared_models.request.User;

import com.novus.shared_models.GeoPoint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserLocationRequest {
    private GeoPoint location;
}
