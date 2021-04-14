package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.InputProduct;
import uz.pdp.warehousedatarest.entity.Output;
import uz.pdp.warehousedatarest.entity.OutputProduct;
import uz.pdp.warehousedatarest.entity.Product;

import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    boolean getActive();
}
