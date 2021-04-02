package manejo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import manejo.areaFilter.AreaFilterFactory;
import manejo.cultivarTypeFilter.CultivarTypeFilterFactory;
import manejo.pestTypeFilter.PestTypeFilterFactory;

public class AppTest {

    @Test
    public void testMacroRegionCaterpillarBT() {
        assertEquals(Map.of(
            "Caterpillar 2", 0.0, 
            "Caterpillar 1", 1.0
            ),
            new PestShareChart(
                AreaFilterFactory.MACRO_REGION.getInstance(),
                PestTypeFilterFactory.CATERPILLAR.getInstance(),
                CultivarTypeFilterFactory.BT.getInstance()
            ).getChart()
        );
    }

    @Test
    public void testMacroRegionCaterpillarNoBT() {
        assertEquals(Map.of(
            "Caterpillar 2", 1.0, 
            "Caterpillar 1", 0.0
            ),
            new PestShareChart(
                AreaFilterFactory.MACRO_REGION.getInstance(),
                PestTypeFilterFactory.CATERPILLAR.getInstance(),
                CultivarTypeFilterFactory.NO_BT.getInstance()
            ).getChart()
        );
    }

    @Test
    public void testCityCaterpillarBT() {
        assertEquals(Map.of(
            "Caterpillar 2", 0.5, 
            "Caterpillar 1", 0.5
            ),
            new PestShareChart(
                AreaFilterFactory.CITY.getInstance(),
                PestTypeFilterFactory.CATERPILLAR.getInstance(),
                CultivarTypeFilterFactory.BT.getInstance()
            ).getChart()
        );
    }

    @Test
    public void testCityCaterpillarNoBT() {
        assertEquals(Map.of(
            "Caterpillar 2", 0.0, 
            "Caterpillar 1", 1.0
            ),
            new PestShareChart(
                AreaFilterFactory.CITY.getInstance(),
                PestTypeFilterFactory.CATERPILLAR.getInstance(),
                CultivarTypeFilterFactory.NO_BT.getInstance()
            ).getChart()
        );
    }

}
