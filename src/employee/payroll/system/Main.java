
package employee.payroll.system;

/**
 *
 * @author Banna
 */
public class Main {

    public static void main(String[] args) {
        PayrollSystem payrollSystem =new PayrollSystem();
        FullTimeEmployee full = new FullTimeEmployee("banna", 1, 70000.0);
        PartTimeEmployee part = new PartTimeEmployee("Abdul", 2, 40, 20.0);
        
        payrollSystem.addEmployee(full);
        payrollSystem.addEmployee(part);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployee();
        System.out.println("removing Employee");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employee Details: ");
        payrollSystem.displayEmployee();
    }
    
}
