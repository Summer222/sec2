package po;

<<<<<<< HEAD
=======
import util.enums.Authority;
import vo.UserVO;

>>>>>>> mjwyy/master
import java.io.Serializable;

/**
 * 用于登录验证的系统用户PO
 * @author River
 *
 */
public class UserPO implements Serializable {

	private static final long serialVersionUID = 3758641678884304726L;

<<<<<<< HEAD
	public static final int SYSTEM_MANAGER = 0;
	public static final int MANAGER = 1;
	public static final int ACCOUNTANT_HIGH = 2;
	public static final int ACCOUNTANT_LOW = 3;
	public static final int WAREHOUSE_MANAGER = 4;
	public static final int CLERK = 5;
	public static final int DELIVERY_MAN = 6;
	public UserPO(){
		
	}
	public UserPO(String account, String password, int authority) {
		super();
		this.account = account;
		this.password = password;
		this.authority = authority;
	}

	/**
	 * 用户账号
	 */
	String account = null;
	
	/**
	 * 用户密码
	 */
	String password = null;
	
	/**
	 * 用户请求权限
	 */
	int authority = -1;

	public String getAccount() {
		return account;
	}

	public String getPassword() {
		return password;
	}

	public int getAuthority() {
		return authority;
	}
	
	
=======
    /**
     * 账号
     */
    private String Account;

    /**
     * 密码
     */
    private String Password;

    /**
     * 权限
     */
    private Authority Authority;

    /**
     * 构造方法
     * @param Account
     * @param Password
     * @param authority
     */
    public UserPO(String Account, String Password, int authority){
        this.Account = Account;
        this.Password = Password;
        this.Authority = Authority.getAuthObject(authority);
    }

    public UserPO(){

    }

    @Override
    public String toString(){
        return "UserPO: 账户:"+ Account +" 密码:"+ Password +" 权限="+ Authority;
    }

    public String getAccount() {
        return Account;
    }

    public String getPassword() {
        return Password;
    }

    public int getAuthority() {
        return Authority.getAuthority();
    }

	public Object toVO() {
		UserVO vo = new UserVO(Account, Password, Authority);
		return vo;
	}

>>>>>>> mjwyy/master
}
