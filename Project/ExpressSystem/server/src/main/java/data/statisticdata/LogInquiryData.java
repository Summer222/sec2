package data.statisticdata;
/**
 * @author wwz
 * @date 2015/11/14
 */
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.LogEntryPO;
import dataservice.statisticdataservice.LogInquiryDataService;

public class LogInquiryData implements LogInquiryDataService{

	@Override
	public ArrayList<LogEntryPO> findLogEntries(String time,
			ArrayList<String> keyword) throws RemoteException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> mjwyy/master
		return null;
	}

}
