package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.*;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getAttachment();

    String getCode();

    Measurement getMeasurement();
}
