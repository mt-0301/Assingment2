public class SmartLight implements SmartDevice {
    private boolean isOn;
    private int brightness;

    public SmartLight() {
        this.isOn = false;
        this.brightness = 50; // Default brightness
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        brightness = 0; // Reset brightness when light is off
        System.out.println("Light turned OFF, brightness set to 0");
    }

    public void setBrightness(int brightness) {
        if (isOn) {
            this.brightness = brightness;
            System.out.println("Brightness set to " + brightness + "%");
        } else {
            System.out.println("Cannot adjust brightness, light is OFF!");
        }
    }

    @Override
    public String getStatus() {
        return "Light is " + (isOn ? "ON with brightness " + brightness + "%" : "OFF with brightness 0%");
    }
}
