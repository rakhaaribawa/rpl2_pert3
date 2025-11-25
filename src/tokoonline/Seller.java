package tokoonline;
public class Seller extends User{
    public Seller(String username) {
        super(username);
    }

    @Override
    public void showMenu() {
        System.out.println("Halo " + getUsername() + ", ini menu Seller.");
    }
}