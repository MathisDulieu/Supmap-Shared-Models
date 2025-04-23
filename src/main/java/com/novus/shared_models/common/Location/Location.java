package com.novus.shared_models.common.Location;

import com.novus.shared_models.GeoPoint;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@Document(collection = "LOCATIONS")
public class Location {

    @Id
    private String id;

    private String name;
    private String formattedAddress;
    private GeoPoint coordinates;
    private String placeId;
    private String street;
    private String city;
    private String postalCode;
    private String country;
    private LocationType locationType;
    private Date createdAt;
    private Date updatedAt;
    private String userId;
}
