/**
 * 输入中转单
 * @author wqy
 * @date 2015/10/17
 */
package po;

import util.BarcodesAndLocation;
import vo.NoteVO;
import vo.TransitNoteOnTransitVO;

import java.io.Serializable;
import java.util.ArrayList;

public class TransitNotePO extends NotePO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4056108594719181855L;

	/**
	 * 装车日期
	 */
	private String date;

    //TODO 或者火车车次号
	/**
	 * 中转单编号	
	 */
	private String transitDocNumber;

	/**
	 * 航班号	
	 */
	private String flightNumber;

	/**
	 * 出发地
	 */
	private String departurePlace;

	/**
	 * 到达地
	 */
	private String desitination;

	/**
	 * 监装员
	 */
	private String supercargoMan;

	/**
     * 装箱所有托运单号,货柜号
     */
    private ArrayList<BarcodesAndLocation> barcodes;

    /**
	 * 运费
	 */
	private double price;

    public TransitNotePO(String date, String transitDocNumber, String flightNumber, String departurePlace,
                         String desitination, String supercargoMan, ArrayList<BarcodesAndLocation> barcodes) {
        this.date = date;
        this.transitDocNumber = transitDocNumber;
        this.flightNumber = flightNumber;
        this.departurePlace = departurePlace;
        this.desitination = desitination;
        this.supercargoMan = supercargoMan;
        this.barcodes = barcodes;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDate() {
        return date;
    }

    public String getTransitDocNumber() {
        return transitDocNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public String getDesitination() {
        return desitination;
    }

    public String getSupercargoMan() {
        return supercargoMan;
    }

    public ArrayList<BarcodesAndLocation> getBarcodes() {
        return barcodes;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTransitDocNumber(String transitDocNumber) {
        this.transitDocNumber = transitDocNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public void setDesitination(String desitination) {
        this.desitination = desitination;
    }

    public void setSupercargoMan(String supercargoMan) {
        this.supercargoMan = supercargoMan;
    }

    public void setBarcodes(ArrayList<BarcodesAndLocation> barcodes) {
        this.barcodes = barcodes;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public NoteVO toPO() {
        return new TransitNoteOnTransitVO(this.date, this.transitDocNumber, this.flightNumber,
                this.departurePlace, this.desitination, this.supercargoMan, this.barcodes);
    }
}