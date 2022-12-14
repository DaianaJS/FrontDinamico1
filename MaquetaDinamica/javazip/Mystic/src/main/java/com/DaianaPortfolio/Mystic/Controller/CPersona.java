package com.DaianaPortfolio.Mystic.Controller;

import com.DaianaPortfolio.Mystic.Entity.Persona;
import com.DaianaPortfolio.Mystic.Service.SPersona;
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
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {

    @Autowired
    SPersona personaServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersona() {
        return personaServ.verPersona();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id) {
        return personaServ.buscarPersona(id);
    }

    @PostMapping("/crear")
    public String agregarPersona(@RequestBody Persona persona) {
        personaServ.crearPersona(persona);
        return "La persona ha sido creada correctamente.";
    }

    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id) {
        personaServ.borrarPersona(id);
        return "La persona ha sido eliminada correctamente.";
    }

    @PutMapping("/editar")
    public void editarPersona(@RequestBody Persona persona) {
        personaServ.editarPersona(persona);
    }
}
