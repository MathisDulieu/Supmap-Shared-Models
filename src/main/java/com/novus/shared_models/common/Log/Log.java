package com.novus.shared_models.common.Log;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "LOGS")
public class Log {

    @Id
    private String id;

    private String service;
    private LogLevel level;
    private String message;
    private String action;
    private String userId;
    private String ipAddress;
    private String requestPath;
    private HttpMethod requestMethod;
    private String stackTrace;

    @Builder.Default
    private Date timestamp = new Date();

}