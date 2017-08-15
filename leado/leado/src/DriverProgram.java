import Component.Input;
import Filters.Filter;
import Filters.FilterFactory;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Rajat Gupta on 15-Aug-17.
 */
public class DriverProgram  {
    //i'm using just one json but we can use a file system to read multiple jsons
    static String inputJson = "{\"name\":\" RAhka\",\"contact\":\"46465465\",\"alternate_contact\":\"64654654\"," +
            "\"cart_items\":\"1\",\"cart_total\":\"500\"}";
    static int numberOfMsgsSent = 0;

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        boolean invalidRecommendation = false;
       Input input_recommendation;
       ObjectMapper mapper  = new ObjectMapper();
       input_recommendation = mapper.readValue(inputJson, Input.class);
       mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        FilterFactory filterFactory = new FilterFactory();
       //making use of multiple filters possible
       while(true){
           //take filter as input;
           System.out.println("Enter filter: ");

           //int n = reader.nextInt();
           String user_filter = reader.next();
           if(user_filter == null){
               break;
           }
           else {
               Filter filter = filterFactory.getFilter(user_filter);
               //passing notification json to be checked
               if(!filter.filterLogic(input_recommendation)){
                   invalidRecommendation = true;
                   break;
               }
           }
       }
       if(invalidRecommendation == false){
           //hit SMS Api's
       }

    }
}
