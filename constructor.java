class Human{
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "Chanuka";
    }
        public int getAge(){
            return age;
        }
        public void setAge(int a){
            age = 22;
        }

        public String getName(){
            return name;
        }
        public void setName(String n){
            name = "Chanuka";
        }
    }

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
