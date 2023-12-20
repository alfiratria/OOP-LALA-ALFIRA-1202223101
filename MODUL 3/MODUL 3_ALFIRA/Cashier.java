public class Cashier extends Bioskop {

    // TO DO: Create a method to print ticket
    public void printTicket(User user, int[][] seats) {
        boolean isBooked = false;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!((i == 1 && j == 5) || (i == 2 && j == 6) || (i == 3 && j == 7))) {
                    if (seats[i][j] == 1) {
                        isBooked = true;
                        System.out.println("Mencetak tiket...");
                        System.out.println("====================");
                        System.out.println("Nama  : " + user.getName());
                        System.out.println("Phone : " + user.getNoHandPhone());
                        System.out.println("Seat  : " + "[" + i + "][" + j + "]");
                        System.out.println("====================");
                        System.out.println("Selamat Menonton!");
                    }
                }
            }
        }
        if (!isBooked) {
            System.out.println("Maaf, kursi yang dipilih tidak tersedia.");
        }
    }
}
