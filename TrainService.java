
package com.aits.Traveldemo;

import org.springframework.stereotype.Component;

@Component("trainservice")
public class TrainService implements TransportService {

	@Override
	public void bookTicket(String source, String destination) {
		System.out.println("Ticket has been booked through trainservice from"+source+"to"+destination);

		// TODO Auto-generated method stub

	}

}
