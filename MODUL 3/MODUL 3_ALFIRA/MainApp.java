import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO: Create a Scanner object to receive input from the user
        Scanner scanner = new Scanner(System.in);
        // TO DO: Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();
        User user = new User("Alfira", "1202223101"); // Placeholder values, to be set later

        // TO DO: Take the name from the user, make sure it is not empty
        System.out.println("==== Silahkan Register ====");
        System.out.print("Nama = ");
        String nama = scanner.nextLine();
        while (nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong. Silahkan masukkan nama Anda lagi.");
            System.out.print("Nama = ");
            nama = scanner.nextLine();
        }
        user.setName(nama);

        // TO DO: Take the phone number from the user, make sure it is valid
        System.out.print("No Handphone = ");
        String noHandphone = scanner.nextLine();
        while (!isValidPhoneNumber(noHandphone)) {
            System.out.println("Nomor handphone tidak valid. Silahkan masukkan nomor handphone Anda lagi.");
            System.out.print("No Handphone = ");
            noHandphone = scanner.nextLine();
        }
        user.setNoHandPhone(noHandphone);

        // TO DO: Display the seat layout
        bioskop.displaySeating();

        // TO DO: Create a code for ticket order
        System.out.println("Booking tiket bioskop");
        boolean orderMore = true;

        // TO DO: Create an exception if the user enters a non-numeric value
        while (orderMore) {
            try {
                System.out.print("Apakah anda ingin memesan kursi? (1 = Ya, 0 = Tidak): ");
                int bookingChoice = Integer.parseInt(scanner.nextLine());

                if (bookingChoice == 1) {
                    // TO DO: Call the method to reserve seats in the cinema
                    System.out.print("Masukkan baris kursi yang ingin dipesan: ");
                    int row = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan nomor kursi yang ingin dipesan: ");
                    int seat = Integer.parseInt(scanner.nextLine());
                    bioskop.bookSeat(row, seat);
                } else if (bookingChoice == 0) {
                    orderMore = false;
                } else {
                    System.out.println("Pilihan tidak valid. Silahkan masukkan 1 untuk memesan kursi atau 0 untuk keluar.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan harus berupa angka.");
            }
        }

        // TO DO: Close the Scanner object when the user is finished
        scanner.close();
    }

    // TO DO: Create a method to check if the phone number is valid
    private static boolean isValidPhoneNumber(String number) {
        // Implement your validation logic here
        // For example, you could check the length or format of the phone number
        return !number.isEmpty(); // Placeholder validation
    }
}
