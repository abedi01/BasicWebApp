package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist!";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "Hey";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] parts = query.split("%20");

            int num1 = Integer.parseInt(parts[-1]);
            int num2 = Integer.parseInt(parts[-2].substring(0, parts[-2].length()-2));

            return Integer.toString(Integer.max(num1, num2));
        }

        return "";

    }
}
