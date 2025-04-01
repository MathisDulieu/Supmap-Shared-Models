package com.novus.shared_models.response.Map;

import com.novus.shared_models.GeoPoint;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetUserFavoriteLocationsResponse {
    private String id;
    private String name;
    private String formattedAddress;
    private GeoPoint coordinates;
    private String street;
    private String city;
    private String postalCode;
    private String country;
    private String locationType;

    private String error;
}
