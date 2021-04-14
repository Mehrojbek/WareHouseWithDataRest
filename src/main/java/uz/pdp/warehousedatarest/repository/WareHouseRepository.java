package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.WareHouse;
import uz.pdp.warehousedatarest.projection.CustomWareHouse;

@RepositoryRestResource(path = "wareHouse",collectionResourceRel = "list",excerptProjection = CustomWareHouse.class)
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {

}
