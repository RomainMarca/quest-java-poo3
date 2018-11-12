
public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


    @Override
    public void takeOff() {
            System.out.println("Eagle take off in the sky");
    }

    @Override
    public int ascend(int meters) {
        int heigth = 100 + (int)(Math.random() * ((1000 - 100) + 1));
        System.out.println("Eagle flies upward, altitude:" + heigth);
        return heigth;
    }

    @Override
    public int descend(int meters) {
        int heigth = 100 + (int)(Math.random() * ((1000 - 100) + 1));
        System.out.println("Eagle flies upward, altitude:" + heigth);
        return heigth;
    }

    @Override
    public void glide() {  

    }

    @Override
    public void land() {
        System.out.println("Eagle lands on the ground");
    }


}