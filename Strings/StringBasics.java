public class StringBasics {

    /* 
        Everything starts with Captical letter is a class like
        String - S in string here String is a class  

        Concepts in strings:
        1. String Pool (it is the seperate memory structure inside the heap - all the similar kind of stuff is stored here)
        2. Immutability - because of security reasons
    */
    public static void main(String[] args) {
        // int[] a = {2,3,4,5,6, 23,45};
        
        String name = "Shivam Pahuja";  // here shivam pahuja is an object, name is a reference variable and String is a datatype or class
        
        name = "Pahuja";    // here i am not changing the object (break the rule of immutability) but making a new object and make name pointing to the new object and the previous object will be cleared by the garbage collection

        System.out.println(name);
    }
}
