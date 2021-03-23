package gc.roo;
/*
 * 原生主动议的类定义
 */
public class OriginalMainMotion implements Motion {
	// 主动议中的前言描述
	String[] preamble = {"Whereas, 与公司一的合作谈定", "Whereas，与防城港合作敲定"};;	
	// 主动议中陈述的决定
	String[] resolutions = {"Resolved, that 与公司一签订合同", "Resolved, that 与防城港签订合同"};
	// 主动议中陈述的命，用于有下属和雇员时
	String[] orders = {"Ordered, 扣留停放的车辆","Ordered, "};
	
	
	public String getPreamble(int i) { return preamble[i]; }
	public String getResolution(int i) { return resolutions[i]; }
	public String getOrder(int i) { return orders[i]; }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}