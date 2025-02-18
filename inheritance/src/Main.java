public class Main{
    public static void main(String[]args){

        advCalc obj = new advCalc();
        int r1=obj.add(4, 5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(2,3);
        int r4=obj.div(16,4);

        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}