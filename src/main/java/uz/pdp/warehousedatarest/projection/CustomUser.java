package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.User;
import uz.pdp.warehousedatarest.entity.WareHouse;

import java.util.*;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    List<WareHouse> getWareHouse();

    boolean getActive();

}
