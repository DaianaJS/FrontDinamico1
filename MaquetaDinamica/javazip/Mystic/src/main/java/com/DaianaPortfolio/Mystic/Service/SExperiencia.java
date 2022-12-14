package com.DaianaPortfolio.Mystic.Service;

import com.DaianaPortfolio.Mystic.Entity.Experiencia;
import com.DaianaPortfolio.Mystic.Repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
@Autowired
    public RExperiencia experienciaRepo;

    public List<Experiencia> verExperiencia() {
        List<Experiencia> listaExperiencia = experienciaRepo.findAll();
        return listaExperiencia;
    }

    public Experiencia buscarExperiencia(int id) {
        Experiencia experiencia = experienciaRepo.findById(id).orElse(null);
        return experiencia;
    }
    
    public void crearExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }

    public void borrarExperiencia(int id) {
        experienciaRepo.deleteById(id);
    }
    
    public void editarExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }    
}
