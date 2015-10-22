/**
 * 库存数据接口
 * @author wqy
 * @date 2015/10/17
 */
package dataservice.commoditydataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.InventoryPO;

public interface InventoryDataService {
	/**
	 * 前置条件：同样ID的po在Mapper中不存在
	 * 后置条件：在数据库中增加一个po记录
	 * @param po 库存po
	 */
	public void insert(InventoryPO po) throws RemoteException;
	/**
	 * 前置条件：同样ID的po在Mapper中存在
	 * 后置条件：在数据库中删除一个po记录
	 * @param po 库存po
	 */
	public void delete(InventoryPO po) throws RemoteException;
	/**
	 * 前置条件：同样ID的po在Mapper中存在
	 * 后置条件：在数据库中更新一个po记录
	 * @param po 库存po
	 */
	public void update(InventoryPO po) throws RemoteException;
	/**
	 * 前置条件：无
	 * 后置条件：按名字进行查找返回相应的InventoryPO结果
	 * @param name 库存名字
	 * @return InventoryPO 库存PO
	 */
	public InventoryPO findByName(String name) throws RemoteException;
	/**
	 * 前置条件：无
	 * 后置条件：按ID进行查找返回相应的PO结果
	 * @param ID 库存ID
	 * @return InventoryPO 库存PO
	 */
	public InventoryPO findById(String id) throws RemoteException;
	
	/**
	 * 前置条件：无
	 * 后置条件：返回所有的库存PO
	 * @return StorageInPO 库存PO
	 */
	public ArrayList<InventoryPO> show() throws RemoteException;

}
