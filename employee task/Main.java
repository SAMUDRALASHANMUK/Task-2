import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.addEmployee();
        while (true)
        {
            System.out.println("----------------------------------------------");
            System.out.println("select the operations you are going to perform");
            System.out.println("----------------------------------------------");
            System.out.println("1.Delete 2.Modify 3.Search 4.printing all employee lists and hashmaps 5.exit");
            int select = scanner.nextInt();
            switch (select) {
                case 1 -> employeeManagement.delete();
                case 2 -> employeeManagement.modify();
                case 3 -> employeeManagement.search();
                case 4 -> {
                    System.out.println(EmployeeManagement.permanentEmpList);
                    System.out.println(EmployeeManagement.contractEmpList);
                    System.out.println(EmployeeManagement.partTimeEmpList);
                    System.out.println(EmployeeManagement.permanentEmpHashMap);
                    System.out.println(EmployeeManagement.contractEmpHashMap);
                    System.out.println(EmployeeManagement.parttimeEmpHashMap);
                }
                case 5 -> {
                    System.out.println("Exiting program");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}