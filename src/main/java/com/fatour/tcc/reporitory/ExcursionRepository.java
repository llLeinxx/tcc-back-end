package com.fatour.tcc.reporitory;

import com.fatour.tcc.entity.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
    Optional<Excursion> findExcursionById(Long id);
}
