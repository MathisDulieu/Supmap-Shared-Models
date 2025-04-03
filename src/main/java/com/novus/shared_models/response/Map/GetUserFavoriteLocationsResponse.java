package com.novus.shared_models.response.Map;

import com.novus.shared_models.common.Location.Location;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetUserFavoriteLocationsResponse {
    private List<Location> locations;
    private String error;
}
