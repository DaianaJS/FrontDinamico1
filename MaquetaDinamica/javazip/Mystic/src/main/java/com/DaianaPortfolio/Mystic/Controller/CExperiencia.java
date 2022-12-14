package com.DaianaPortfolio.Mystic.Controller;

import com.DaianaPortfolio.Mystic.Entity.Experiencia;
import com.DaianaPortfolio.Mystic.Service.SExperiencia;
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
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {

    @Autowired
    SExperiencia experienciaServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return experienciaServ.verExperiencia();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id) {
        return experienciaServ.buscarExperiencia(id);
    }

    @PostMapping("/crear")
    public String agregarExperiencia(@RequestBody Experiencia experiencia) {
        experienciaServ.crearExperiencia(experiencia);
        return "La experiencia ha sido creada correctamente.";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id) {
        experienciaServ.borrarExperiencia(id);
        return "La experiencia ha sido eliminada correctamente.";
    }

    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody Experiencia experiencia) {
        experienciaServ.editarExperiencia(experiencia);
    }
}
