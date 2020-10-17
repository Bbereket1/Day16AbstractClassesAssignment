public class Teacher extends User{
    private int ptoDays;

    public Teacher(String firstName, String lastName, String email, String username, int password, int absences) {
        super(firstName, lastName, email, username, password, absences);
        this.ptoDays = 10;
    }

/*
Override the absentDays() method to decrease the number of ptoDays
    for each absent day and have it increment the number of absences. Have it print a user-friendly
    message with the number of PTO days the user has left.
 */
    @Override
    public void absentDays(int days) {
        this.ptoDays--;
        System.out.println(this.getFirstName() + " has a pto days of " + this.ptoDays);

    }
}
