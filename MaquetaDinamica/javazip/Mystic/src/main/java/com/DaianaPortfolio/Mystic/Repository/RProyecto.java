package com.DaianaPortfolio.Mystic.Repository;

import com.DaianaPortfolio.Mystic.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer> {
    
}
