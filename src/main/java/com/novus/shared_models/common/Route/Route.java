package com.novus.shared_models.common.Route;

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
@Document(collection = "ROUTES")
public class Route {

    @Id
    private String id;
    private String startAddress;
    private String endAddress;
    private GeoPoint startPoint;
    private GeoPoint endPoint;
    private Double kilometersDistance;
    private Integer estimatedDurationInSeconds;

    @Builder.Default
    private Date createdAt = new Date();

    private String userId;

}
