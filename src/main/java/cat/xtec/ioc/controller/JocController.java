package cat.xtec.ioc.controller;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.service.JocService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jocs")
public class JocController {

    @Autowired
    private JocService jocService;

       @RequestMapping("/{name}")
    public ModelAndView getJocByName(@PathVariable("name") String nomJoc, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("stock");
        modelview.getModelMap().addAttribute("joc", jocService.getJocByName(nomJoc));
        return modelview;
    }
   

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("cercaJoc");
        Joc newJoc = new Joc();
        modelview.getModelMap().addAttribute("findJoc", newJoc);
        return modelview;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String processForm(@ModelAttribute("findJoc") Joc joc) {
        return "redirect:/jocs/" + joc.getName(); 
    }

}
