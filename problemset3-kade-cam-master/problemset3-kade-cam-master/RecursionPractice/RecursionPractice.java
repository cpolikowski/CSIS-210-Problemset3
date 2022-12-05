public class RecursionPractice
{
    /**
     * @author Cam Polikowski, Kade Garrison
     * @version 3/29/22
     */

    /**
     * This method takes a string as input and returns a new string, 
     * generated recursively.  The new string contains all of the same
     * characters in the same order, except all vowels are in uppercase.
     * 
     * This method should throw an illegal argument exception with an 
     * appropriate message if the input string is null.
     * 
     * @param str The input string.
     * @return A new string with all of the same characters in the same
     * order, except all vowels are in upper case.
     */
    public String vowelToUpperCase(String str)
    {
        String temp = "";
        if (str.length() == 0){
            return "";
        }

        if (str.substring(0,1).equals("a") ||
        str.substring(0,1).equals("e") ||
        str.substring(0,1).equals("i") ||
        str.substring(0,1).equals("o") ||
        str.substring(0,1).equals("u")) {
            temp += str.substring(0,1).toUpperCase();
        } else {
            temp += str.substring(0,1);
        }

        return temp + vowelToUpperCase(str.substring(1,str.length()));
    }

    /**
     * This method take an integer as input an returns an integer such that the
     * order of the digits is reversed and all odd digits are replaced with 0.
     * 
     * @param number An integer.
     * @return An integer such that the order of the digits is reversed and all
     * odd digits are replaced with 0.
     */
    public int evenOdd(int number)
    {
        return Integer.parseInt(evenOddR(number));
    }

    private String evenOddR(int number)
    {

        String str = Integer.toString(number);

        String tempHolder = "";

        if (Integer.parseInt(str.substring(str.length() - 1, str.length())) % 2 == 0 && str.length() > 1){
            tempHolder += str.substring(str.length() - 1);
        } else if ((Integer.parseInt(str.substring(str.length() - 1, str.length())) % 2) != 0 && str.length() > 1){
            tempHolder += "0";
        } else if (str.equals("0") && str.length() == 1) {
            return "0";
        } else if ((Integer.parseInt(str.substring(str.length() - 1, str.length())) % 2) != 0 && str.length() == 1) {
            tempHolder += "";
        } else {
            return (str);
        }

        return (tempHolder + evenOddR(number/10));

    }

    /**
     * This method sums all the values in [array[begin], array[end]] that are greater
     * than the input value greaterThan.
     * 
     * Preconditions:  
     * (1) The array is not null 
     * (2) -1 < begin <= end < the number of elements in the array
     * 
     * This method should throw an illegal argument exception with an 
     * appropriate message if any of the preconditions are violated.
     * 
     * @param array The inter array.
     * @param begin The index into the array in which to begin the sum.
     * @param end The index into the array in which to end the sum.
     * @param greaterThan  Only sum elements if they are greater than this input.
     * @return The sum of elements in [array[begin], array[end]] whose values are
     * greater than the input value.
     */ 

    
    public int sumIn(int[] array, int begin, int end, int greaterThan) throws Exception
    {
        int sum = 0;

        if (begin > end){
            return sum += 0;
            // needs to end the code excpet we suck at coding and have no idea how to do it correctly
        }

        if (end > array.length){
            throw new Exception ("Input parameters need to be adjusted to run method");
        }

        // error handling for when the sliding window reaches the end index
        if (begin == end && array[begin] <= greaterThan){
            return sum += 0;
            // needs to end the code excpet we suck at coding and have no idea how to do it correctly
        }

        // for when begin and end are equal and the value is also greater than greaterThan
        if(array[begin] > greaterThan){
            sum += array[begin];
        } else {
            sum += 0;
        }

        return sum + sumIn(array, ++begin, end, greaterThan);
    }
}


