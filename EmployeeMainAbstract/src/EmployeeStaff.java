public class EmployeeStaff extends EmployeePerson {
   private String managerName;

   // ***********************************************************************

   // Default constructor 
   public EmployeeStaff() {
      managerName = "";
   } 

   // ***********************************************************************

   // Constructor with parameters
   public EmployeeStaff(String reportsTo) {
      managerName = reportsTo;
   } 

   // ***********************************************************************

   // Get the name of the manager
   
   public String getManagerName() {
      return managerName;
   } 

   // ***********************************************************************

   @Override
   public void printInfo() {
      System.out.println("Name: " + fullName + ", Department: " + 
                         departmentCode + ", Birthday: " + birthday +
                         ", Salary: " + annualSalary + 
                         ", Manager: " + getManagerName());
   } 

   // ***********************************************************************

   // FIXME: Implement the getAnnualBonus method. A staff's annual bonus 
   //        is calculated as 7.5% of the employee's annual salary.

   @Override
   public int getAnnualBonus() {
//      return annualSalary * 75 / 1000;
      return (int)(annualSalary * 0.075);
   } 
} 