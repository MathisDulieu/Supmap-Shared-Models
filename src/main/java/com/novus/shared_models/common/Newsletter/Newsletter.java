package com.novus.shared_models.common.Newsletter;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "NEWSLETTERS")
public class Newsletter {

    @Id
    private String id;

    @Indexed
    private String title;
    private String content;
    private String htmlContent;
    private String subject;
    private NewsletterType type;

    @Builder.Default
    private Date sentDate = new Date();

    private String createdByUserId;

}