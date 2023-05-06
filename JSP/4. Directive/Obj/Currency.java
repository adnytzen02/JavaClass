package Obj;

public class Currency {
    private double jpn = 4.4382;
    private double usd = 0.0345;
    private double cny = 0.2300;
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public double getJpn() {
        return this.amount * jpn;
    }

    public double getUsd() {
        return this.amount * usd;
    }

    public double getCny() {
        return this.amount * cny;
    }

}
