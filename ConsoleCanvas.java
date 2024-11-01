package robotSimulation;

public class ConsoleCanvas {
    private char[][] canvas; // 2D array for the canvas
    private String studentNumber;

    // Constructor
    public ConsoleCanvas(int width, int height, String studentNumber) {
        this.studentNumber = studentNumber;
        canvas = new char[height + 2][width + 2]; // +2 for the border

        // Fill the canvas with spaces and borders
        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                if (i == 0 || i == height + 1 || j == 0 || j == width + 1) {
                    canvas[i][j] = '#'; // Border
                } else {
                    canvas[i][j] = ' '; // Inside the border
                }
            }
        }

        // Add student number in the top border
        int start = (width + 2 - studentNumber.length()) / 2;
        for (int i = 0; i < studentNumber.length(); i++) {
            canvas[0][start + i] = studentNumber.charAt(i);
        }
    }

    // Method to place a character on the canvas
    public void showIt(int x, int y, char c) {
        canvas[y + 1][x + 1] = c; // +1 to account for the border
    }

    // Method to convert the canvas to a string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] row : canvas) {
            for (char c : row) {
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        ConsoleCanvas c = new ConsoleCanvas(10, 5, "32005757"); // create a canvas
        c.showIt(4, 3, 'R'); // add a Robot at 4,3
        System.out.println(c.toString()); // display result
    }
}
