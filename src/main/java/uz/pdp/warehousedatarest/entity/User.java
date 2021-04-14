package uz.pdp.warehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "firstName should not be null")
    @Column(nullable = false)
    private String firstName;

    @NotNull(message = "lastName should not be null")
    @Column(nullable = false)
    private String lastName;

    @NotNull(message = "phoneNumber should not be null")
    @Column(unique = true,nullable = false)
    private String phoneNumber;

    @Column(unique = true,nullable = false)
    private String code;

    @NotNull(message = "password should not be null")
    @Column(nullable = false)
    private String password;

    private boolean active=true;

    @NotNull(message = "wareHouse should not be null")
    @ManyToMany
    private Set<WareHouse> wareHouse;
}
