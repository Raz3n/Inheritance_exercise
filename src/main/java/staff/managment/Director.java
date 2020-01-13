package staff.managment;

import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, double budget, String deptName) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }
}
