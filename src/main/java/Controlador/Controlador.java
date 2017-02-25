/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonathan
 */
@Controller 
public class Controlador {
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
    }
    
    @RequestMapping(value="/persona1", method = RequestMethod.GET)
    public ModelAndView persona1(ModelMap model,HttpServletRequest request){
        String p = request.getParameter("nombre1");
        model.addAttribute("persona", p);
        return new ModelAndView("persona",model);
    
    }
    
    @RequestMapping(value="/persona2", method = RequestMethod.POST)
    public ModelAndView persona2(ModelMap model,HttpServletRequest request){
        String p = request.getParameter("nombre2");
        model.addAttribute("persona", p);
        return new ModelAndView("persona",model);
    
    }
	
	@RequestMapping(value="/sesion", method = RequestMethod.POST)
	public ModelAndView sesion (ModelMap model, HttpServletRequest request) {
		//input correo
		String correo = request.getParameter ("correo");
		//input contraseña
		String pass = request.getParameter ("pass");
		model.addAttribute ("correo", correo);
		model.addAttribute ("pass", pass);
		//sesion.jsp
		return new ModelAndView ("sesion", model);
	}
	
	@RequestMapping(value="/registro", method = RequestMethod.GET)
	public ModelAndView registro (ModelMap model, HttpServletRequest request) {
		return new ModelAndView ("registro", model);
	}
	
	@RequestMapping(value="/registrar", method = RequestMethod.GET)
	public ModelAndView registrar (ModelMap model, HttpServletRequest request) {
		String nombre = request.getParameter ("nombre");
		String carrera = request.getParameter ("carrera");
		String dd = request.getParameter ("dd");
		String mm = request.getParameter ("mm");
		String yyyy = request.getParameter ("yyyy");
		String correo = request.getParameter ("correo");
		String pass = request.getParameter ("pass");
		model.addAttribute ("nombre",nombre);
		model.addAttribute ("carrera",carrera);
		model.addAttribute ("dd",dd);
		model.addAttribute ("mm",mm);
		model.addAttribute ("yyyy",yyyy);
		model.addAttribute ("correo",correo);
		model.addAttribute ("pass",pass);
		return new ModelAndView ("registrado", model);
	}
}
