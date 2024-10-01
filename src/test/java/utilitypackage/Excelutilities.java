package utilitypackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities
{
	public static String getstringValue(String Excel,String sheet,int r,int c)
	{
		try
		{
			FileInputStream file=new FileInputStream(Excel);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			XSSFSheet sh=wb.getSheet(sheet);
			XSSFCell cell=sh.getRow(r).getCell(c);
			
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return " ";
		}
		
	}
	public static int getRowcount(String Excel,String sheet)
	{
		try
		{
			FileInputStream file=new FileInputStream(Excel);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			XSSFSheet sh=wb.getSheet(sheet);
			return sh.getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
		
	}

}
