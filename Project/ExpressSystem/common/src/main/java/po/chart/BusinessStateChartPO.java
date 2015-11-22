package po.chart;
/**
 * @author wwz
 * @time 2015/11/15
 */
import po.ChartPO;
import util.enums.ChartType;
<<<<<<< HEAD
=======

import java.util.ArrayList;
>>>>>>> mjwyy/master

public class BusinessStateChartPO extends ChartPO {

	private static final long serialVersionUID = -1229391901851695868L;
<<<<<<< HEAD
	private  ChartType BUSINESS_STAT_CHART;
	private String starttime;
	private String endtime;
	private double profix;
	private double growthRate;
	
	public BusinessStateChartPO(String starttime, String endtime, double profix,
			double growthRate) {
		super();
		this.starttime = starttime;
		this.endtime = endtime;
		this.profix = profix;
		this.growthRate = growthRate;
		
	}
	
	public String getStarttime() {
		return starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public double getProfix() {
		return profix;
	}

	public double getGrowthRate() {
		return growthRate;
	}
	public  ChartType getType() {
		return BUSINESS_STAT_CHART;
	}
	
	
=======
    private ArrayList<Double> profix;
    private ArrayList<Double> growthRate;

    public BusinessStateChartPO(String starttime, String endtime, ArrayList<Double> profix,
                                ArrayList<Double> growthRate) {
        super(ChartType.BUSINESS_STAT_CHART,starttime,endtime);
        this.profix = profix;
        this.growthRate = growthRate;
    }

    public BusinessStateChartPO(String starttime, String endtime){
        super(ChartType.BUSINESS_STAT_CHART,starttime,endtime);
    }

    public ArrayList<Double> getProfix() {
        return profix;
    }

    public ArrayList<Double> getGrowthRate() {
        return growthRate;
    }
>>>>>>> mjwyy/master

}
