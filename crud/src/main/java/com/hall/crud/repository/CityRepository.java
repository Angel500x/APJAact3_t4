package com.hall.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hall.crud.models.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
