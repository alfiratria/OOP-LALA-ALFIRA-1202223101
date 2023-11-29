public class TelUExpress extends Ekspedisi { 

    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarInter;
    // TO DO: Create Constructor of TelUExpress
    public TelUExpress(int jumlahCabang, String pusat,float tarif, boolean antarInter){
        super(jumlahCabang, pusat, tarif);
        this.antarInter= antarInter;
    }

    @Override
    // TO DO: Create 'informasi' Method to show Information
    public void Informasi(){
        if (antarInter == true) {
            System.out.println("Ekspedisi TelUExpress dengan Jumlah cabang" + jumlahCabang + "dan berpusat di" + pusat + " mempunyai tarif sebesar " + tarif + "perkilogram");
        }
        else {
            System.out.println("Ekspedisi  ini tidak melayani pengantaran Internasional");
        }
    }

    // TO DO: Create 'ambil' Method to pick up a package
    public void Ambil(String tempat){
        System.out.println("TelUExpress berhasil mengambil paket ke ");
    }
    // TO DO: Create 'antar' Method to send a package
    
    public void Antar(int resi){
        System.out.println("TelUExpress berhasil mengantar paket dengan nomor resi" + resi);
    }
    // TO DO: Create 'antar' Method to send two packages

    public void Antar(int resi_1, int resi_2){
        System.out.println("TelUExpress berhasil mengantar paket dengan nomor resi" + resi_1 + " dan " + resi_2);
    }
}
