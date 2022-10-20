package org.gisbis.organization.microservice.repository;

import org.gisbis.organization.microservice.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, Integer> {
}
