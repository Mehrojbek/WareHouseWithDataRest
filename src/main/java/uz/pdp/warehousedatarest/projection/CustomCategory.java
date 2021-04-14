package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Category;
import uz.pdp.warehousedatarest.entity.WareHouse;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String getName();

    Category getCategory();

    boolean getActive();
}
