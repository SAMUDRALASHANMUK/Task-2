public class ContractEmp extends Employee
{
    private int contractDuration;

    public ContractEmp(int id, String name, int age, double salary, int contractDuration) {
        super(id, name, age, salary);
        this.contractDuration = contractDuration;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration)
    {
        this.contractDuration = contractDuration;
    }
    public String toString() {
        return "Contract Employee[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", contract duration =" + contractDuration +
                ']';
    }
}
