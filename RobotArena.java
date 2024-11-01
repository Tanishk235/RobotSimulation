package robotSimulation;
import java.util.ArrayList;
import java.util.Random;

public class RobotArena {
    private int width;
    private int height;
    private ArrayList<Robot> robots;
    private Random randomGenerator;

    // Constructor
    public RobotArena(int width, int height) {
        this.width = width;
        this.height = height;
        this.robots = new ArrayList<>();
        this.randomGenerator = new Random();
    }

    // Method to add a Robot at a random position in the arena
    public void addRobot() {
        int randomX = randomGenerator.nextInt(width);
        int randomY = randomGenerator.nextInt(height);
        Robot robot = new Robot(randomX, randomY);
        robots.add(robot);
    }

    /**
     * Show all the Robots in the interface
     * @param c the canvas in which Robots are shown
     */
    public void showRobots(ConsoleCanvas c) {
        for (Robot robot : robots) {
            robot.displayRobot(c);
        }
    }

    // Getter methods for the arena size
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Arena ").append(width).append(" by ").append(height).append(" with the following robots:\n");
        for (Robot robot : robots) {
            sb.append(robot.toString()).append("\n");
        }
        return sb.toString();
    }

    // Main method to test the class
    public static void main(String[] args) {
        RobotArena a = new RobotArena(20, 10); // create Robot arena
        a.addRobot();
        a.addRobot();
        a.addRobot();
        System.out.println(a.toString()); // print arena size and where robots are

        // Display robots on the canvas
        ConsoleCanvas canvas = new ConsoleCanvas(20, 10, "32005757");
        a.showRobots(canvas);
        System.out.println(canvas.toString());
    }
}
