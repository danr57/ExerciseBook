package Main;

public class Results {
    private int physMark, chemMark, bioMark, failedSubjects;
    private float percentage, total;
    private boolean passedPhys, passedChem, passedBio;

    public Results(int p, int c, int b) {
        physMark = p;
        if (p >= 60) {
            setPassedPhys(true);
        } else {
            failedSubjects++;
        }

        chemMark = c;
        if (c >= 60) {
            setPassedChem(true);
        } else {
            failedSubjects++;
        }

        bioMark = b;
        if (b >= 60) {
            setPassedBio(true);
        } else {
            failedSubjects++;
        }

        setTotal(p + c + b);
        setPercentage(total / 450 * 100);
        total();
        percentage();
        pass();
    }

    public void total() {
        System.out.println("Physics: " + physMark);
        System.out.println("Chemistry: " + chemMark);
        System.out.println("Biology: " + bioMark);
        System.out.println("Total: " + total);
    }

    public void percentage() {
        System.out.println("Percentage: " + percentage + "%\n");
    }

    public void pass() {
        if (percentage >= 60 && passedChem && passedBio && passedPhys) {
            System.out.println("This student has passed!\n");
        } else {
            System.out.println("This student has not passed. They achieved " + percentage + "% overall and failed "
                    + failedSubjects + " module(s).\n");
        }

    }


    public int getPhysMark() {
        return physMark;
    }

    public void setPhysMark(int physMark) {
        this.physMark = physMark;
    }

    public int getChemMark() {
        return chemMark;
    }

    public void setChemMark(int chemMark) {
        this.chemMark = chemMark;
    }

    public int getBioMark() {
        return bioMark;
    }

    public void setBioMark(int bioMark) {
        this.bioMark = bioMark;
    }

    public int getFailedSubjects() {
        return failedSubjects;
    }

    public void setFailedSubjects(int failedSubjects) {
        this.failedSubjects = failedSubjects;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public boolean isPassedPhys() {
        return passedPhys;
    }

    public void setPassedPhys(boolean passedPhys) {
        this.passedPhys = passedPhys;
    }

    public boolean isPassedChem() {
        return passedChem;
    }

    public void setPassedChem(boolean passedChem) {
        this.passedChem = passedChem;
    }

    public boolean isPassedBio() {
        return passedBio;
    }

    public void setPassedBio(boolean passedBio) {
        this.passedBio = passedBio;
    }
}
