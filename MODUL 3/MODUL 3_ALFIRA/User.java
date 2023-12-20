public class User {

    // TO DO: Create Private Attributes of User (nama, noHandphone)
    private String nama;
    private String noHandphone;

    // TO DO: Create Constructor of User
    public User(String nama, String noHandphone) {
        this.nama = nama;
        this.noHandphone = noHandphone;
    }

    public void setName(String nama) {
      this.nama = nama;
   }

   public void setNoHandPhone(String noHandphone) {
      this.noHandphone = noHandphone;
    }

    // TO DO: Create register Method to show information about name and phone number
    public void register() {
        System.out.println("Register Berhasil");
        System.out.println("Nama = " + nama);
        System.out.println("No.HP = " + noHandphone);
    }

    // TO DO: Create method to return name and phone number
    public String getName() {
        return nama;
    }

    public String getNoHandPhone() {
        return noHandphone;
    }
}
