package compoundInterest;

public class CalcCheck {
    public boolean checkError(String principal, String rate, String year) {
        if (checkErrorPrincipal(principal) || checkErrorRate(rate) || checkErrorYear(year)) {
            return true;
        }
        return false;
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
