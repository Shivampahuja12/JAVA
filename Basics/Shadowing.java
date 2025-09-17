public class Shadowing {
    static int x = 12; // instance varibale/ global variable, this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 12
        int x = 30; // the class variable is shadowed by this, scope will begin when the value is initialized, accessing the value between the declaration and initialization will give an error
        System.out.println(x); // 30
        fun();  // 12
    }

    static void fun(){
        System.out.println(x); // 12
    }
}
