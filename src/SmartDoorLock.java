public class SmartDoorLock {
    private boolean isLocked;

    public SmartDoorLock() {
        this.isLocked = true; // Default locked
    }

    public void lock() {
        isLocked = true;
        System.out.println("Door locked!");
    }

    public void unlock() {
        isLocked = false;
        System.out.println("Door unlocked!");
    }

    public String getStatus() {
        return "Door is " + (isLocked ? "Locked" : "Unlocked");
    }
}