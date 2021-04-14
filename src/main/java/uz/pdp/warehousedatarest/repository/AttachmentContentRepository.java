package uz.pdp.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehousedatarest.entity.AttachmentContent;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
