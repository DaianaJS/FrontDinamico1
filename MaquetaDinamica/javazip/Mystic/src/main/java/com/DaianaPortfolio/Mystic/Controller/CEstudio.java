package com.DaianaPortfolio.Mystic.Controller;

import com.DaianaPortfolio.Mystic.Entity.Estudio;
import com.DaianaPortfolio.Mystic.Service.SEstudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estudio")
@CrossOrigin(origins = "http://localhost:4200")
public class CEstudio {

    @Autowired
    SEstudio estudioServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Estudio> verEstudio() {
        return estudioServ.verEstudio();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Estudio verEstudio(@PathVariable int id) {
        return estudioServ.buscarEstudio(id);
    }

    @PostMapping("/crear")
    public String agregarEstudio(@RequestBody Estudio estudio) {
        estudioServ.crearEstudio(estudio);
        return "El estudio ha sido creado correctamente.";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarEstudio(@PathVariable int id) {
        estudioServ.borrarEstudio(id);
        return "El estudio ha sido eliminado correctamente.";
    }

    @PutMapping("/editar")
    public void editarEstudio(@RequestBody Estudio estudio) {
        estudioServ.editarEstudio(estudio);
    }
}
