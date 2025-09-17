class Computer {
    public void playMusic(){    // method
        System.out.println("Sidhu Moose Wala playing");
    }     
    
    public String getMePen(int cost){
        if (cost >= 20){
            return "Pen purchased";
        }
        return "Need more money";
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
