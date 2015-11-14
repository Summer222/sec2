package dataservice.statisticdataservice._Stub;
/**
 * @author wwz
 * @data 2015-10-22
 */
import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.statisticdataservice.BusinessDataModificationDataService;
import dataservice.exception.ElementNotFoundException;
import dataservice.exception.InterruptWithExistedElementException;
import po.DistancePO;
import util.enums.PriceType;

public class BusinessDataModificationDataService_Stub implements BusinessDataModificationDataService{

	

	 
	public boolean addCity(String name) throws RemoteException, InterruptWithExistedElementException {
		System.out.println("added city");
		return false;
	}

	 
	public ArrayList<String> getAllCities() throws RemoteException {
		System.out.println("returning cities");
		return null;
	}

	 
	public void setDistance(DistancePO distancePO) {
		System.out.println("set distance");
	}

	 
	public void getDistance(DistancePO distancePO) {		
		System.out.println("got distance");
	}

	 
	public boolean setPrice(PriceType name, double newValue)
			throws RemoteException, ElementNotFoundException {
		System.out.println("set price");
		return false;
	}

	 
	public double getPrice(PriceType name) throws RemoteException,
			ElementNotFoundException {
		System.out.println("got price");
		return 0;
	}



	

}
