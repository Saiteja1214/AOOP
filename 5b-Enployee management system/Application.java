package Employee;

public class Application {
    public static void main(String[] args) {
       
        StaffMember staff = new StaffMember("Jane Smith", "Developer", 50000);

       
        CompensationCalculator calculator = new CompensationCalculator();

        
        double totalCompensation = calculator.computeSalary(staff);
        System.out.println("Staff Member: " + staff.getFullName());
        System.out.println("Total Compensation: " + totalCompensation);
    }
}
