package org.gisbis.test.microservice.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
