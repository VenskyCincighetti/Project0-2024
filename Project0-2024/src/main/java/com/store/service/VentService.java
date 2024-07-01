package com.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Vent;
import com.store.exception.BadRequestInputException;
import com.store.repository.VentRepository;

@Service
public class VentService {
	
	@Autowired
	VentRepository ventRepo;
	
	public List<Vent> getAllVent() {
		return ventRepo.findAll();
	}

	
	public Vent createVent(Vent vent)
	throws BadRequestInputException
	{
		if(vent.getName().length() == 0)
			throw new BadRequestInputException("Name field is blank.");
		if(254 < vent.getName().length())
			throw new BadRequestInputException("Name field contains too many characters.");
		if(vent.getWidth() == 0 || vent.getLength() == 0)
			throw new BadRequestInputException("Length or Width cannot equal 0.");
		
		//Optional<Vent> optionalVent = Optional.of(ventRepo.getById(.getVent_id()));
		if(!ventRepo.existsById(vent.getVent_id()))
			throw new BadRequestInputException("Vent id doesn't match any data.");
		
		return ventRepo.saveAndFlush(vent);
	}

	@SuppressWarnings("deprecation")
	public Vent getVentByVentId(Integer vent_id)
	throws BadRequestInputException
	{
		if(!ventRepo.existsById(vent_id))
			throw new BadRequestInputException("Vent id doesn't match any data.");
		
		return ventRepo.getById(vent_id);
	}
	
    
	public Vent updateVentByVent_id(Integer vent_id, Vent vent) 
		throws BadRequestInputException 
	{
		if(vent.getName().length() == 0)
			throw new BadRequestInputException("Name field is blank.");
		if(254 < vent.getName().length())
			throw new BadRequestInputException("Name field contains too many characters.");
		if(vent.getWidth() == 0 || vent.getLength() == 0)
			throw new BadRequestInputException("Length or Width cannot equal 0.");
		
		vent.setVent_id(vent_id);
		
		return ventRepo.save(vent);
	}
	

	public Integer deleteVentByVentId(Integer vent_id) 
	
	{
		if(!ventRepo.existsById(vent_id))
			return 0;
		
		try 
		{
			ventRepo.deleteById(vent_id);
		} 
		catch (Exception e) 
		{
			e.getMessage();
			return 0;
		}
		
		return 1;
	
	}
	

}
