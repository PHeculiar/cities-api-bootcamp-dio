package com.github.phelipe.citiesapi.countries.repository;

import com.github.phelipe.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
