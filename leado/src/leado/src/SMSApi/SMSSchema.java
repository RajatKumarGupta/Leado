package SMSApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Rajat Gupta on 15-Aug-17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SMSSchema {

    private String contact;
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
