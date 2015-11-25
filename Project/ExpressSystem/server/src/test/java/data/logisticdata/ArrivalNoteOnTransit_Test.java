package data.logisticdata;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

import dataservice.exception.ElementNotFoundException;
import org.junit.Test;

import data.logisticdata.MockObject.MockArrivalNoteOnTransit;
import dataservice.logisticdataservice.ArrivalNoteOnTransitDataService;
import po.ArrivalNoteOnTransitPO;
import util.BarcodeAndState;
import util.enums.GoodsState;

/**
 * Created by kylin on 15/11/10.
 */
public class ArrivalNoteOnTransit_Test {

    private ArrivalNoteOnTransitData service = new ArrivalNoteOnTransitData();

    @Test
    public void testInsert() throws RemoteException, SQLException, ElementNotFoundException {
        BarcodeAndState bar=new BarcodeAndState("0123456789",GoodsState.COMPLETE);
    	BarcodeAndState bar2=new BarcodeAndState("0123456790",GoodsState.COMPLETE);
    	BarcodeAndState bar3=new BarcodeAndState("0123456790",GoodsState.COMPLETE);
		ArrayList<BarcodeAndState> BarcodeAndStates=new ArrayList<BarcodeAndState> ();
		BarcodeAndStates.add(bar);
		BarcodeAndStates.add(bar2);
		BarcodeAndStates.add(bar3);
        ArrivalNoteOnTransitPO mock = new ArrivalNoteOnTransitPO(
                "99999", "025100", "2011-11-11", "北京", BarcodeAndStates);
        service.insert(mock);
    }

    //    @Test
    public void testFindAll() throws RemoteException, SQLException, ElementNotFoundException {
        BarcodeAndState bar=new BarcodeAndState("0123456790",GoodsState.COMPLETE);
		ArrayList<BarcodeAndState> BarcodeAndStates=new ArrayList<BarcodeAndState> ();
		BarcodeAndStates.add(bar);
    	MockArrivalNoteOnTransit mock = new MockArrivalNoteOnTransit(
    			"025100201510200000001","025100","2011-11-11","北京",BarcodeAndStates);
    	MockArrivalNoteOnTransit mock2 = new MockArrivalNoteOnTransit(
    			"025100201510200000002","025100","2011-12-2","北京",BarcodeAndStates);
    	service.insert(mock);
    	service.insert(mock2);
    	//assertEquals(true,service.findAll().size()>=2);
    }
}
