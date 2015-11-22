package data.infodata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.DriverPO;
import po.VehiclePO;
import dataservice.exception.ElementNotFoundException;
import dataservice.exception.InterruptWithExistedElementException;
import dataservice.infodataservice.DriverVehicleManagementDataService;

public class DriverVehicleManagementData implements DriverVehicleManagementDataService{

	@Override
	public boolean addDriver(DriverPO driver) throws RemoteException,
			InterruptWithExistedElementException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean addVehicle(VehiclePO vehicle) throws RemoteException,
			InterruptWithExistedElementException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean removeDriver(DriverPO driver) throws RemoteException,
			ElementNotFoundException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean removeVehicle(VehiclePO vehicle) throws RemoteException,
			ElementNotFoundException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		 
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean modifyDriver(DriverPO originalDriver, DriverPO modified)
			throws RemoteException, ElementNotFoundException,
			InterruptWithExistedElementException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		 
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean modifyVehicle(VehiclePO originalVehicle, VehiclePO modified)
			throws RemoteException, ElementNotFoundException,
			InterruptWithExistedElementException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		 
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public ArrayList<DriverPO> getAllDriver() throws RemoteException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		 
>>>>>>> mjwyy/master
		return null;
	}

	@Override
	public ArrayList<VehiclePO> getAllVehicles() throws RemoteException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		 
>>>>>>> mjwyy/master
		return null;
	}

	@Override
	public ArrayList<DriverPO> inquireDriver(DriverPO keywords)
			throws RemoteException, ElementNotFoundException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		 
>>>>>>> mjwyy/master
		return null;
	}

	@Override
	public ArrayList<VehiclePO> inquireVehicle(VehiclePO keywords)
			throws RemoteException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		 
>>>>>>> mjwyy/master
		return null;
	}

}
