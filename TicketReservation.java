
package com.aits.Traveldemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class TicketReservation {
	
	//Map<String,TransportService> transportService;
	
	
	@Autowired
	BusService busservice1;
	
	@Autowired
	BusService busservice2;
	
	public void printObj() {
		
		System.out.println("busservice object id is" + busservice1);
		System.out.println("busservice object id is" + busservice2);

	}
	
	/*public TicketReservation(Map<String,TransportService> transportService) {
		this.transportService=transportService;
		
	}
	
	public void bookTicket(String serviceType,String source,String destination ) {
		
		TransportService tp=transportService.get(serviceType);
		
		tp.bookTicket(source, destination);
	}
	*/

}
