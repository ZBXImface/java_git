package com.gree.common.utilis;

import com.alibaba.fastjson.JSONObject;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Component
public class PoiUtil {
    /*将JSON数据存入指定文件*/
    public boolean saveDataToExcel(JSONObject object){
        return true;
    }
    /*将指定文件转为JSON格式*/
    public List<JSONObject> getDataFromExcel(){
        /*通过java输入流获得文件流对象*/
        try{
            InputStream inputStream = new FileInputStream("F:/data/test.xlsx");
            /*通过poi工具获得excel文档对象*/
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            /*通过文档对象获得文件的表对象*/
            XSSFSheet sheetAt = workbook.getSheetAt(0);
            /*循环获取表格数据*/
            for (Row row : sheetAt) {
                /*首行（即表头）不读取*/
                if (row.getRowNum() == 0) {
                    continue;
                }
                /*读取当前行中单元格数据，索引从0开始*/
                String areaNum = row.getCell(0).getStringCellValue();
                double province = row.getCell(1).getNumericCellValue();
                String city = row.getCell(2).getStringCellValue();
                String district = row.getCell(3).getStringCellValue();
                String postcode = row.getCell(4).getStringCellValue();
                System.out.println(areaNum+"\t"+province+"\t"+city+"\t"+district+"\t"+postcode);
            }
            /*关闭文件流*/
            workbook.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
