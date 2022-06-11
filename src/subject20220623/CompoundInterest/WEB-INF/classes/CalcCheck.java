package compoundInterest;

public class CalcCheck {
    //public boolean checkError(String principal, String rate, String year) {
    public int checkError(String principal, String rate, String year) {
        int errorFlag = 0;
        int principalFlag = checkErrorPrincipal(principal);
        int rateFlag = checkErrorRate(rate);
        int yearFlag = checkErrorYear(year);
        if (principalFlag != 0) {
            errorFlag = errorFlag | principalFlag;
        }
        if (rateFlag != 0) {
            errorFlag = errorFlag | rateFlag;
        }
        if (yearFlag !=0) {
            errorFlag = errorFlag | yearFlag;
        }
        return errorFlag;
    }

    //private boolean checkErrorPrincipal(String principal) {
    private int checkErrorPrincipal(String principal) {
        int intPrincipal;
        try {
            intPrincipal = Integer.parseInt(principal);
        }catch (Exception e) {
            //return true;
            return Integer.parseInt("100000", 2);
        }
        if (intPrincipal < 1_000 || intPrincipal > 1_000_000_000) {
            //return true;
            return Integer.parseInt("010000", 2);
        }
        //return false;
        return 0;
    }

    //private boolean checkErrorRate(String rate) {
    private int checkErrorRate(String rate) {
        int intRate;
        try {
            intRate = Integer.parseInt(rate);
        }catch (Exception e) {
            //return true;
            return Integer.parseInt("001000", 2);
        }
        if (intRate < 1 || intRate > 20) {
            //return true;
            return Integer.parseInt("000100", 2);
        }
        //return false;
        return 0;
    }

    //private boolean checkErrorYear(String year) {
    private int checkErrorYear(String year) {
        int intYear;
        try {
            intYear = Integer.parseInt(year);
        }catch (Exception e) {
            //return true;
            return Integer.parseInt("000010", 2);
        }
        if (intYear < 1 || intYear > 20) {
            //return true;
            return Integer.parseInt("000001", 2);
        }
        //return false;
        return 0;
    }
}
