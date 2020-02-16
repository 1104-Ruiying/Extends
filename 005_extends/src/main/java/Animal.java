public class Animal {

    int age;
    String weight;

    public Animal() { //无参传递
    }

    public Animal(int age, String weight) { //有参传递
        this.age = age;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

}
