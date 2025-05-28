import java.util.Scanner;

public class SmartHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartLight light = new SmartLight();
        SmartFan fan = new SmartFan();
        SmartDoorLock doorLock = new SmartDoorLock();
        SmartTemperatureControl tempControl = new SmartTemperatureControl();

        while (true) {
            System.out.println("\nSmart Home Automation System");
            System.out.println("1. Turn ON/OFF Light");
            System.out.println("2. Adjust Light Brightness");
            System.out.println("3. Turn ON/OFF Fan");
            System.out.println("4. Adjust Fan Speed");
            System.out.println("5. Lock/Unlock Door");
            System.out.println("6. Set Room Temperature");
            System.out.println("7. View Device & Temperature Status");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Turn Light ON (1) or OFF (0): ");
                    int lightChoice = scanner.nextInt();
                    if (lightChoice == 1) light.turnOn();
                    else light.turnOff();
                    break;
                case 2:
                    System.out.print("Enter brightness (0-100): ");
                    int brightness = scanner.nextInt();
                    light.setBrightness(brightness);
                    break;
                case 3:
                    System.out.print("Turn Fan ON (1) or OFF (0): ");
                    int fanChoice = scanner.nextInt();
                    if (fanChoice == 1) fan.turnOn();
                    else fan.turnOff();
                    break;
                case 4:
                    System.out.print("Enter fan speed (1-5): ");
                    int speed = scanner.nextInt();
                    fan.setSpeed(speed);
                    break;
                case 5:
                    System.out.print("Lock Door (1) or Unlock Door (0): ");
                    int lockChoice = scanner.nextInt();
                    if (lockChoice == 1) doorLock.lock();
                    else doorLock.unlock();
                    break;
                case 6:
                    System.out.print("Enter desired temperature (°C): ");
                    int temp = scanner.nextInt();
                    tempControl.setTemperature(temp);
                    break;
                case 7:
                    System.out.println(light.getStatus());
                    System.out.println(fan.getStatus());
                    System.out.println(doorLock.getStatus());
                    System.out.println(tempControl.getStatus());
                    break;
                case 8:
                    System.out.println("Exiting system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
