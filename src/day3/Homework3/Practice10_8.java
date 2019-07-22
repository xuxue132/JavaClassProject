package day3.Homework3;

public class Practice10_8 {
    public static void main(String[] args) {
        Tax1 tax = new Tax1();
        int[][] brackets2001 = {{0,27050,65550,136750,297350},{0,45200,109250,166500,297350},
                {0,22600,54625,93250,148675},{0,36250,93650,151650,297350}};
        double[] rates2001 = {0.15,0.275,0.305,0.355,0.391};
        tax.setBrackets(brackets2001);
        tax.setRates(rates2001);


        paint(tax);

        int[][] brackets2009 = {{0,8350,33950,52250,171550,372950},{0,16700,67900,137050,208850,372950},
                {0,8350,33950,68525,104425,186475},{0,11950,45500,117450,190200,372950}};
        double[] rates2009 = {0.1,0.15,0.25,0.28,0.33,0.35};
        tax.setBrackets(brackets2009);
        tax.setRates(rates2009);

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t2009年税款表(美元)");
        paint(tax);
    }

    public static void paint(Tax1 tax){
        System.out.println("\t  单身纳税人\t\t\t已婚共繳纳税人或符合条件的丧偶人士\t" +
                "    已婚单缴纳税人\t\t\t\t\t  家庭纳税人");
        System.out.println("\t  收入\t 税款\t\t\t\t\t 收入\t 税款\t\t\t\t\t" +
                " 收入\t 税款\t\t\t\t\t 收入\t 税款");
        for (int i = 50000;i <= 60000;i += 1000){
            tax.setTaxableIncome(i);

            for (int n = 0;n < 4;n++){
                tax.setFilingStatus(n);
                System.out.printf("\t%-5d\t%-12.2f\t|\t",i,tax.getTax());
            }

            System.out.println();
        }
    }
}
class Tax1{
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_J0INTLY_0R_QUALIFYING_WID0W = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_0F_H0USEH0LD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax1(){

    }

    public Tax1(int filingStatus,int[][] brackets,double[] rates,double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax(){
        double tax = taxableIncome * rates[rates.length - 1];

        for (int i = 0;i < rates.length - 1;i++){
            if (brackets[filingStatus][i] < taxableIncome &&
                    taxableIncome < brackets[filingStatus][i  + 1]){
                tax = taxableIncome * rates[i];
            }
        }

        return tax;
    }
}