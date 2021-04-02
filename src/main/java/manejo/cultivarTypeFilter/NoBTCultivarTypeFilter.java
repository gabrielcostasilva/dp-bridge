package manejo.cultivarTypeFilter;

import java.util.function.Predicate;

import manejo.MipSample;

public class NoBTCultivarTypeFilter extends AbstractCultivarTypeFilter {
    
    @Override
    Predicate<MipSample> getPredicate() {
        return (currentSample) -> currentSample.getPestType().equals("noBT");
    }
}
