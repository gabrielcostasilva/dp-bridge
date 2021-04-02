package manejo.areaFilter;

import java.util.List;

import manejo.MipSample;

public class MacroRegionDataRetriever implements IAreaDataRetriever{

    @Override
    public List<MipSample> getData(Long harvestId, List<Long> idsSelectedForDataCollection) {
        return List.of(
            new MipSample("Macro 1", "BT", "Caterpillar 1", 1.0),
            new MipSample("Macro 1", "noBlock", "Bedbug 1", 2.0),
            new MipSample("Macro 2", "BT", "Caterpillar 1", 1.0),
            new MipSample("Macro 2", "noBT", "Caterpillar 2", 2.0)
            );
    }
    
}
