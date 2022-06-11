package compoundInterest;

import java.io.Serializable;

public class CalcResultBean implements Serializable {
    private int principal, rate, year, total;
    private int[] compoundInterestList;

    public void setPrincipal(int principal) {this.principal= principal;}
    public int getPrincipal() {return principal;}

    public void setRate(int rate) {this.rate= rate;}
    public int getRate() {return rate;}

    public void setYear(int year) {this.year= year;}
    public int getYear() {return year;}

    public void setCompoundInterestList(int[] compoundInterestList) {this.compoundInterestList = compoundInterestList;}
    public int[] getCompoundInterestList() {return compoundInterestList;}

    public void setTotal(int total) {this.total = total;}
    public int getTotal() {return total;}
}
