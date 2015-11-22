package po.chart;

import po.ChartPO;
import util.enums.ChartType;
<<<<<<< HEAD
=======

import java.util.ArrayList;
>>>>>>> mjwyy/master

public class CostAndProfitChartPO extends ChartPO {

	private static final long serialVersionUID = 7891756031310926806L;
<<<<<<< HEAD
	private ChartType PROFIT_CHART;
	private String starttime;
	private String endtime;
	private double cost;
	private double profit;
	
	public CostAndProfitChartPO(String starttime, String endtime, double cost,
			double profit) {
		super();
		this.starttime = starttime;
		this.endtime = endtime;
		this.cost = cost;
		this.profit = profit;
		//this.type = PROFIT_CHART;
	}

	

	public ChartType getType() {
		return PROFIT_CHART;
	}

	public String getStarttime() {
		return starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public double getCost() {
		return cost;
	}

	public double getProfit() {
		return profit;
	}


	
	
=======
    private ArrayList<Double> cost;
    private ArrayList<Double> profit;

    public CostAndProfitChartPO(String starttime, String endtime, ArrayList<Double> cost,
                                ArrayList<Double> profit) {
        super(ChartType.PROFIT_CHART,starttime,endtime);
        this.cost = cost;
        this.profit = profit;
    }

    public ArrayList<Double> getCost() {
        return cost;
    }

    public ArrayList<Double> getProfit() {
        return profit;
    }
>>>>>>> mjwyy/master

    public CostAndProfitChartPO(String starttime, String endtime){
        super(ChartType.PROFIT_CHART,starttime,endtime);
    }
	
}
