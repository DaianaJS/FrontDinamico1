package com.DaianaPortfolio.Mystic.Service;

import com.DaianaPortfolio.Mystic.Entity.Proyecto;
import com.DaianaPortfolio.Mystic.Repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired 
    public RProyecto proyectoRepo;

    public List<Proyecto> verProyecto() {
        List<Proyecto> listaProyecto = proyectoRepo.findAll();
        return listaProyecto;
    }

    public Proyecto buscarProyecto(int id) {
        Proyecto proyecto = proyectoRepo.findById(id).orElse(null);
        return proyecto;
    }
    
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }

    public void borrarProyecto(int id) {
        proyectoRepo.deleteById(id);
    }
    
    public void editarProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }
}
