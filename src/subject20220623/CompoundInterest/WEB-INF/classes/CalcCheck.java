package compoundInterest;

public class CalcCheck {
    public boolean[] checkError(String principal, String rate, String year) {
        boolean[] errorFlag = new boolean[3];
        if (checkErrorPrincipal(principal)) {
            errorFlag[0] = true;
        }else {
            errorFlag[0] = false;
        }
        if (checkErrorRate(rate)) {
            errorFlag[1] = true;
        }else {
            errorFlag[1] = false;
        }
        if (checkErrorYear(year)) {
            errorFlag[2] = true;
        }else {
            errorFlag[2] = false;
        }
        return errorFlag;
    }

    private boolean checkErrorPrincipal(String principal) {
        int intPrincipal;
        try {
            intPrincipal = Integer.parseInt(principal);
        }catch (Exception e) {
            return true;
        }
        if (intPrincipal < 1_000 || intPrincipal > 1_000_000_000) {
            return true;
        }
        return false;
    }

    private boolean checkErrorRate(String rate) {
        int intRate;
        try {
            intRate = Integer.parseInt(rate);
        }catch (Exception e) {
            return true;
        }
        if (intRate < 1 || intRate > 20) {
            return true;
        }
        return false;
    }

    private boolean checkErrorYear(String year) {
        int intYear;
        try {
            intYear = Integer.parseInt(year);
        }catch (Exception e) {
            return true;
        }
        if (intYear < 1 || intYear > 20) {
            return true;
        }
        return false;
    }
}
