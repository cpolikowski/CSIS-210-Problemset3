
/**
 * Write a description of class RecursionPracticeDriver here.
 *
 * @author Cam Polikowski, Kade Garrison
 * @version 3/29/22
 */
public class RecursionPracticeDriver
{
    public static void main (String[] args){
        RecursionPractice rp = new RecursionPractice();

        System.out.println("-------------------------");
        System.out.println("Testing vowelToUpperCase: (Input = Leaves are falling, autumn is calling)");
        System.out.println("Expected: LEAvEs ArE fAllIng, AUtUmn Is cAllIng! ");

        String tester = "Leaves are falling, autumn is calling!";
        System.out.println("Result: " + rp.vowelToUpperCase(tester));
        System.out.println("-------------------------");
        
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Testing evenOdd: (Input = 3241)");
        System.out.println("Expected: 420");
        System.out.println("Result: " + rp.evenOdd(3421));
        System.out.println("-------------------------");
        
        System.out.println();
    }
}
