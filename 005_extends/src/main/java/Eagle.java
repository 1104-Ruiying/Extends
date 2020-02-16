

public class Eagle extends Bird {

    private String predator;

    public Eagle() {
    }

    public Eagle(int age, String weight, String speed, String predator) {
        super(age,weight,speed);
        this.predator = predator;
    }

    public void prey(){
        System.out.println("捕食");
    }
}
