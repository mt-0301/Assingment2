public class SmartFan implements SmartDevice {
    private boolean isOn;
    private int speed;

    public SmartFan() {
        this.isOn = false;
        this.speed = 1; // Default speed
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan turned ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan turned OFF");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Fan speed set to " + speed);
    }

    @Override
    public String getStatus() {
        return "Fan is " + (isOn ? "ON" : "OFF") + " at speed level " + speed;
    }
}