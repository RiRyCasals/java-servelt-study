package compoundInterest;

import compoundInterest.CalcResultBean;

public class CalcExec{
    public static void execute(CalcResultBean bean) {
        double ratePerMonth = bean.getRate() * 0.01 / 12;
        int month = bean.getYear() * 12;
        int[] compoundInterestList = new int[month];
        compoundInterestList[0] = bean.getPrincipal();
        for (int i=1; i<compoundInterestList.length; i++) {
            compoundInterestList[i] = (int)(compoundInterestList[i-1] * (1+ratePerMonth));
        }
        int total = (int)(compoundInterestList[compoundInterestList.length-1] * (1+ratePerMonth));
        
        bean.setCompoundInterestList(compoundInterestList);
        bean.setTotal(total);
    }
}
