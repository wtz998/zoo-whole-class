public class CreepyCrawlies extends ZooResident {
    public boolean invertebrates;
    public boolean exoskeleton;

    public CreepyCrawlies(int age, String color, double weight, boolean endangered, boolean sleeping, boolean invertebrates, boolean exoskeleton) {
        super(age, color, weight, endangered, sleeping);
        this.invertebrates = invertebrates;
        this.exoskeleton = exoskeleton;
    }

    @Override
    public String sleep() {
        return null;
    }

    public void setInvertebrates(boolean invertebrates) {
        this.invertebrates = invertebrates;
    }

    public void setExoskeleton(boolean exoskeleton) {
        this.exoskeleton = exoskeleton;
    }

    public boolean isInvertebrates() {
        return invertebrates;
    }

    public boolean isExoskeleton() {
        return exoskeleton;
    }

}

