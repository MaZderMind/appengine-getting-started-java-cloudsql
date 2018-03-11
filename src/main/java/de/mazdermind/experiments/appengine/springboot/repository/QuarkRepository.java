package de.mazdermind.experiments.appengine.springboot.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.mazdermind.experiments.appengine.springboot.model.Quark;

@Repository
public interface QuarkRepository extends JpaRepository<Quark, UUID> {
}
