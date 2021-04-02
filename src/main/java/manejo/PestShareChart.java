package manejo;

import java.util.List;
import java.util.Map;

import manejo.areaFilter.IAreaDataRetriever;
import manejo.cultivarTypeFilter.AbstractCultivarTypeFilter;
import manejo.pestTypeFilter.AbstractPestFilter;

public class PestShareChart {

    private final IAreaDataRetriever dataRetriever;
    private final AbstractPestFilter pestFilter;
    private final AbstractCultivarTypeFilter cultivarTypeFilter;

    public PestShareChart(
        IAreaDataRetriever dataRetriever,
        AbstractPestFilter pestFilter,
        AbstractCultivarTypeFilter cultivarTypeFilter
    ) {
        this.dataRetriever = dataRetriever;
        this.pestFilter = pestFilter;
        this.cultivarTypeFilter = cultivarTypeFilter;
    }

    private Map<String, Double> calculateShare(List<MipSample> samples) {
        
        double tt = samples
                        .stream()
                        .mapToDouble(MipSample::getValue)
                        .sum();

        double caterpillar1 = 0.0;
        double caterpillar2 = 0.0;


        for (MipSample currentSample: samples) {
            switch(currentSample.getPest()) {
                case "Caterpillar 1":
                    caterpillar1 += currentSample.getValue();
                break;
                case "Caterpillar 2":
                    caterpillar2 += currentSample.getValue();
                break;
            }
        }
        
        return Map.of(
            "Caterpillar 1", caterpillar1 / tt,
            "Caterpillar 2", caterpillar2 / tt
            );
    }

    public Map<String, Double> getChart() {

        var dataRetrieved = dataRetriever.getData(2L, List.of(1L, 2L, 3L));
        var pestFilteredSamples = pestFilter.getSampleForPestType(dataRetrieved);
        var cultivarTypeFilteredSamples = cultivarTypeFilter.getSampleForCultivarType(pestFilteredSamples);

        return calculateShare(cultivarTypeFilteredSamples);
    }
}
