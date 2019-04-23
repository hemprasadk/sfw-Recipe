package prasad.springframework.recipe.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"recipe"})
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrption;
    private BigDecimal amount;


    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure unitOfMeasure;

    public Ingredient(String descrption, BigDecimal amount, UnitOfMeasure unitOfMeasure) {
        this.descrption = descrption;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }

    @ManyToOne
    private Recipe recipe;

}
