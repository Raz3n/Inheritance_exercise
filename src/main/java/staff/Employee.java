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

    public String setName(String name) {
        return this.name = name;
    }

    public String getNationalInsuranceNumber(){
        return nationalInsuranceNumber;
    }

    public double getSalary(){
        return salary;
    }

    public double raiseSalary(double raiseAmount) {
        if (raiseAmount < 0){
            return 0;

        }else {
           return salary = salary + raiseAmount;
        }
    }

    public double payBonus(){
        return salary / 100;
    }
}
