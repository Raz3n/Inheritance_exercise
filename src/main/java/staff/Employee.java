package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;

    }

    public String getName(){
        return name;
    }

    public String getNationalInsuranceNumber(){
        return nationalInsuranceNumber;
    }

    public double getSalary(){
        return salary;
    }

    public double raiseSalary(double salary){
        return salary++;
    }

    public double payBonus(double payBonus){
        return salary / 100;
    }
}
