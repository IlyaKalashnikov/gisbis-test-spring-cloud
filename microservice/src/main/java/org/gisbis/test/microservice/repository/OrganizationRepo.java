package org.gisbis.test.microservice.repository;

import org.gisbis.test.microservice.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepo extends JpaRepository<Organization, Integer> {
}
