package a10;

import javax.swing.*;

public class driver {

    public static void main(String [] args) {
        SalesPerson sp = new SalesPerson();
        sp.setSales(Double.parseDouble(JOptionPane.showInputDialog("Please enter the salesperson’s monthly sales")));
        sp.setAdvance(Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of advanced pay")));
        sp.setFirstname(JOptionPane.showInputDialog("Please enter Employee Firstname"));
        sp.setLastname(JOptionPane.showInputDialog("Please enter Employee Lastname"));
        sp.setDOB(JOptionPane.showInputDialog("Please enter Employee D.O.B"));
        sp.setMontlyRate();
        sp.calculateCommission();
        sp.calculatePayAdvance();
        sp.display();

        SalariedEmployee se = new SalariedEmployee();

        se.setBonus(Double.parseDouble(JOptionPane.showInputDialog("Please enter the Employees Bonus")));
        se.setWeeklySalary(Double.parseDouble(JOptionPane.showInputDialog("Please enter the Employees Weekly Pay")));
        se.setFirstname(JOptionPane.showInputDialog("Please enter Employee Firstname"));
        se.setLastname(JOptionPane.showInputDialog("Please enter Employee Lastname"));
        se.setDOB(JOptionPane.showInputDialog("Please enter Employee D.O.B"));
        se.calculatePay();
        se.display();
    }

}
