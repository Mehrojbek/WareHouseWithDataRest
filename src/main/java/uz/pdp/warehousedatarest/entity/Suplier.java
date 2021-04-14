package uz.pdp.warehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Suplier extends AbsEntity {

    @NotNull(message = "phoneNumber should not be null")
    @Column(unique = true,nullable = false)
    private String phoneNumber;
}
