package com.novus.shared_models.response.Map;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class HourlyRouteRecalculationResponse {
    private Integer hour;
    private Integer recalculationCount;
}