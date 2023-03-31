package mailService;

class Lift {
    private int currentFloor;
    private int destinationFloor;

    public Lift() {
        currentFloor = 0;
    }

    public void setDestinationFloor(int floor) {
        destinationFloor = floor;
    }

    public void move() {
        if (destinationFloor > currentFloor) {
            currentFloor++;
            System.out.println("Lift moving up to floor " + currentFloor);
        } else if (destinationFloor < currentFloor) {
            currentFloor--;
            System.out.println("Lift moving down to floor " + currentFloor);
        } else {
            System.out.println("Lift already at floor " + currentFloor);
        }
    }

    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setDestinationFloor(5);
        lift.move();
        lift.setDestinationFloor(2);
        lift.move();
    }
}
