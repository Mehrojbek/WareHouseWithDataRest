package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.WareHouse;

@Projection(types = WareHouse.class)
public interface CustomWareHouse {
    Integer getId();

    String getName();
}
