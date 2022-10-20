package org.gisbis.test.microservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "organizations")
@NamedEntityGraph(name = "organization_entity_graph", attributeNodes = @NamedAttributeNode("members"))
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany (mappedBy = "organization")
    private List<User> members;
}
