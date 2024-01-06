import java.util.*;
public class emailMain {

    public static class Email {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private int mailBoxCapacity;
        private String alternateEmail;
        
        //Constructor to receive firstName and lastName

        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println("Email created :" + firstName + " " + lastName);

            this.department = setDepartment();
            System.out.println("Department name is " + this.department);
            
        }

        //Ask for Department
        public String setDepartment(){
            System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if(depChoice == 1){return "sales";}
            else if(depChoice == 2){return "development";}
            else if(depChoice == 3){return "accounting";}
            else{return "";}
        }




    }

    public static void main(String[] args) {
        Email em1 = new Email("Saisidhartha", "Paidi");
    }
}
