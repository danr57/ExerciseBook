package Main;

public class Paint {
    private String brand;
    private int volume, coverage, coveragePerTin;
    private double price, pricePerMetre;


    public Paint(String brand, int volume, int coverage, double price) {
        this.brand = brand;
        this.volume = volume;
        this.coverage = coverage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paint [brand=" + brand + ", price=£" + price + ", volume=" + volume
                + "L, coverage=" + coverage + ", pricePer10m^2=£" + (pricePerMetre * 10)
                + "]";
    }

    public int getVolume() {
        return volume;
    }

    public int getCoverage() {
        return coverage;
    }

    public double getPrice() {
        return price;
    }

    public int getCoveragePerTin() {
        return coveragePerTin;
    }

    public void setCoveragePerTin(int coveragePerTin) {
        this.coveragePerTin = coveragePerTin;
    }

    public double getPricePerMetre() {
        return pricePerMetre;
    }

    public void setPricePerMetre(double pricePerMetre) {
        this.pricePerMetre = pricePerMetre;
    }

}
