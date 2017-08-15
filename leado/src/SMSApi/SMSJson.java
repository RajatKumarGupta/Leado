package SMSApi;

import Component.Input;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Rajat Gupta on 15-Aug-17.
 */
public class SMSJson {
    public boolean isSMSsend(Input input_recommendation){
        SMSSchema smsSchema = new SMSSchema();
        smsSchema.setContact(input_recommendation.getContact());
        smsSchema.setMessage("you have " + input_recommendation.getCart_items() +" in your cart.");
        ObjectMapper objectMapper = new ObjectMapper();
        String output;
        try{
             output = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smsSchema);
        } catch (IOException e){
            return false;
        }
        System.out.println("\n\nfinal output: " + output);
        return true;
    }
}
