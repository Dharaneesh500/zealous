package basic;

public class SIT {
    public static void main(String[] args) {
        int monthly_Invest_amount = 50000,Year = 10,persentage = 14;
        double D_persentage=(double) persentage/100;
        System.out.println(D_persentage);
        System.out.println("Monthly Investment  :"+monthly_Invest_amount );
        int total_Month = Year * 14;
        System.out.println("Total number of Month :"+ total_Month);
        int total_investment = monthly_Invest_amount * total_Month;
        System.out.println("Total amount of investment in "+Year+"Year :  "+total_investment );
        double persentage_return_amount =(double) total_investment* (D_persentage*Year);
        System.out.println(persentage +" Persentage Returns   :"+persentage_return_amount );
        double overall_return_amount = total_investment+persentage_return_amount;
        System.out.println("Total Amount with Return  :"+overall_return_amount );
    }

}