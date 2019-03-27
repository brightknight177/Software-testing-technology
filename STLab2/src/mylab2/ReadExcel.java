package mylab2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	//获取Excel.xlsx类型文件中的数据，除去没用的标题、标号等，仅保留ID、姓名和GITURL
	public static String getExcelData(){
	    File file = new File("E:\\大三下\\软件测试技术\\软件测试名单.xlsx");
	    InputStream inputStream = null;
	    XSSFWorkbook workbook = null;
	    String str = "";
	    try {
	        inputStream = new FileInputStream(file);
	        workbook = new XSSFWorkbook(inputStream);
	        inputStream.close();
	        //工作表对象
	        Sheet sheet = workbook.getSheetAt(0);
	        //总行数
	        int rowLength = sheet.getLastRowNum()+1;
	        //工作表的列
	        Row row = sheet.getRow(2);
	        //总列数
	        int colLength = row.getLastCellNum();
	        //得到指定的单元格
	        Cell cell = row.getCell(1);
	        for (int i = 2; i < rowLength; i++) {
	            row = sheet.getRow(i);
	            for (int j = 1; j < colLength; j++) {
	                cell = row.getCell(j);
	                if (cell != null)
	                    cell.setCellType(CellType.STRING);
	                str = str + cell.getStringCellValue() + "\t";
	            }
	            str = str + "\n";
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return str;     
	}
}
