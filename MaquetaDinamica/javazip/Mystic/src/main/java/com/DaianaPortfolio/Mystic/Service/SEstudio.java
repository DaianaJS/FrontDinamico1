package com.DaianaPortfolio.Mystic.Service;

import com.DaianaPortfolio.Mystic.Entity.Estudio;
import com.DaianaPortfolio.Mystic.Repository.REstudio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEstudio {

    @Autowired
    public REstudio estudioRepo;

    public List<Estudio> verEstudio() {
        List<Estudio> listaEstudio = estudioRepo.findAll();
        return listaEstudio;
    }

    public Estudio buscarEstudio(int id) {
        Estudio estudio = estudioRepo.findById(id).orElse(null);
        return estudio;
    }

    public void crearEstudio(Estudio estudio) {
        estudioRepo.save(estudio);
    }

    public void borrarEstudio(int id) {
        estudioRepo.deleteById(id);
    }

    public void editarEstudio(Estudio estudio) {
        estudioRepo.save(estudio);
    }
}

