public class SmartTemperatureControl implements SmartDevice {
    private int temperature;
    private boolean isACOn;
    private boolean isHeaterOn;

    public SmartTemperatureControl() {
        this.temperature = 24; // Default temperature
        this.isACOn = false;
        this.isHeaterOn = false;
    }

    @Override
    public void turnOn() {
        System.out.println("Temperature control system turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Temperature control system turned OFF.");
        isACOn = false;
        isHeaterOn = false;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + "°C");

        adjustTemperatureControl();
    }

    private void adjustTemperatureControl() {
        if (temperature < 18) {
            isACOn = false;
            isHeaterOn = true;
            System.out.println("Heater turned ON to maintain warmth.");
        } else if (temperature > 26) {
            isACOn = true;
            isHeaterOn = false;
            System.out.println("Air Conditioner turned ON to cool down.");
        } else {
            isACOn = false;
            isHeaterOn = false;
            System.out.println("Temperature is within a comfortable range.");
        }
    }

    @Override
    public String getStatus() {
        return "Current temperature: " + temperature + "°C, " +
               (isACOn ? "AC is ON" : "AC is OFF") + ", " +
               (isHeaterOn ? "Heater is ON" : "Heater is OFF");
    }
}
