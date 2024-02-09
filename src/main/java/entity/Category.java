package entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity(name = "category_table")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @CreationTimestamp
    @Column(name ="created_at")
    private LocalDateTime cratedAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updateAt;

    public Category(Long id) {
        this.id = id;
    }
}
