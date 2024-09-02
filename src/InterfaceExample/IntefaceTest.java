package InterfaceExample;

public class IntefaceTest {
    public static void main(String args[]){
        Car c = new Car();
        MotorCycle mc = new MotorCycle();

        c.turnLeft();
        c.turnRight();
        mc.turnLeft();
        mc.turnRight();
    }
}
