package vo;

/**
 * 中转中心到达单需要的单件货物信息
 * 
 * @author kylin
 *
 */
public class GoodsInfoVO {

	/**
	 * 货物快递编号
	 */
	private String barcode;

	/**
	 * 货物到达状态
	 */
	private String state;

	/**
	 * 货物出发地
	 */
	private String departurePlace;

	public GoodsInfoVO(String barcode, String state, String departurePlace) {
		super();
		this.barcode = barcode;
		this.state = state;
		this.departurePlace = departurePlace;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getState() {
		return state;
	}

	public String getDeparturePlace() {
		return departurePlace;
	}
}
