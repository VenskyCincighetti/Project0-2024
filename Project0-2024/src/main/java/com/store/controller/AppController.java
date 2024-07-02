package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.store.entity.Vent;
import com.store.exception.BadRequestInputException;
import com.store.service.VentService;

@RestController
public class AppController {

	
	@Autowired
	private VentService ventServ;
	
	
	
				////////////////////
				//-----Create-----//
				////////////////////
		
	@PostMapping(value = "/newVent")    
	public @ResponseBody  Vent createVent(@RequestBody Vent vent)
	throws BadRequestInputException
	{
		return ventServ.createVent(vent);
	}
	
	
				////////////////////
				//----Retrieve----//
				////////////////////
	
	@GetMapping(value = "/vents")
    public @ResponseBody List<Vent> HomePage()
    {	
        return ventServ.getAllVent();
    }
	
    @GetMapping(value = "/vents/{vent_id}") 
    public @ResponseBody Vent getVentByVentId(@PathVariable Integer vent_id) 
    throws BadRequestInputException
    {
        return ventServ.getVentByVentId(vent_id);
    }

    
				////////////////////
				//-----Update-----//
				////////////////////
    
    @PatchMapping(value = "/vents/{vent_id}")
    public @ResponseBody Vent updateVent(@PathVariable Integer vent_id, @RequestBody Vent vent) 
    throws BadRequestInputException
    //throws BadRequestInputException
    {
        return ventServ.updateVentByVent_id(vent_id, vent);
    }
    
    
				////////////////////
				//-----Delete-----//
				////////////////////
    
    @DeleteMapping(value = "/vents/{vent_id}") 
    public @ResponseBody Integer deleteVentByVentId(@PathVariable Integer vent_id)
    {
        return ventServ.deleteVentByVentId(vent_id);
    }
    
}
