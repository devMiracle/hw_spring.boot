package net.miracle.broker.entity;


import lombok.*;
import javax.persistence.*;

@Entity
@Table(name="Feedbacks")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = false, length = 50)
    private String name;
    @Column(name="email", nullable = false, unique = true, length = 50)
    private String email;
    @Column(name="subject", nullable = false, unique = false, length = 50)
    private String subject;
    @Column(name="text", nullable = false, unique = false, length = 400)
    private String text;
}
