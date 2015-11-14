package dataservice.logisticdataservice._Driver;

import dataservice.logisticdataservice.DeliveryNoteInputDataService;
import dataservice.logisticdataservice._Stub.DeliveryNoteInputDataService_Stub;
import po.DeliveryNotePO;
import util.enums.DeliverCategory;

import java.rmi.RemoteException;

/**
 * Created by kylin on 15/10/21.
 */
public class DeliveryNoteInputDataService_Driver {

    public static void main(String[] args) throws RemoteException {
        DeliveryNoteInputDataService service = new DeliveryNoteInputDataService_Stub();
        DeliveryNoteInputDataService_Driver driver = new DeliveryNoteInputDataService_Driver();
        driver.drive(service);
    }

    public void drive(DeliveryNoteInputDataService service) throws RemoteException {
        DeliveryNotePO po1 = new DeliveryNotePO("王二狗","江苏省南京市栖霞区南京大学仙林校区","南京大学仙林校区",
                "150052120000","1",0.5,20,"离散数学", DeliverCategory.ECNOMIC,5,"1234567890");
        DeliveryNotePO po2 = new DeliveryNotePO("kylin","江苏省南京市栖霞区南京大学仙林校区","南京大学仙林校区",
                "150052126666","1",0.5,20,"head first java",DeliverCategory.EXPRESS,5,"1234567891");
        if(service.insert(po1))
        	System.out.println("insert succeed");
        else
        	System.out.println("insert failed");
        if(service.insert(po2))
        	System.out.println("insert succeed");
        else
        	System.out.println("insert failed");
        service.findAll();
        service.find(po1);
        service.find(po2);
        if(service.delete(po1))
        	System.out.println("delete succeed");
        else
        	System.out.println("delete failed");
        service.findAll();
        po2 = new DeliveryNotePO("一只麟","江苏省南京市栖霞区南京大学仙林校区","南京大学仙林校区",
                "150052126666","1",0.2,20,"人月神话",DeliverCategory.EXPRESS,5,"1234567894");
        if(service.update(po2))
        	System.out.println("update succeed");
        else
        	System.out.println("update failed");
        service.findAll();
    }
}
