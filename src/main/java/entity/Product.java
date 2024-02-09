package entity;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity( name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "product_name")
    private String productName;

    private String description;

    private Double price;
    private int quantity;
    private Category category;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createAt;
    @Column(name = "updated_at")

    private LocalDateTime updateAt;

}
