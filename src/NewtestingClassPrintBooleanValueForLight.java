public class NewtestingClassPrintBooleanValueForLight

{
}

//output will be true false false

class NewTestingClass11 {
    boolean isOn;

    void turnOn() {
        isOn= true;
    }
    void turnOff() {
        isOn= false;
    }
}
class NewTestingClass2{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NewTestingClass11 light1= new NewTestingClass11();
        NewTestingClass11 light2= new NewTestingClass11();

        light1.turnOn();
        System.out.println(light1.isOn);

        light1.turnOff();
        System.out.println(light1.isOn);
        System.out.println(light2.isOn);
    }
}
