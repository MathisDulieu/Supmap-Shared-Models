package com.novus.shared_models.response.User;

import com.novus.shared_models.common.GeoPoint;
import com.novus.shared_models.common.Location.LocationType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetAuthenticatedUserDetailsLocationResponse {
    private String name;
    private String formattedAddress;
    private GeoPoint coordinates;
    private String placeId;
    private String street;
    private String city;
    private String postalCode;
    private String country;
    private LocationType locationType;
}
