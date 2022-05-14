package product.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productmaintenance")
public class product {
	@Id
    private String code;
	@Column(nullable = false,length = 255)
    private String description;
	
	@Column(nullable = false)
    private double price;
	
    @Override
    public String toString() {
        return "User{" +
                "id=" + code +
                ", email='" + description + '\'' +
                ", password='" + price + '\'' +
                '}';
    }
}
