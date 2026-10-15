public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public int salary;

    public Employee(int i, String f, String l, int s){
        id = i;
        firstName = f;
        lastName = l;
        salary = s;
    }

    public int getId() {
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int s){
        salary = s;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        salary += salary *percent /100;
        return salary;
    }

    public String toString(){
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
    

}
