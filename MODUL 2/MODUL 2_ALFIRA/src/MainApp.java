public class MainApp {
    public static void main(String[] args){
        System.out.println("Class Ekspedisi");
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi expedisi = new Ekspedisi(10, "Jakarta", 10000);
        expedisi.Informasi();
        System.out.println("");
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress teluexpress = new TelUExpress (100, "Bandung", 700000, true);
        teluexpress.Informasi();
        teluexpress.Ambil("Jakarta");
        teluexpress.Antar(52726227);
        teluexpress.Antar(6568154, 268531874);
        System.out.println("");
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friexpress = new FRIExpress(100, "Bandung", 700000, true);
        friexpress.Informasi();
        friexpress.Ambil(15);
        friexpress.Kirim("Jakarta");
        friexpress.Kirim("Jakarta", "Padang");
        System.out.println("");

    }
}
