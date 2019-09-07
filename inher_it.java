package inheritance;
interface Interface2 {
    void show();
}
class interfaceI implements Interface2 {
    public void show(){
        System.out.println("the class is showing. implementation successful");
    }
}

public class Interface{
    public static void main(String[] args) {
        interfaceI in = new interfaceI();
        in.show();
    }
}
