package com.novus.shared_models.response.Map;

import com.novus.shared_models.common.Route.Route;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetUserRouteHistoryResponse {
    private List<Route> routes;
    private String error;
}
