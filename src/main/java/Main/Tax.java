package Main;

public class Tax {
    double salary;
    double taxRate;

    public Tax(int s) {
        salary = s;
        taxBand();
        calculateTax();
    }

    public void taxBand() {
        if (salary < 15000) {
            taxRate = 0;
        } else if (salary < 20000) {
            taxRate = .10;
        } else if (salary < 30000) {
            taxRate = .15;
        } else if (salary < 45000) {
            taxRate = .20;
        } else {
            taxRate = .25;
        }
    }

    public void calculateTax() {
        System.out.println("Tax to pay on a salary of £" + salary + ": £" + salary*taxRate);
    }
}
