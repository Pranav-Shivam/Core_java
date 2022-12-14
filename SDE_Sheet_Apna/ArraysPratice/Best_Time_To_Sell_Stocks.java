package SDE_Sheet_Apna.ArraysPratice;

public class Best_Time_To_Sell_Stocks {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int prices[])
    {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min=prices[0];
        int max=0;
        for (int i = 1; i < prices.length ; i++) {
            max=Integer.max(max,prices[i]-min);
            min=Integer.min(min,prices[i]);
        }
        return max;
    }
}
