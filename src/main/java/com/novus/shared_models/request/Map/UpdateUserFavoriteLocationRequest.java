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
public class UpdateUserFavoriteLocationRequest {
    private String name;
    private String formattedAddress;
    private GeoPoint coordinates;
    private String street;
    private String city;
    private String postalCode;
    private String country;
    private String locationType;
}
