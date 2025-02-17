class Calc{
    int a;

    public int add(int n1, int n2){

        int r=n1+n2;
        return r;
    }
}


public class classobj {
    public static void main(String[] args) {

        int num1=4;
        int num2=5;
        
        Calc c = new Calc();
        int result = c.add(num1,num2);
        System.out.println(result);
    }
}
