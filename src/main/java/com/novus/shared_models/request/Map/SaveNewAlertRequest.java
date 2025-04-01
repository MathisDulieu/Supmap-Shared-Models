package com.novus.shared_models.request.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaveNewAlertRequest {
    private String alertType;
    private Double latitude;
    private Double longitude;
}
