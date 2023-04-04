import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class EmployeeManagement
{
    static ArrayList<PermanentEmp> permanentEmpList = new ArrayList<>();
    static ArrayList<ContractEmp> contractEmpList = new ArrayList<>();
    static ArrayList<ParttimeEmp> partTimeEmpList = new ArrayList<>();
    static HashMap<Integer,PermanentEmp>permanentEmpHashMap = new HashMap<>();
    static HashMap<Integer,ContractEmp>contractEmpHashMap = new HashMap<>();
    static HashMap<Integer,ParttimeEmp>parttimeEmpHashMap = new HashMap<>();

    Scanner scanner = new Scanner(System.in);
    public void addEmployee()
    {
        System.out.println("-------------------------------------");
        System.out.println("Enter the  employee details");
        System.out.println("-------------------------------------");
        System.out.println("Enter the  employee id");
        int id = scanner.nextInt();
        while (permanentEmpHashMap.containsKey(id)||contractEmpHashMap.containsKey(id)||parttimeEmpHashMap.containsKey(id))
        {
            System.out.println("Duplicate id found enter id again");
            id = scanner.nextInt();
        }
        System.out.println("Enter the name of an employee");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter age of an employee");
        int age = scanner.nextInt();
        System.out.println("Enter the salary of an employee");
        double salary = scanner.nextDouble();
        System.out.println("select the type of employee you are going to add");
        System.out.println("1.Permanent employee 2.Contract employee 3.part time employee");
        int select = scanner.nextInt();
        switch (select) {
            case 1 -> {
                System.out.println("Enter the bonus amount");
                int bonus = scanner.nextInt();
                PermanentEmp permanentemp = new PermanentEmp(id, name, age, salary, bonus);
                permanentEmpList.add(permanentemp);
                permanentEmpHashMap.put(id,permanentemp);
            }
            case 2 -> {
                System.out.println("Enter the contractDuration of an employee");
                int contractDuration = scanner.nextInt();
                ContractEmp contractEmp = new ContractEmp(id, name, age, salary, contractDuration);
                contractEmpList.add(contractEmp);
                contractEmpHashMap.put(id,contractEmp);
            }
            case 3 -> {
                System.out.println("Enter the hours worked of an employee");
                int hoursWorked = scanner.nextInt();
                ParttimeEmp parttimeEmp = new ParttimeEmp(id, name, age, salary, hoursWorked);
                partTimeEmpList.add(parttimeEmp);
                parttimeEmpHashMap.put(id,parttimeEmp);
            }
        }
        System.out.println("If you want to continue press true otherwise press false");
        boolean bool = scanner.nextBoolean();
        if(bool){
            addEmployee();
        }
    }

    public void delete()
    {
        System.out.println("select the type of employee you are going to delete");
        System.out.println("1.Permanent employee 2.Contract employee 3.part time employee");
        int select = scanner.nextInt();
        switch (select) {
            case 1 -> {
                System.out.println("Enter the id of an employee which you are going to delete");
                int id = scanner.nextInt();
                for (int i = 0; i < permanentEmpList.size(); i++) {
                    if (permanentEmpList.get(i).getId()==id) {
                        permanentEmpList.remove(permanentEmpList.get(i));
                        permanentEmpHashMap.remove(id);
                    }
                }
            }
            case 2 -> {
                System.out.println("Enter the id of an employee which you are going to delete");
                int id = scanner.nextInt();
                for (int i = 0; i < contractEmpList.size(); i++) {
                    if (contractEmpList.get(i).getId()==id) {
                        contractEmpList.remove(contractEmpList.get(i));
                        contractEmpHashMap.remove(id);
                    }
                }
            }
            case 3 -> {
                System.out.println("Enter the id of an employee which you are going to delete");
                int id = scanner.nextInt();
                boolean bool=true;
                for (int i = 0; i < partTimeEmpList.size(); i++)
                {
                    if (partTimeEmpList.get(i).getId()==id)
                    {
                        bool = false;
                        partTimeEmpList.remove(partTimeEmpList.get(i));
                        parttimeEmpHashMap.remove(id);
                    }
                }
                if(bool)
                {
                    System.out.println("Id not found");
                }
            }
        }
        System.out.println("If you want to continue press true otherwise press false");
        boolean bool = scanner.nextBoolean();
        if(bool)
        {
            delete();
        }
    }
    public void modify()
    {
        System.out.println("Enter the name of an employee");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter age of an employee");
        int age = scanner.nextInt();
        System.out.println("Enter the salary of an employee");
        double salary = scanner.nextDouble();
        System.out.println("select the type of employee you are going to modify");
        System.out.println("1.Permanent employee 2.Contract employee 3.part time employee");
        int select = scanner.nextInt();
        switch (select)
        {
            case 1:
                System.out.println("Enter the current employee id");
                int employeeId = scanner.nextInt();
                boolean bool = true;
                for (int i = 0; i < permanentEmpList.size(); i++)
                {
                    if(permanentEmpList.get(i).getId()==employeeId)
                    {
                        bool = false;
                        System.out.println("Enter the bonus amount");
                        int bonus = scanner.nextInt();
                        PermanentEmp permanentemp = new PermanentEmp(employeeId,name,age,salary,bonus);
                        permanentEmpList.set(i,permanentemp);
                        permanentEmpHashMap.put(employeeId,permanentemp);
                    }
                }
                if(bool){
                    System.out.println("Employee not found to modify");
                }
                break;
            case 2:
                System.out.println("Enter the current employee id");
                employeeId = scanner.nextInt();
                boolean bool1 = true;
                for (int i = 0; i < contractEmpList.size(); i++)
                {
                    if(contractEmpList.get(i).getId()==employeeId)
                    {
                        bool1 = false;
                        System.out.println("Enter the contractDuration of an employee");
                        int contractDuration = scanner.nextInt();
                        ContractEmp contractEmp = new ContractEmp(employeeId,name,age,salary,contractDuration);
                        contractEmpList.set(i,contractEmp);
                        contractEmpHashMap.put(employeeId,contractEmp);
                    }
                }
                if(bool1){
                    System.out.println("Employee not found to modify");
                }
                break;
            case 3:
                System.out.println("Enter the current employee id");
                employeeId = scanner.nextInt();
                boolean bool2 = true;
                for (int i = 0; i < partTimeEmpList.size(); i++)
                {
                    if(partTimeEmpList.get(i).getId()==employeeId)
                    {
                        bool2 = false;
                        System.out.println("Enter the hours worked of an employee");
                        int hoursWorked = scanner.nextInt();
                        ParttimeEmp parttimeEmp = new ParttimeEmp(employeeId,name,age,salary,hoursWorked);
                        partTimeEmpList.set(i,parttimeEmp);
                        parttimeEmpHashMap.put(employeeId,parttimeEmp);
                    }
                }
                if(bool2){
                    System.out.println("Employee not found to modify");
                }
            break;
        }
        System.out.println("If you want to continue press true otherwise press false");
        boolean bool = scanner.nextBoolean();
        if(bool)
        {
            modify();
        }
    }
    public void search()
    {
        System.out.println("select the type of employee you are going to search");
        System.out.println("1.Permanent employee 2.Contract employee 3.part time employee");
        int select = scanner.nextInt();
        switch (select)
        {
            case 1:
                System.out.println("Enter the employee id to search");
                int employeeId = scanner.nextInt();
                if(permanentEmpHashMap.containsKey(employeeId))
                {
                    System.out.println("Employee found");
                }
                else {
                    System.out.println("Employee not found");
                }
                break;
            case 2:
                System.out.println("Enter the employee id to search");
                employeeId = scanner.nextInt();
                if(contractEmpHashMap.containsKey(employeeId))
                {
                    System.out.println("Employee found");
                }
                else {
                    System.out.println("Employee not found");
                }
                break;
            case 3:
                System.out.println("Enter the employee id to search");
                employeeId = scanner.nextInt();
                if(parttimeEmpHashMap.containsKey(employeeId))
                {
                    System.out.println("Employee found");
                }
                else {
                    System.out.println("Employee not found");
                }
                break;
        }
        System.out.println("If you want to continue press true otherwise press false");
        boolean bool = scanner.nextBoolean();
        if(bool)
        {
            search();
        }
    }
}
