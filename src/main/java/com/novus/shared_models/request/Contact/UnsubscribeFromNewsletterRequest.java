package com.novus.shared_models.request.Contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnsubscribeFromNewsletterRequest {
    private String email;
}
