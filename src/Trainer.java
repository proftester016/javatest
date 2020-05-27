class Trainer {
    public void display(String name) {
        System.out.println("Am a trainer..");
        print(name);
    }
    public void print(String name) {
        System.out.println("I train " +name+ " ");
    }
}

class Trainee extends Trainer {

    //Answer is : Am a trainer..
    //I train Java
    //I want to learn: Java
    //Am a trainee..
    //I train Java
    //I want to learn: Java


    String myName;
    public Trainee(String myName) {
        super();
        this.myName = myName;
    }
    public void display(String name) {
        super.display(name);
        System.out.println("Am a trainee..");
        print(name);
    }
    public void print(String name) {
        super.print(name);
        System.out.println("I want to learn: " +name+ " ");
    }
    public static void main(String[] args) {
        Trainer trainee = new Trainee("XYZ");
        trainee.display("Java");
    }
}