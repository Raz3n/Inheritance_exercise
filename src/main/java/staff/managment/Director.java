package staff.managment;


public class Director extends Manager {

    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, double budget, String deptName) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }

    public double payBonus(){
        return super.payBonus() * 2;
    }
}
