package com.novus.shared_models.response.Map;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class GetNearbyUsersResponse {
    private List<GetNearbyUsersUserResponse> users;
    private String error;
}
