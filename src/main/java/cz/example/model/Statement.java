package cz.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "statement")
public class Statement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statementId;

    @Column(nullable = false, length = 20)
    private String number;

    @Column(nullable = false, length = 20)
    private String period;

    @Column(length = 1000)
    private String description;
}
