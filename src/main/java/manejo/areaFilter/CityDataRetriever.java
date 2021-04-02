package manejo.areaFilter;

import java.util.List;

import manejo.MipSample;

public class CityDataRetriever implements IAreaDataRetriever {

    @Override
    public List<MipSample> getData(Long harvestId, List<Long> idsSelectedForDataCollection) {
        return List.of(
            new MipSample("City 1", "BT", "Caterpillar 1", 4.0),
            new MipSample("City 1", "Block", "Bedbug y", 5.0),
            new MipSample("City 2", "BT", "Caterpillar 2", 4.0),
            new MipSample("City 2", "noBT", "Caterpillar 1", 4.0),
            new MipSample("City 2", "noBlock","Bedbug x", 5.0)
            );
    }
    
}
