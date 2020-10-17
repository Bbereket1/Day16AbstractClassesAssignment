public class Main {
    /*
    Let's use our School application and apply the concept of abstract classes to it.

    Create an abstract class called User. Give it the following private fields:

            firstName
            lastName
            email
            username
            password
            absences (this will represent the total number of days absent)

    Create a constructor, getters, and setters. Also create a method with this signature:
    public abstract void absentDays() that takes a number to represent the days absent.

    Create a Teacher class that inherits from the User class. Give it an additional field
    ptoDays which is set to 10. Override the absentDays() method to decrease the number of ptoDays
    for each absent day and have it increment the number of absences. Have it print a user-friendly
    message with the number of PTO days the user has left.

    Create a Admin class that inherits from the User class. Give it an additional field ptoDays which is
    set to 20. Override the absentDays() method to decrease the number of ptoDays for each absent day and
    have it increment the number of absences. Have it print a user-friendly message with the number of
    PTO days the user has left.

    Create a Admin class that inherits from the User class. Override the absentDays() method to increment
    the number of absences. Have it print a user-friendly message with the number of absences they've had so far.
     */
    public static void main(String[] args) {
        Teacher substituteTeacher = new Teacher("Richard", "Wise", "Richard13@gmaail.com",
                "Richwise", 1233, 5);
        Admin myAdmin = new Admin("Kaleb", "Sun", "Sunkal@yahoo.com", "Kal21"
               , 3345, 5);

        substituteTeacher.absentDays(18);
        myAdmin.absentDays(5);

    }
}
