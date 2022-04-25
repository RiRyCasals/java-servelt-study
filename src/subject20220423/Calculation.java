package subject20220423;

public class Calculation {
    // 今月の元本と利息の合計 = 前月の元本と利息の合計 + 1ヶ月分の金利
    public static int[] compoundInterest(int principal, int rate, int year) {
        double ratePerMonth = rate * 0.01 / 12;
        int month = year * 12;
        int[] moneyList = new int[month+1];
        moneyList[0] = principal;
        for (int i=1; i<moneyList.length; i++) {
            moneyList[i] = (int)(moneyList[i-1] * (1+ratePerMonth));
        }
        return moneyList;
    }
}
