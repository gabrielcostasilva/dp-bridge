package manejo.pestTypeFilter;

import java.util.List;
import java.util.function.Predicate;

import manejo.MipSample;

public class CaterpillarPestFilter extends AbstractPestFilter {

    @Override
    Predicate<MipSample> getPredicateFilter() {
        return (currentPest) -> currentPest.getPest().startsWith("Caterp");
    }
}
