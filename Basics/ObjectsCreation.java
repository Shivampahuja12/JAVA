class Box {
    private int length, breadth, height;    // instance member variable 

    public void setDimensions(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }

    public void showDimension(){
        System.out.println("L = " + length);
        System.out.println("B = " + breadth);
        System.out.println("H = " + height);

    }

}

public class ObjectsCreation {
    public static void main(String[] args) {
        Box smallBox = new Box();   // smallBox is a pointer variable pointing to current object instance    
        // later on this object instance will be deleted automatically by the garbage collector
        smallBox.setDimensions(12, 4, 5);
        smallBox.showDimension();
        smallBox = new Box();   // pointing to the new box and the previous one will named as garbage block 
    }
}
