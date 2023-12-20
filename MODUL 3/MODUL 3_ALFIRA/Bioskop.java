public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private static final int rows = 5;
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private static final int seats_per_rows = 10;
    // TO DO: Create 2 dimensional array to store seat reservation status
    public static int[][] seats = new int[rows][seats_per_rows];
    
    // TO DO: Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats[0][2] = 1;
        seats[1][5] = 1;
        seats[3][7] = 1;
    }
    
    // TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Booking Tiket Bioskop:");
        for (int b = 0; b < rows; b++) {
            for (int k = 0; k < seats_per_rows; k++) {
                System.out.print(seats[b][k] + "\t");
            }
            System.out.println();
        }
    }

    // TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seats[row][seat] == 0) {
            seats[row][seat] = 1;
            System.out.println("Kursi " + row + "," + seat + " berhasil dipesan!");
        } else {
            System.out.println("Error: Kursi " + row + "," + seat + " sudah dipesan!");
        }
    }
}
