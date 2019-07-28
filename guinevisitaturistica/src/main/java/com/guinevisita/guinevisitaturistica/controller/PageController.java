package com.guinevisita.guinevisitaturistica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guinevisita.guinevisitaturisticabackend.dao.DestinationDAO;
import com.guinevisita.guinevisitaturisticabackend.dto.Destination;

@Controller
public class PageController {
	
	@Autowired
	DestinationDAO destinationDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView view() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","accueil");
		modelandview.addObject("userclickhome",true);
		
		return modelandview;
	}
	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","contact");
		modelandview.addObject("userclickcontact",true);
		
		return modelandview;
	}
	
	
	
	
	@RequestMapping(value = "/gastronomie")
	public ModelAndView gastro() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","gastronomie");
		modelandview.addObject("userclickgastro",true);
		
		return modelandview;
	}
	
	@RequestMapping(value = "etnic")
	public ModelAndView etnic() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","ethnies");
		modelandview.addObject("userclicketnic",true);
		
		return modelandview;
	}
	
	
	@RequestMapping(value = "/show/all/hotels")
	public ModelAndView reservation() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","reservation");
		modelandview.addObject("userclickreservation",true);
		
		
		modelandview.addObject("destinations",destinationDAO.listDestination());
		return modelandview;
		
	}
	
	
	
	@RequestMapping(value = "/show/destination/{id}/hotels")
	public ModelAndView reservationHotel(@PathVariable("id") int id) {
		ModelAndView modelandview=new ModelAndView("page");
		Destination destination=null;
		 destination=destinationDAO.get(id);
		modelandview.addObject("title",destination.getDest_name());
		///Single Category
		modelandview.addObject("destination",destination); 
		///all Destinations
		modelandview.addObject("destinations",destinationDAO.listDestination());
		
		///single Destination
		modelandview.addObject("userclickSingleDestination",true);
		
		return modelandview;
		
		
		
	}
	

}
