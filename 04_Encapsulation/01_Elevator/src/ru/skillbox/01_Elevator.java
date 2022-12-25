public class Elevator {
    private int currentFloor = 1;
    private int minFloor = 0;
    private double maxFloor = 0.0;


    public Elevator(int minFloor, double maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }
    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }
    public void move(int floor) {
        if(floor > maxFloor || floor < minFloor) {
            System.out.println("Неверно указан этаж!");
        }else {
            while(currentFloor < floor) {
                moveUp();
                System.out.println(currentFloor);
            }
            while(currentFloor > floor) {
                moveDown();
                System.out.println(currentFloor);
            }
        }


    }

}
