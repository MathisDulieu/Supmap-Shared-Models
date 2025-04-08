package com.novus.shared_models.common.Kafka;

import com.novus.shared_models.common.User.User;
import lombok.*;

import java.util.Map;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class KafkaMessage {
    private Map<String, String> request;
    private String ipAddress;
    private User authenticatedUser;
    private String timeStamp;
}
