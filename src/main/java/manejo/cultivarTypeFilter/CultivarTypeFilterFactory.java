package manejo.cultivarTypeFilter;

public enum CultivarTypeFilterFactory {
    BT {
        public AbstractCultivarTypeFilter getInstance() {
            return new BTCultivarTypeFilter();
        }
    },
    NO_BT{
        public AbstractCultivarTypeFilter getInstance() {
            return new NoBTCultivarTypeFilter();
        }
    };

    public abstract AbstractCultivarTypeFilter getInstance();
    
}
