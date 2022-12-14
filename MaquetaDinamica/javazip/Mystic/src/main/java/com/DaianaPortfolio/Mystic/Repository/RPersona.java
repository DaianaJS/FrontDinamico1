package com.DaianaPortfolio.Mystic.Repository;

import com.DaianaPortfolio.Mystic.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer>{
    
}
