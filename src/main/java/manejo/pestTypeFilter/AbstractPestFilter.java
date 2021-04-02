package manejo.pestTypeFilter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import manejo.MipSample;

public abstract class AbstractPestFilter {

    public List<MipSample> getSampleForPestType(List<MipSample> unfilteredMIPSamples) {
        return unfilteredMIPSamples
            .stream()
            .filter(getPredicateFilter()::test)
            .collect(Collectors.toList());
    }

    abstract Predicate<MipSample> getPredicateFilter();
}
