package com.github.rodrigojss.countries.repositories;

import com.github.rodrigojss.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
