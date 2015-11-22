package data.infodata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.OrganizationPO;
import po.StaffPO;
import dataservice.exception.ElementNotFoundException;
import dataservice.exception.InterruptWithExistedElementException;
import dataservice.infodataservice.StaffOrganizationManagementDataService;

public class StaffOrganizationManagementData implements
		StaffOrganizationManagementDataService {

	public StaffOrganizationManagementData() {
<<<<<<< HEAD
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addStaff(StaffPO staff) throws RemoteException,
			InterruptWithExistedElementException {
		// TODO Auto-generated method stub
=======
		 
	}

    //TODO 去除数据接口的RemoteException
    //对接口的实现方法一般不抛出RemoteException。
    //根据接口最小化原则，实现类仅是业务逻辑相关，而无需关注具体的RMI错误。
    @Override
	public boolean addStaff(StaffPO staff) throws RemoteException,
			InterruptWithExistedElementException {
		  
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean addOrganization(OrganizationPO org) throws RemoteException,
			InterruptWithExistedElementException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean removeStaff(StaffPO staff) throws RemoteException,
			ElementNotFoundException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean removeOrganization(OrganizationPO org)
			throws RemoteException, ElementNotFoundException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean modifyStaff(StaffPO original, StaffPO modified)
			throws RemoteException, ElementNotFoundException,
			InterruptWithExistedElementException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public boolean modifyOrganization(OrganizationPO original,
			OrganizationPO modified) throws RemoteException,
			ElementNotFoundException, InterruptWithExistedElementException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return false;
	}

	@Override
	public ArrayList<StaffPO> findStaff(StaffPO info) throws RemoteException,
			ElementNotFoundException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return null;
	}

	@Override
	public ArrayList<OrganizationPO> findOrganization(OrganizationPO info)
			throws RemoteException, ElementNotFoundException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return null;
	}

	@Override
	public ArrayList<StaffPO> getAllStaff() throws RemoteException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return null;
	}

	@Override
	public ArrayList<OrganizationPO> getAllOrganizations()
			throws RemoteException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		  
>>>>>>> mjwyy/master
		return null;
	}

}
