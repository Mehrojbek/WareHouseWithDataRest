package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Suplier;
import uz.pdp.warehousedatarest.entity.User;
import uz.pdp.warehousedatarest.entity.WareHouse;

import java.util.List;

@Projection(types = Suplier.class)
public interface CustomSuplier {

    Integer getId();

    String getName();

    String getPhoneNumber();


}
