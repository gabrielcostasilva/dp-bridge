package manejo.areaFilter;

import java.util.List;

import manejo.MipSample;

public interface IAreaDataRetriever {

    public List<MipSample> getData(Long harvestId, List<Long> idsSelectedForDataCollection);

}
