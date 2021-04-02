package manejo.cultivarTypeFilter;

import java.util.function.Predicate;

import manejo.MipSample;

public class BTCultivarTypeFilter extends AbstractCultivarTypeFilter{

    @Override
    Predicate<MipSample> getPredicate() {
        return (currentSample) -> currentSample.getPestType().equals("BT");
    }
    
}
