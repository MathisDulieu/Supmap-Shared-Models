package com.novus.shared_models.response.Map;

import com.novus.shared_models.common.Alert.Alert;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetAllAlertsByPositionResponse {
    private List<Alert> alerts;
    private String error;
}
