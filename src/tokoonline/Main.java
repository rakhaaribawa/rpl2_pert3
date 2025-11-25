package tokoonline;
public class Main {
    public static void main(String[] args) {
        User pengguna1 = new Admin("Rudi");
        User pengguna2 = new Buyer("Budi");
        User pengguna3 = new Seller("Siti");

        pengguna1.showMenu();
        pengguna2.showMenu();
        pengguna3.showMenu();
    }
}