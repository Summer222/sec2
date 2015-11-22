package data.infodata;

import static junit.framework.TestCase.assertEquals;

import java.rmi.RemoteException;
<<<<<<< HEAD
import java.util.ArrayList;

=======
import java.sql.SQLException;
import java.util.ArrayList;

import data.dao.DataBaseFactoryMysqlImpl;
import data.dao.DatabaseFactory;
import dataservice.infodataservice.SystemUserManagementDataService;
>>>>>>> mjwyy/master
import org.junit.Test;

import po.UserPO;
import data.infodata.MockObject.MockSystemUserManagement;
import dataservice.exception.ElementNotFoundException;
import dataservice.exception.InterruptWithExistedElementException;

public class SystemUserManagementData_Test {
<<<<<<< HEAD
	static SystemUserManagementData b=new SystemUserManagementData();
static void init() throws RemoteException, InterruptWithExistedElementException{
	MockSystemUserManagement a=new MockSystemUserManagement("1234567");
	MockSystemUserManagement a1=new MockSystemUserManagement("1234666");
	MockSystemUserManagement a2=new MockSystemUserManagement("1234555");
	b.addUser(a);
	b.addUser(a1);
	b.addUser(a2);
}
	@Test
	public void testAddUser() throws RemoteException, InterruptWithExistedElementException {
		MockSystemUserManagement a3=new MockSystemUserManagement("1234567");
		//assertEquals(true,b.addUser(a3));
	}

	@Test
	public void testRemoveUser() throws RemoteException, ElementNotFoundException, InterruptWithExistedElementException {
		MockSystemUserManagement a4=new MockSystemUserManagement("1234566");
		//assertEquals(true,b.removeUser(a4));
	}



	@Test
	public void testInquireUser() throws RemoteException, ElementNotFoundException {
		MockSystemUserManagement a=new MockSystemUserManagement("1234567");
		ArrayList<UserPO> c=new ArrayList<UserPO>();
		c.add(a);
	//	assertEquals(c,b.inquireUser(a));
	}

	@Test
	public void testGetAllUsers() throws RemoteException {
		MockSystemUserManagement a=new MockSystemUserManagement("1234567");
		SystemUserManagementData b=new SystemUserManagementData();
		b.getAllUsers();
		//assertEquals("1234567",a.getAccount());
=======
    DatabaseFactory databaseFactory;

    public SystemUserManagementData_Test() throws RemoteException {
        databaseFactory = DataBaseFactoryMysqlImpl.getInstance();
    }

    //	@Test
	public void testAddUser() throws Exception {
		UserPO po = new UserPO("toDelete","sbsbsb",5);
        SystemUserManagementDataService service = databaseFactory.getSystemUserManagementDataService();
		assertEquals(true,service.addUser(po));
	}

//	@Test
	public void testRemoveUser() throws Exception {
        UserPO po = new UserPO("test1",null,0);
        SystemUserManagementDataService service = databaseFactory.getSystemUserManagementDataService();
        assertEquals(true,service.removeUser(po));
	}

//    @Test
    public void testInquireUser() throws Exception {
        UserPO a=new UserPO("admin",null,0);
        SystemUserManagementDataService service = databaseFactory.getSystemUserManagementDataService();
        ArrayList<UserPO> result = service.inquireUser(a);
        for (UserPO po2:result) {
            System.out.println(po2);
        }
    }

//	@Test
	public void testGetAllUsers() throws Exception {
        SystemUserManagementDataService service = databaseFactory.getSystemUserManagementDataService();
        ArrayList<UserPO> result = service.getAllUsers();
        for (UserPO po2:result) {
            System.out.println(po2);
        }
>>>>>>> mjwyy/master
	}

}
