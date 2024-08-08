package org.example;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    //return tax
    public double tax(){
        if (this.salary < 1000){
            return this.salary;
        }else {
            return this.salary * 0.03;
        }
    }
    //return bonus
    public double bonus(){
        if (this.workHours > 40){
            int extraHours = this.workHours - 40;
            return extraHours * 30;
        }else {
            return 0;
        }
    }
    //return raise, according to 2021
    public double raiseSalary(){
        int workYear = 2021 - this.hireYear;
        if (workYear < 10){
            return this.salary * 1.05; // + %5
        } else if (workYear < 20) {
            return this.salary * 1.10; // + %10
        }else {
            return this.salary * 1.15; // + %15
        }
    }

    @Override
    public String toString(){
        double raise = this.raiseSalary() - this.salary;
        double finalSalary= this.salary + this.bonus() - this.tax();
        double totalSalary = finalSalary + raise;
        String info = "Name: " + this.name + "\n" +
                "Salary: " + this.salary + "\n" +
                "Work Hours: " + this.workHours + "\n" +
                "Start Year: " + this.hireYear + "\n" +
                "Tax: " + this.tax() + "\n" +
                "Bonus: " + this.bonus() + "\n" +
                "Raise: " + raise + "\n" +
                "Salary with Taxes and Bonus:  " + finalSalary + "\n" +
                "Total Salary: " + totalSalary + "\n";
        return info;
    }
}
