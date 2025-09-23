public class Comparison {
    public static void main(String[] args) {

        /* 
            Both a and b are pointing to the same object 
            
            Q. As they both are pointing to the same object then if we change the value of one variable will it change the value of other ?
            -> No, both the string ("Shivam") are in the String pool and string are immutable in java that's why they can't be changed.
        */
        String a = "Shivam";
        String b = "Shivam";


        // ==
        // System.out.println(a==b);
        
        /* 
            Q. Then how to create two different objects of same value
            -> use new keyword
        */
        
        /* String one = new String("Shivam");
        String two = new String("Shivam");
        System.out.println(one==two);
        System.out.println(one.equals(two)); */


        // to access string elements 
        System.out.print(a.charAt(0));
        System.out.print(a.charAt(1));
        System.out.print(a.charAt(2));
        System.out.print(a.charAt(3));
    }
}
