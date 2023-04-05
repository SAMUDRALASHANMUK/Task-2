public class PermanentEmp extends Employee
{
private int bonus;

   public PermanentEmp(int id, String name, int age, double salary, int bonus)
   {
      super(id, name, age, salary);
      this.bonus = bonus;
   }

   public int getBonus()
   {
      return bonus;
   }

   public void setBonus(int bonus)
   {
      this.bonus = bonus;
   }
   public String toString()
   {
      return "Permanent Employee[" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", salary=" + salary +
              ", bonus=" + bonus +
              ']';
   }
}
