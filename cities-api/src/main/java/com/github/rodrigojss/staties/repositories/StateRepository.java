package com.github.rodrigojss.staties.repositories;

import com.github.rodrigojss.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
