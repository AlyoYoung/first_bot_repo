public class Person {
    public  static int count = 0;
    public final double PI=3.14;
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void printName(){
        System.out.println("Имя: "+name);

    }
}
