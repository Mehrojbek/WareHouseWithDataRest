package uz.pdp.warehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "date should not be null")
    private Timestamp date;

    @NotNull(message = "wareHouse should not be null")
    @ManyToOne
    private WareHouse wareHouse;

    @NotNull(message = "suplier should not be null")
    @ManyToOne
    private Suplier suplier;

    @NotNull(message = "currency should not be null")
    @ManyToOne
    private Currency currency;

    @NotNull(message = "factureNumber should not be null")
    private String factureNumber;

    @Column(unique = true,nullable = false)
    private String code;

    private boolean active=true;

}
