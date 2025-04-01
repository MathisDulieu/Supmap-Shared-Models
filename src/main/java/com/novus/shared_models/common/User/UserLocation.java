package com.novus.shared_models.common.User;

import com.novus.shared_models.GeoPoint;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class UserLocation {
    private GeoPoint coordinates;
    private Date timestamp;
    private Double speed;
    private Double heading;
    private String locationContext;
}
