package Filters;

/**
 * Created by Rajat Gupta on 15-Aug-17.
 */
public class FilterFactory {
    public Filter getFilter(String filterType){
        if(filterType.equalsIgnoreCase(FilterEnum.Price.toString())){
            return new FilterByPrice();
        }
        return  null;
    }
}
