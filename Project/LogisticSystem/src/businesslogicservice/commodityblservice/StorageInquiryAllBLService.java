/**
 * 库存盘点
 * @author wwz
 * @data  2015/10/17
 */
package businesslogicservice.commodityblservice;

import java.util.ArrayList;

import businesslogic.util.ResultMsg;
import vo.InventoryVO;

public interface StorageInquiryAllBLService {
	
	/**
	 * 设置第一个时间点
	 * @param firstTime
	 * @return
	 */
	public ResultMsg inputFirst(String firstTime);
	
	/**
	 * 请求进行库存盘点
	 * @return
	 */
	public ArrayList<InventoryVO> request();
	

}
