package tokoonline;
public class Buyer extends User {
    public Buyer(String username) {
        super(username);
    }

    @Override
    public void showMenu() {
        System.out.println("Halo " + getUsername() + ", ini menu BUYER.");
    }
}
