package tokoonline;
public class Admin extends User {
    public Admin(String username) {
        super(username);
    }

    @Override
    public void showMenu() {
        System.out.println("Halo " + getUsername() + ", ini menu ADMIN.");
    }
}