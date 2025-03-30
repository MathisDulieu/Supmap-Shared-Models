package com.novus.shared_models.NewsletterSubscription;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@Document(collection = "NEWSLETTER_SUBSCRIPTIONS")
public class NewsletterSubscription {

    @Id
    private String id;

    private String email;
    private String userId;

    @Builder.Default
    private boolean isActive = true;

    private Date subscribedAt;
    private Date unsubscribedAt;
    private String unsubscribeReason;
    private String lastNewsletterSentId;
    private Date lastNewsletterSentDate;

}
