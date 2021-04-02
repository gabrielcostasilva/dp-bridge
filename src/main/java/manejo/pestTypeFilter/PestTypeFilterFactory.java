package manejo.pestTypeFilter;

public enum PestTypeFilterFactory {

    CATERPILLAR {
        public AbstractPestFilter getInstance() {
            return new CaterpillarPestFilter();
        }
    };

    public abstract AbstractPestFilter getInstance();
}
