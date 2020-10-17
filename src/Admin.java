public class Admin extends User{
    private int ptoDays;

    public Admin(String firstName, String lastName, String email, String username, int password, int absences) {
        super(firstName, lastName, email, username, password, absences);
        this.ptoDays =20;
    }

    @Override
    public void absentDays(int days) {
        this.ptoDays--;
        System.out.println(this.getFirstName() + " has a pto days of " + ptoDays);

    }
}
