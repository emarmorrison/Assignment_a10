package a10;

public class SalariedEmployee extends Employee {
    private  double weeklySalary;
    private  double bonus ;

    public SalariedEmployee(int id, String firstname, String lastname, String DOB, double pay, double weeklySalary) {
        super(id, firstname, lastname, DOB, pay);
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee() {

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public  void display(){
        System.out.println("++++++++++ Salaried Employee +++++++++++\n\n");
        super.display();
        System.out.println("Weekly Salary : "+ getWeeklySalary());
        System.out.println("Net Salary : "+ getPay());

    }

    @Override
    public void calculatePay() {
        setPay(getWeeklySalary()+getBonus());
    }
}
