package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Measurement;
import uz.pdp.warehousedatarest.entity.WareHouse;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String getName();

    boolean getActive();
}
