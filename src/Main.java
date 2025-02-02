

class Ride{
    String name;
    int  capacity;
    int speed;

    public Ride(String name, int capacity, int speed)
    {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    public void startRide()
    {
        System.out.println("The ride " + name +  " has started");
    }

    public void stopRide()
    {
        System.out.println("The ride " + name +  " has stopped");
    }

    public void displayInfo()

    {
        System.out.println("Ride name: " + name);
        System.out.println("Ride capacity: " + capacity + " people can be accomodated");
        System.out.println("Ride speed: " + speed + " km/hr");
    }

}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class SpinningTeaCup extends Ride
{
    double rotation_speed;
    public SpinningTeaCup(String name, int capacity, int speed, double rotation_speed )
    {

        super(name, capacity, speed);
        this.rotation_speed = rotation_speed;


    }

    @Override
    public void startRide()
    {
        super.startRide();
        System.out.println("The " + super.name + " is running at " + rotation_speed);
    }

    public void spin()
    {
        super.displayInfo();

    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Rotation Speed: " + rotation_speed + " RPM");
    }


}
public class Main {

    public static void main(String[] args)

    {
        SpinningTeaCup excalibur = new SpinningTeaCup("Excalibur ride in Germany", 20, 10, 15.0);
        excalibur.startRide();
        excalibur.spin();
        excalibur.displayInfo();
        excalibur.stopRide();




    }
    }
