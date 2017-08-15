package Filters;

import Component.Input;

import java.util.Scanner;

/**
 * Created by Rajat Gupta on 15-Aug-17.
 */
public class FilterByPrice implements Filter {
    Scanner reader = new Scanner(System.in);  // Reading from System.in

    public long lowerPriceRange = 0;
    FilterByPrice(){
        //get input conditions from user
        System.out.println("Enter a lower Price Range: ");
        lowerPriceRange = reader.nextLong();
    }
    @Override
    public boolean filterLogic(Input input) {
        //actual logic for filtering data;
        if (input.getCart_total() >= lowerPriceRange)
        return true;
        else return false;
    }
}
