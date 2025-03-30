package com.novus.shared_models.Newsletter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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