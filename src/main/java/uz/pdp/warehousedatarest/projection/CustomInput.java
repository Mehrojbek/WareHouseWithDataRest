package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.*;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

    Suplier getSuplier();

    boolean getActive();
}
