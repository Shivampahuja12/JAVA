class Calculator {
    int add(int n1, int n2){
        return n1+n2;
    }

    int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    double add(double n1, int n2){
        return n1+n2;
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int res1 = calc.add(12, 30);
        int res2 = calc.add(16, 8,2025);
        double res3 = calc.add(10.25, 15);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}
