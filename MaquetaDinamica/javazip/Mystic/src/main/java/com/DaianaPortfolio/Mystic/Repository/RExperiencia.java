package com.DaianaPortfolio.Mystic.Repository;

import com.DaianaPortfolio.Mystic.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Integer> {
    
}
