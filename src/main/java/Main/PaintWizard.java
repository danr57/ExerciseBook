package Main;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PaintWizard {

    private List<Paint> paints = new ArrayList<>();

    public void calculateCoverage() {
        for (Paint p : paints) {
            p.setCoveragePerTin(p.getVolume() * p.getCoverage());
            p.setPricePerMetre(p.getPrice() / p.getCoveragePerTin());
        }
    }

    public void sortPaints() {
        printAll();
        paints.sort(Comparator.comparingDouble(Paint::getPricePerMetre));
        printAll();
    }


    public boolean addPaint(Paint paint) {
        return this.paints.add(paint);
    }

    public void printAll() {
        for (Paint p : paints) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

    public void calculateWaste(int roomSize) {
        Paint leastWaste = new Paint("", 0, 0, 0);
        int tins = 1;
        for (Paint p : paints) {
            if (p.getCoveragePerTin() < roomSize) {
                tins++;

            } else if (roomSize - p.getCoveragePerTin() < roomSize - leastWaste.getCoveragePerTin()) {
                leastWaste = p;
                tins = 1;
            }
        }
    }

    public String findCheapestForRoom(int roomSize) {
        Paint currentCheapest = new Paint("", 0, 0, 0);
        for (Paint p : paints) {
            if (p.getCoverage() < roomSize) {

            }
        }
        return currentCheapest.toString();
    }
}
