

public class Bird  extends Animal{

   String speed;

    public Bird() {
    }

    public Bird(int age, String weight, String speed) {
        super(age, weight);
        this.speed = speed;
    }

    public void fly(){
        System.out.println("飞行方法");
    }
}
