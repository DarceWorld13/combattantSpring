package fr.combattant.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupDataInit {

	@Autowired
	CombattantRepo pRepo; 
	
	
	 @EventListener(ContextRefreshedEvent.class)
	    public void init() {
		 
		 Combattant mcgregor = new Combattant(); 
		 mcgregor.setId(1);
		 mcgregor.setName("Conor Mcgregor");
		 mcgregor.setBjj(10);
		 mcgregor.setBoxing(30);
		 mcgregor.setWrestling(15);
		 Combattant khabib = new Combattant(); 
		 khabib.setId(2);
		 khabib.setName("Khabib Nurmagomedov");
		 khabib.setBjj(30);
		 khabib.setBoxing(10);
		 khabib.setWrestling(30);
		 Combattant ferguson = new Combattant(); 
		 ferguson.setId(3);
		 ferguson.setName("Tony Ferguson");
		 ferguson.setBjj(25);
		 ferguson.setBoxing(25);
		 ferguson.setWrestling(15);
		 
		 pRepo.save(ferguson); 
		 pRepo.save(mcgregor); 
		 pRepo.save(khabib); 
		 
		 
		 
		 
	 }
	
	
}