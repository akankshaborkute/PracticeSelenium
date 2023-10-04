package webdriver;
	import java.io.FileInputStream;
	import jxl.Sheet;
	import jxl.Workbook;

	public class TC_08_Exel {
	public static void main(String args[]) throws Exception{
	FileInputStream file = new FileInputStream("E:\\HRMS Project\\Object_Element.xls");
	Workbook  wb = Workbook.getWorkbook(file);
	Sheet     st = wb.getSheet(0);
	int rowcount = st.getRows();
	System.out.println(rowcount);
	for(int i=1; i<rowcount;i++) {
	String w = st.getCell(0,i).getContents();
	String x = st.getCell(1,i).getContents();
	String y = st.getCell(2,i).getContents();
	String z = st.getCell(3,i).getContents();
	System.out.println(w +"||"+ x +"||"+ y +"||"+ z );
	}
	}
}
