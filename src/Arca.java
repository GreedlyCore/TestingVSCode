public class Arca {
    
    public static void main(String[] args) {
     
        Dog dog = new Dog("Dylan", 130);
        System.out.println(dog.getAge());
        System.out.println("okay");

    }



}

class Dog{

    private int age;
    private String name;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}