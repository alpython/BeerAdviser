package com.alpython.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("Purple")) {
            brands.add("Purple Jack");
            brands.add("Violet Weed");
        }
        else if (color.equals("Rainbow")) {
            brands.add("Prisma High");
            brands.add("7 Colors Vodka");
        }
        else if (color.equals("Aryt. Fuck it.")) {
            brands.add("Go fuck youself.");
        }
        else {
            brands.add("You fkin high?");
        }
        return brands;
    }
}
