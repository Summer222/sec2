package po;

import java.io.Serializable;

import util.enums.StaffType;
import vo.DriverVO;

/**
 * 表示司机信息的PO
 * @author River
 */
public class DriverPO extends StaffPO implements Serializable {

	private static final long serialVersionUID = 5894748451667870139L;
	
	/**
	 * 驾照过期时间
	 */
	String licenseDate = null;

    public DriverPO(String staffID, String name, String organization, String gender,
                    String IDCardNumber, double salary, String phoneNumber,
                    StaffType position, double workHour, String licenseDate) {
        super(staffID, name, organization, gender, IDCardNumber, salary, phoneNumber, position, workHour);
        this.licenseDate = licenseDate;
    }

    public DriverPO(StaffPO temp, String licenseDate) {
        super(temp.staffID, temp.name, temp.organization,
                temp.gender, temp.IDCardNumber, temp.salary, temp.phoneNumber,
                temp.position, temp.workHour);
        this.licenseDate = licenseDate;
    }

    public DriverVO toVO() {
        return new DriverVO(name, gender, organization, position
                , staffID, Integer.parseInt(Double.toString(workHour)), phoneNumber, Double.toString(salary), licenseDate);
    }

    public String getLicenseDate() {
        return licenseDate;
    }
}
