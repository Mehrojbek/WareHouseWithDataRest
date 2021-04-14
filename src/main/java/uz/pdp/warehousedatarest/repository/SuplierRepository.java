package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.Suplier;
import uz.pdp.warehousedatarest.projection.CustomSuplier;

@RepositoryRestResource(path = "suplier",excerptProjection = CustomSuplier.class)
public interface SuplierRepository extends JpaRepository<Suplier,Integer> {

}
