public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("M567", 120.0, 5 , 4);
        Bus bus = new Bus("B345", 80.0, 30, 40);

        System.out.println("Informasi Mobil:\n" + mobil.toString() + "\nWaktu Tempuh: "
                + mobil.hitungWaktuTempuh(200.0) + " jam\n");

        System.out.println("Informasi Bus:\n" + bus.toString() + "\nWaktu Tempuh: "
                + bus.hitungWaktuTempuh(200.0) + " jam");
    }
}
