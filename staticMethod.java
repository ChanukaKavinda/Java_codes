class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand+ ":" +obj.price+ ":" +obj.name);
    }
}
public class Main {
    public static void main(String[]args){
        Mobile obj1=new Mobile();
        obj1.brand="Samsung";
        obj1.price=1500;
        Mobile.name="Samsung";

        obj1.show();

        Mobile.show1(obj1);
    }
}
