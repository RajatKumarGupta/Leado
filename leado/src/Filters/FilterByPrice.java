package Filters;

import Component.Input;

/**
 * Created by Rajat Gupta on 15-Aug-17.
 */
public class FilterByPrice implements Filter {
    public long lowerPriceRange = 0;
    FilterByPrice(){
        //get input conditions from user
    }
    @Override
    public boolean filterLogic(Input input) {
        //actual logic for filtering data;
        if (input.getCart_total() >= lowerPriceRange)
        return true;
        else return false;
    }
}
