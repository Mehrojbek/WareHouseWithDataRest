package uz.pdp.warehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OutputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "product should not be null")
    @ManyToOne
    private Product product;

    @NotNull(message = "amount should not be null")
    @Column(nullable = false)
    private Double amount;

    @NotNull(message = "price should not be null")
    private Double price;

    @NotNull(message = "output should not be null")
    @ManyToOne
    private Output output;

    private boolean active=true;
}
