package manejo.cultivarTypeFilter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import manejo.MipSample;

public abstract class AbstractCultivarTypeFilter {

    public List<MipSample> getSampleForCultivarType(List<MipSample> MIPSamples) {

        return MIPSamples
                    .stream()
                    .filter(getPredicate()::test)
                    .collect(Collectors.toList());

    }

    abstract Predicate<MipSample> getPredicate();

}
