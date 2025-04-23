package com.novus.shared_models.common.Alert;

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
@Document(collection = "ALERTS")
public class Alert {

    @Id
    private String id;

    private AlertType type;
    private GeoPoint location;
    private String roadName;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    private Date expiresAt;
    private String reportedByUserId;

}
