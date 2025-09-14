class Calc {
    int a;  // properties/members which is an instance variable
    public int add(int n1, int n2){   // behaviour/member functions
        System.out.println("In add");
        return n1+n2;
    }
}

public class Classes {
    public static void main(String[] args) {
        Calc calcu = new Calc(); // this is how we create an object

        int n1 = 12, n2 = 30;
        int res = calcu.add(n1, n2);
        System.out.println(res); 
    }
}
