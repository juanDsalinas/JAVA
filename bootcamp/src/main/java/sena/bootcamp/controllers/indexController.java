package sena.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// indica quye es un controllador
@Controller
// @RequestMapping("/cliente")
public class indexController {
    // handlers - toca mapearlos para indicarles hacia donde nos conducen
    // @RequestMapping(value="/index")
    // @GetMapping(value="/index")
    // public ModelAndView index(ModelAndView mv){
    //     mv.addObject("msg", "mensaje de la ottra forma");
    //     mv.setViewName("index");
    //     return mv;
    // }

    @GetMapping(value="/indexi")
        public String indexi(Model m){
        m.addAttribute("msg", "este es un mensaje");
        return "indexi";
    }

    @GetMapping(value="/home")
        public String body(){
            return "forward:/indexi";
        }

    // public ModelAndView indexo(ModelAndView mv){
    //     mv.addObject("msg", "this messaje provine of controlador");
    //     mv.setViewName("indexi");
    //     return mv;
    // }
    
}


