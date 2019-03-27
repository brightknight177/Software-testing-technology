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
	//��ȡExcel.xlsx�����ļ��е����ݣ���ȥû�õı��⡢��ŵȣ�������ID��������GITURL
	public static String getExcelData(){
	    File file = new File("E:\\������\\������Լ���\\�����������.xlsx");
	    InputStream inputStream = null;
	    XSSFWorkbook workbook = null;
	    String str = "";
	    try {
	        inputStream = new FileInputStream(file);
	        workbook = new XSSFWorkbook(inputStream);
	        inputStream.close();
	        //���������
	        Sheet sheet = workbook.getSheetAt(0);
	        //������
	        int rowLength = sheet.getLastRowNum()+1;
	        //���������
	        Row row = sheet.getRow(2);
	        //������
	        int colLength = row.getLastCellNum();
	        //�õ�ָ���ĵ�Ԫ��
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
