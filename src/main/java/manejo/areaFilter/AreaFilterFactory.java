package manejo.areaFilter;

public enum AreaFilterFactory {
    MACRO_REGION {
        public IAreaDataRetriever getInstance() {
            return new MacroRegionDataRetriever();
        }
    },
    CITY {
        public IAreaDataRetriever getInstance() {
            return new CityDataRetriever();
        }
    };
    
    public abstract IAreaDataRetriever getInstance();
}
