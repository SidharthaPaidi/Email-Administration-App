import java.util.*;

public class emailMain {

    public static class Email {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private int mailBoxCapacity = 500;
        private String email;
        private int defaultPasswordLength = 10;
        private String alternateEmail;
        private String companysuffix = "aeycompany.com";

        // Constructor to receive firstName and lastName

        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println("Email created :" + firstName + " " + lastName);

            // Call this method asking for the department returns the department
            this.department = setDepartment();
            // System.out.println("Department name is " + this.department);

            // call a method that generates a random password
            this.password = randomPassword(defaultPasswordLength);
            System.out.println("Your password is " + this.password);

            // combine element to generate email
            this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."
                    + companysuffix;
            System.out.println("Your email is " + email);
        }

        // Ask for Department
        public String setDepartment() {
            System.out.print("New Worker : "+firstName+"\nEnter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if (depChoice == 1) {
                return "sales";
            } else if (depChoice == 2) {
                return "development";
            } else if (depChoice == 3) {
                return "accounting";
            } else {
                return "";
            }
        }

        // Generate a Random Password
        private String randomPassword(int length) {
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01233456789!@#$";
            char[] password = new char[length];
            for (int i = 0; i < length; i++) {
                int rand = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }
            return new String(password);
        }

        // set the mail box capacity
        public void setMailBoxCapacity(int capacity) {
            this.mailBoxCapacity = capacity;
        }

        // set Alternate email
        public void setAlternateEmail(String altEmail) {
            this.alternateEmail = altEmail;
        }

        // change the password
        public void changePassword(String password) {
            this.password = password;
        }

        public int getMailboxCapacity() {
            return mailBoxCapacity;
        }

        public String getAlternateEmail() {
            return alternateEmail;
        }

        public String getPAssword() {
            return password;
        }

        public String showInfo(){
            return " Display Name : "+firstName+" "+lastName+
                    "\n Company Email : " + email +
                    "\n MailBox Capacity :" + mailBoxCapacity + "mb";
        }

    }

    public static void main(String[] args) {
        Email em1 = new Email("Saisidhartha", "Paidi");
        // em1.setAlternateEmail("jarsvs@main.com");
        // System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}
