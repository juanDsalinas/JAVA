package sena.bootcamp.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sena.bootcamp.modell.Cliente;
import sena.bootcamp.modell.ICliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ICliente valor;
    @GetMapping(path={"/listar","","/"})
    public String listar(Model m){
        m.addAttribute("clientes", valor.findAll());
        return "cliente/listar";
    }

    @GetMapping("/form")     
    public String form(Model m){
        Cliente cliente=new Cliente();
        m.addAttribute("cliente", cliente);
        m.addAttribute("accion","Agregar Cliente");
        return "cliente/form"; 
    }



    @PostMapping("/add")
    public String add(@Valid Cliente cliente,BindingResult res, Model m){
        if(res.hasErrors()){
            return "cliente/form";
        }
        // m.addAttribute("cliente",cliente); 
        // cliented.save(cliente);
        return "redirect:listar";
    }

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable Integer id, Model m){
        Cliente cliente=null;
        if(id>0){
            // cliente=cliented.findOne(id);
        }else{
            return "redirect:listar";
        }
        m.addAttribute("cliente", cliente);
        m.addAttribute("accion","Actualizar Cliente");
        return "cliente/form";
    }

    @GetMapping(value={"/verc"})
    public String listo(Model m){
        Cliente c=new Cliente();
        c.setId(1);
        c.setNombre("juan");
        c.setApellido("salinas");
        c.setEmail("juandsalinas");
        c.setTelefono("2321");
        c.setEstado(true);
        m.addAttribute("cliente", c);
        return "cliente/verc";
    }
}
