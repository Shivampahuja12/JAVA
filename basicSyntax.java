/* 
    class → keyword to declare a class.

    Hello → class name (must match the filename: Hello.java). 
    
    public → accessible everywhere.

    static → runs without creating an object.

    void → no return value.

    main → special method where program starts.

    String[] args → command line arguments (array of Strings). 

    System.out → output stream (for printing).

    println() → prints with a new line.

    ; → every statement ends with a semicolon.

    Case-sensitive → Hello and hello are different.

    File name = Class name → If class is Hello, file must be Hello.java.

    Every statement ends with ;.

    Curly braces {} → Group blocks of code.\





    ** In Java, if you declare and assign a local variable but never use it, some compilers (or IDEs like VS Code with error-level linting) will warn:

    ** “The value of the local variable ___ is not used”

    ** This is not a runtime error, it’s just a compiler warning.
    ** But if you’re in a strict environment (or your settings treat warnings as errors), it might stop execution.
*/

public class basicSyntax {
    public static void main(String[] args){
        int age = 21;                 // integer variable
        String name = "Ravi";         // string variable
        double marks = 92.5;          // decimal number
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
