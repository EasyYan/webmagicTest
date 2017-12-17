package com.easy.util;

import com.easy.helper.RecodeHelper;
import com.easy.model.Recode;
import org.apache.poi.hssf.usermodel.*;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExportExcel {

    private HSSFWorkbook workbook = null;
    private HSSFSheet sheet = null;
    private HSSFCellStyle style = null;
    private HSSFRow row = null;
    private int rowNumber = 0;

    private List<String> headerList = Arrays.asList("Producer", "P_Component", "Consumer", "C_Consumer", "Service Type", "Service Name", "Method Name", "Destination", "Update By", "Related Function Description", "Remark", "Schema", "Operation");
    private String excelTitle = "Domain Integration";

    private void initEmptyWorkBookWithHeader() {
        workbook = new HSSFWorkbook();
        sheet = workbook.createSheet(excelTitle);
        sheet.setDefaultColumnWidth((short) 15);
        style = workbook.createCellStyle();

        // header
        row = sheet.createRow(rowNumber++);
        int columnIndex = 0;
        for (String header : headerList) {
            HSSFCell cell = row.createCell((short) columnIndex++);
            cell.setCellValue(header);
            cell.setCellStyle(style);
        }
    }

    private void initFileData() {
        List<Recode> list = new ArrayList<Recode>();

        String recode = "";
        list.add(RecodeHelper.string2Object(recode));

        //向单元格里填充数据
        int columnIndex = 0;
        for (short i = 0; i < list.size(); i++) {
            row = sheet.createRow(rowNumber++);
            row.createCell(columnIndex++).setCellValue(list.get(i).getProvider());
            row.createCell(columnIndex++).setCellValue(list.get(i).getpComponent());
            row.createCell(columnIndex++).setCellValue(list.get(i).getConsumer());
            row.createCell(columnIndex++).setCellValue(list.get(i).getcConsumer());
            row.createCell(columnIndex++).setCellValue(list.get(i).getServiceType());
            row.createCell(columnIndex++).setCellValue(list.get(i).getServiceName());
            row.createCell(columnIndex++).setCellValue(list.get(i).getMethodName());
            row.createCell(columnIndex++).setCellValue(list.get(i).getDestination());
            row.createCell(columnIndex++).setCellValue(list.get(i).getUpdateBy());
            row.createCell(columnIndex++).setCellValue(list.get(i).getRelatedFunctionDescription());
            row.createCell(columnIndex++).setCellValue(list.get(i).getRemark());
            row.createCell(columnIndex++).setCellValue(list.get(i).getSchema());
            row.createCell(columnIndex++).setCellValue(list.get(i).getOperation());
            columnIndex = 0;
        }
    }

    public void export() {

        initEmptyWorkBookWithHeader();

        initFileData();

        try {
            //默认导出到E盘下
            FileOutputStream out = new FileOutputStream("E:/" + excelTitle + ".xls");
            workbook.write(out);
            out.close();
            JOptionPane.showMessageDialog(null, "Export successful!");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Export failed!");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Export failed!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.export();
    }
}
