package com.example.explorecalijpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.explorecalijpa.model.TourPackage;
import java.util.Optional;


public interface TourPackageRepository extends JpaRepository<TourPackage, String> {
    // This interface is empty. It inherits methods from CrudRepository.
    // Spring Data JPA will provide the implementation at runtime.
    Optional<TourPackage> findByName(String name);

}
