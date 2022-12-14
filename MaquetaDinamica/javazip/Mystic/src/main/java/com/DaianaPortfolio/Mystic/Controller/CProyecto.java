package com.DaianaPortfolio.Mystic.Controller;

import com.DaianaPortfolio.Mystic.Entity.Proyecto;
import com.DaianaPortfolio.Mystic.Service.SProyecto;
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
@RequestMapping("proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {

    @Autowired
    SProyecto proyectoServ; 

    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return proyectoServ.verProyecto();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id) {
        return proyectoServ.buscarProyecto(id);
    }

    @PostMapping("/crear")
    public String agregarProyecto(@RequestBody Proyecto proyecto) {
        proyectoServ.crearProyecto(proyecto);
        return "El proyecto ha sido creado correctamente.";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id) {
        proyectoServ.borrarProyecto(id);
        return "El proyecto ha sido eliminado correctamente.";
    }

    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto proyecto) {
        proyectoServ.editarProyecto(proyecto);
    }
}
