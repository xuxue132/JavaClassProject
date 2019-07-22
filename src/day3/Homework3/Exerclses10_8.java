package day3.Homework3;

public class Exerclses10_8 {
    public static void main(String[] args) {
        Tax tax = new Tax();
        double[] rate = new double[]{0.15, 0.275, 0.305, 0.355, 0.391};//税率
        int[][] bracket = new int[][]{{0, 27050, 65550, 136750, 297350}, {0, 45200, 109250, 166500, 297350},
                {0, 22600, 54625, 93250, 148675}, {0, 36250, 93650, 151650, 297350}};//不同税款人的税率分界点
        tax.setBrackets(bracket);
        tax.setRates(rate);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t2001年税款表(美元)");
        System.out.println("\t  单身纳税人\t\t\t已婚共繳纳税人或符合条件的丧偶人士\t" +
                "    已婚单缴纳税人\t\t\t\t\t  家庭纳税人");
        System.out.println("\t  收入\t 税款\t\t\t\t\t 收入\t 税款\t\t\t\t\t" +
                " 收入\t 税款\t\t\t\t\t 收入\t 税款");
        pane1(tax);

        int[][] brackets2009 = {{0, 8350, 33950, 52250, 171550, 372950}, {0, 16700, 67900, 137050, 208850, 372950},
                {0, 8350, 33950, 68525, 104425, 186475}, {0, 11950, 45500, 117450, 190200, 372950}};
        double[] rates2009 = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
        tax.setBrackets(brackets2009);
        tax.setRates(rates2009);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t2009年税款表(美元)");
        System.out.println("\t  单身纳税人\t\t\t已婚共繳纳税人或符合条件的丧偶人士\t" +
                "    已婚单缴纳税人\t\t\t\t\t  家庭纳税人");
        System.out.println("\t  收入\t 税款\t\t\t\t\t 收入\t 税款\t\t\t\t\t" +
                " 收入\t 税款\t\t\t\t\t 收入\t 税款");
        pane1(tax);
    }

    public static void pane1(Tax tax) {
        double number1 = 0;
        for (number1 = 50000; number1 <= 60000; ) {

            for (int j = 0; j < 4; j++) {
                tax.setFilingStatus(j);//税款人类型
                tax.setTaxableIncome(number1);//收入
                System.out.printf("%12.2f : %.2f\t\t\t", number1, tax.getTax());
            }
            number1 = number1 + 1000;
            System.out.println();
        }
    }
}

class Tax {
    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_J0INTLY_0R_QUALIFYING_WID0W = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    int[][] brackets = new int[4][5];
    double[] rates = new double[5];
    double taxableIncome;

    public Tax() {
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

    public double getTax() {
        //根据范围计算税款
        for (int i = 0; i < rates.length; i++) {
            if (brackets[filingStatus][i] < taxableIncome && brackets[filingStatus][i + 1] > taxableIncome)
                return taxableIncome * rates[i];
        }

        return 0;
    }
}