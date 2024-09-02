package InterfaceExample;

public interface Drivable {
    void turnLeft();
    void turnRight();
}

class Car implements Drivable {
    public void turnLeft(){
        System.out.println("Car turns left.");
    }

    public void turnRight(){
        System.out.println("Car turns right.");
    }
}

class MotorCycle implements Drivable {
    public void turnLeft(){
        System.out.println("Motor Cycle turns left.");
    }

    public void turnRight(){
        System.out.println("Motor Cycle turns right.");
    }
}

