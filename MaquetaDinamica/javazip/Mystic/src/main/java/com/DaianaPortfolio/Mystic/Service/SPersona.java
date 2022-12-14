package com.DaianaPortfolio.Mystic.Service;

import com.DaianaPortfolio.Mystic.Entity.Persona;
import com.DaianaPortfolio.Mystic.Repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {

    @Autowired
    public RPersona personaRepo;

    public List<Persona> verPersona() {
        List<Persona> listaPersona = personaRepo.findAll();
        return listaPersona;
    }

    public Persona buscarPersona(int id) {
        Persona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }
    
    public void crearPersona(Persona persona) {
        personaRepo.save(persona);
    }

    public void borrarPersona(int id) {
        personaRepo.deleteById(id);
    }
    
    public void editarPersona(Persona persona) {
        personaRepo.save(persona);
    }
}
