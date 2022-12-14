package com.DaianaPortfolio.Mystic.Repository;

import com.DaianaPortfolio.Mystic.Entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudio extends JpaRepository <Estudio, Integer> {
    
}
