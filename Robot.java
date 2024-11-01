package robotSimulation;

public class Robot {
    private int x;
    private int y;
    private int id;
    private static int idCounter = 0;

    // Constructor
    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
        this.id = idCounter++;
    }

    /**
     * Display the Robot in the canvas
     * @param c the canvas used
     */
    public void displayRobot(ConsoleCanvas c) {
        c.showIt(x, y, 'R'); // Call the showIt method to put 'R' where the Robot is
    }

    // toString method
    @Override
    public String toString() {
        return "Robot " + id + " is at " + x + ", " + y;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Robot d = new Robot(5, 3); // create Robot
        System.out.println(d.toString()); // print where it is

        Robot e = new Robot(2, 7); // create another Robot
        System.out.println(e.toString()); // print where it is

        // Assuming ConsoleCanvas is defined and has a showIt method
        ConsoleCanvas canvas = new ConsoleCanvas(10, 10, "32005757");
        d.displayRobot(canvas); // display Robot d on the canvas
        e.displayRobot(canvas); // display Robot e on the canvas
        System.out.println(canvas.toString()); // display the canvas
    }
}
