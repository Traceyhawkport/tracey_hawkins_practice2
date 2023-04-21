package employee_app.com.hr.personnel;

import employee_app.gov.irs.TaxPayer;

public class Corporation implements TaxPayer{
    private String name;
    private double monthlyIncome;

    public Corporation(String name, double monthlyIncome){
        this.name = name;
        this.monthlyIncome = monthlyIncome;

    }
    @Override
    public double computeMonthlyTaxToPay() {
        return monthlyIncome * TaxPayer.CORP_TAX_RATE;
    }

}
