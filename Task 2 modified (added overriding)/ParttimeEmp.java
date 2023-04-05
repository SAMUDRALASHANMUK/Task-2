public class ParttimeEmp extends Employee
{
private int hoursWorked;

    public ParttimeEmp(int id, String name, int age, double salary, int hoursWorked)
    {
        super(id, name, age, salary);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    public String toString()
    {
        return "Part time Employee[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hours worked =" + hoursWorked +
                ']';
    }
}
