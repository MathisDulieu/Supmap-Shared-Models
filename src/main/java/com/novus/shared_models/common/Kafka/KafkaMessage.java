package com.novus.shared_models.common.Kafka;

import com.novus.shared_models.common.User.User;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class KafkaMessage {
    private Map<String, String> request;
    private String ipAddress;
    private User authenticatedUser;
}
