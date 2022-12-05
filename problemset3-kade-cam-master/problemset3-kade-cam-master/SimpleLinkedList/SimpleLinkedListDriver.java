/** * Write a description of class SimpleLinkedListDriver here.
 *
 * @author Kade Garrison Cam Polikowski 
 *
 * 
 * @version 3-31-22
 */
public class SimpleLinkedListDriver{    
    public static void main(String[] args) throws Exception {
        SimpleLinkedList<Integer> test = new SimpleLinkedList<Integer>();
        test.add(5);
        test.add(100);
        test.add(720);
        test.add(66);
        test.add(9);
        System.out.println(test.toString());
        System.out.println(test.subList(1,1).toString());
        test.add(53);
        test.add(67);
        System.out.println("Adjusted original list");
        System.out.println(test.toString());
        System.out.println(test.subList(0,2).toString());
        System.out.println(test.subList(0,2).subList(0,1).toString());
    }
}
