public class Main{

    public static void main (String [] args){

        VryAdvCalc obj = new VryAdvCalc();

        int r1= obj.add(4,5);
        int r2= obj.sub(9,4);
        int r3= obj.multi(3,2);
        int r4 = obj.div(15,5);
        double r5 = obj.pow(4,4);

        System.out.println(+r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}