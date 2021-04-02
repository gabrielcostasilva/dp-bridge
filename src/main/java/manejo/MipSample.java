package manejo;

public class MipSample {

    private final String hierarchyFilter;
    private final String pestType;
    private final String pest;
    private final double value;

    public MipSample(
        String hierarchyFilter,
        String pestType,
        String pest,
        double value) {
        this.hierarchyFilter = hierarchyFilter;
        this.pestType = pestType;
        this.pest = pest;
        this.value = value;
    }

    public String getHierarchyFilter() {
        return hierarchyFilter;
    }

    public String getPest() {
        return pest;
    }

    public double getValue() {
        return value;
    }

    public String getPestType() {
        return pestType;
    }
    
}
