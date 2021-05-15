package com.github.brenopiloto.citiesapi.countries.repository;

import com.github.brenopiloto.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
