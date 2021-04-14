package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Client;
import uz.pdp.warehousedatarest.entity.Currency;
import uz.pdp.warehousedatarest.entity.Output;
import uz.pdp.warehousedatarest.entity.WareHouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

    Client getClient();

    boolean getActive();
}
