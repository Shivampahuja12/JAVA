/* 
    1. Primitive Data Type: These are the basic building blocks that store simple values directly in memory. Examples of primitive data types are:

    boolean
    char
    byte
    short
    int
    long
    float
    double


    +----------+--------+-------------+----------------------------------------------+
    | DataType |  Size  | Default Val | Range                                        |
    +----------+--------+-------------+----------------------------------------------+
    | byte     |  8 bit | 0           | -128 to 127                                  |
    | short    | 16 bit | 0           | -32,768 to 32,767                            |
    | int      | 32 bit | 0           | -2,147,483,648 to 2,147,483,647              |
    | long     | 64 bit | 0L          | -9,223,372,036,854,775,808                   |
    |          |        |             | to 9,223,372,036,854,775,807                 |
    | float    | 32 bit | 0.0f        | ±3.40282347E+38F (~6–7 digits precision)     |
    | double   | 64 bit | 0.0d        | ±1.79769313486231570E+308 (~15–16 digits)    |
    | char     | 16 bit | '\u0000'    | 0 to 65,535 (Unicode characters)             |
    | boolean  |  1 bit*| false       | true / false (size JVM dependent, ~1 byte)   |
    +----------+--------+-------------+----------------------------------------------+



    2. Non-Primitive Data Types (Object Types): These are reference types that store memory addresses of objects. Examples of Non-primitive data types are

    String
    Array
    Class
    Interface
    Object

    Key Characteristics:
        Default value is null
        Objects are created using the new keyword
        Memory allocation happens on the heap
        Multiple variables can reference the same object



    Type Conversion and Casting
        Java supports both implicit and explicit type conversions:

*/

public class datatypes {
    public static void main(String[] args) {

        // Primitive
        int i = 129;
        float f = 10.101f;
        byte b = 100;
        short s = 2300;
        long l = 1000000000L;
        double d = 3.141592653589793;
        char c = 'M';
        boolean flag = true;

        System.out.println("int = " + i);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("byte = " + b);
        System.out.println("long = " + l);
        System.out.println("short = " + s);
        System.out.println("char = " + c);
        System.out.println("boolean = " + flag);

        // Non-Primitive
        // Strings 
        // Important: Strings are immutable in Java - once created, they cannot be changed.
        String str = "Shivam";  // string literal
        String message = new String("Hello Shivam");
        System.out.println("Name: " + str);
        System.out.println("Message: "+ message);


        // arrays
        // Declaration and initialization
        int[] numbers = {10, 20, 30, 40};
        String[] names = {"Alice", "Bob", "Charlie"};


        // Alternative declaration
        int[] scores = new int[5]; // Array of size 5, all elements = 0
        String[] cities = new String[3]; // Array of size 3, all elements = null

        System.out.println(numbers[0]);
        System.out.println(names[0]);
        System.out.println(cities[0]);
        System.out.println(scores[0]);


        // implicit conversion (widening)
        int num = 100;
        long bigNum = num;  // int -> long(automatic)
        double decimal = bigNum; // long -> double(automatic)
        System.out.println(decimal);


        // explicit conversion (narrowing) - requires casting
        double pi = 3.14159;
        int roundedPi = (int) pi;
        System.out.println(roundedPi);

        // string conversions
        String numstr= "1230";
        int number = Integer.parseInt(numstr);
        String result = Integer.toString(number);
        System.out.println(result);
    }
}
