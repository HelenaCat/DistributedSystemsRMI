package rental;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import client.ReservationConstraints;

public interface ICarRentalCompany extends Remote{

	public boolean isAvailable(String carTypeName, Date start, Date end);
	
	public Set<CarType> getAvailableCarTypes(Date start, Date end);
	
	public Quote createQuote(ReservationConstraints constraints, String client) throws ReservationException;
	
	public Reservation confirmQuote(Quote quote) throws ReservationException;
	
	public List<Reservation> getAllReservationsByClient(String client);
	
	public int getNumberOfReservationsForCarType(String carType);
}