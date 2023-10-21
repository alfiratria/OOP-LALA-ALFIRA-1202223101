import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama akun : ");
        String namaAkun1 = scanner.nextLine();
        System.out.print("Masukkan nomor akun : ");
        String nomorAkun1 = scanner.nextLine();
        System.out.print("Masukkan saldo awal : ");
        double saldoAkun1 = scanner.nextDouble();
        scanner.nextLine();
        Account akun1 = new Account(namaAkun1, nomorAkun1,saldoAkun1);

        System.out.print("Masukkan nama akun : ");
        String namaAkun2 = scanner.nextLine();
        System.out.print("Masukkan nomor akun : ");
        String nomorAkun2 = scanner.nextLine();
        System.out.print("Masukkan saldo awal : ");
        double saldoAkun2 = scanner.nextDouble();
        scanner.nextLine();
        Account akun2 = new Account(namaAkun2, nomorAkun2,saldoAkun2);

        System.out.print("Masukkan nama akun : ");
        String namaAkun3 = scanner.nextLine();
        System.out.print("Masukkan nomor akun : ");
        String nomorAkun3 = scanner.nextLine();
        System.out.print("Masukkan saldo awal : ");
        double saldoAkun3 = scanner.nextDouble();
        scanner.nextLine();
        Account akun3 = new Account(namaAkun3, nomorAkun3,saldoAkun3);

        bank.addAccount(akun1);
        bank.addAccount(akun2);
        bank.addAccount(akun3);
        
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Saldo akun " + account.getName() + " = " + account.getBalance());
        }

        akun1.deposit(50000.0);
        akun2.withdraw(20000.0);

        bank.removeAccount("101190015");

        System.out.println("Daftar semua akun dalam bank:");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama: " + account.getName() + ", Nomor akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
        scanner.close();
    }
}
