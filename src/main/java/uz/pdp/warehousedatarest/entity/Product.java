package uz.pdp.warehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product extends AbsEntity {

    @NotNull(message = "category should not be null")
    @ManyToOne(optional = false)
    private Category category;

    @NotNull(message = "attachment should not be null")
    @OneToOne
    private Attachment attachment;


    private String code;

    @NotNull(message = "measurement should not be null")
    @ManyToOne(optional = false)
    private Measurement measurement;

}
