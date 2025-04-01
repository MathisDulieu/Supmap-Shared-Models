package com.novus.shared_models.request.Map;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ShareRouteRequest {
    private Double latitude;
    private Double longitude;
}
