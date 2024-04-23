
package employee.payroll.system;

import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employeeList;
    
    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    
    public void removeEmployee(int id){
        Employee employeeTORemove = null;
        for(Employee employee : employeeList){
            if(employee.getId()==id){
                Employee employeeToRemove = employee;
                break;
            }
        }
        Object employeeToRemove = null;
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }
    
    public void displayEmployee(){
        for( Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
