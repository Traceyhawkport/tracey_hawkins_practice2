package employee_app.gov.irs;


public class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];

    private int currentIndex = 0;
     public void register (TaxPayer taxpayer) {
         //taxPayers[currentIndex] = taxPayers;
         currentIndex++;
     }

}
