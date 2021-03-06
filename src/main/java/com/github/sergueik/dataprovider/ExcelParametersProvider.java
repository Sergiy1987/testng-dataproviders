package com.github.sergueik.dataprovider;
/**
 * Copyright 2017 Serguei Kouzmine
 */

import java.lang.reflect.Method;
import java.util.List;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

/**
 * @ExcelParametersProvider container class for testng dataProvider method
 * @author: Serguei Kouzmine (kouzmine_serguei@yahoo.com)
 */

public class ExcelParametersProvider {

	private Utils utils = Utils.getInstance();
	private static boolean debug = false;
	private static String filePath = null;
	private static String sheetName = null;
	private static String columnNames = "*";

	@DataProvider(parallel = false, name = "OpenOffice Spreadsheet")
	public Object[][] createData_from_OpenOfficeSpreadsheet(
			final ITestContext context, final Method method) {
		DataFileParameters parameters = method
				.getAnnotation(DataFileParameters.class);
		if (parameters != null) {
			filePath = String.format("%s/%s",
					(parameters.path().isEmpty() || parameters.path().matches("^\\.$"))
							? System.getProperty("user.dir")
							: Utils.resolveEnvVars(parameters.path()),
					parameters.name());
			sheetName = parameters.sheetName();
		} else {
			throw new RuntimeException(
					"Missing / invalid DataFileParameters annotation");
		}
		utils.setSheetName(sheetName);
		utils.setColumnNames(columnNames);
		utils.setDebug(debug);
		List<Object[]> result = utils.createDataFromOpenOfficeSpreadsheet(filePath);
		Object[][] resultArray = new Object[result.size()][];
		result.toArray(resultArray);
		return resultArray;
	}

	@DataProvider(parallel = false, name = "Excel 2007")
	public Object[][] createDataFromExcel2007(final ITestContext context,
			final Method method) {
		DataFileParameters parameters = method
				.getAnnotation(DataFileParameters.class);
		if (parameters != null) {
			filePath = String.format("%s/%s",
					(parameters.path().isEmpty() || parameters.path().matches("^\\.$"))
							? System.getProperty("user.dir")
							: Utils.resolveEnvVars(parameters.path()),
					parameters.name());
			sheetName = parameters.sheetName();
		} else {
			throw new RuntimeException(
					"Missing / invalid DataFileParameters annotation");
		}

		// String suiteName = context.getCurrentXmlTest().getSuite().getName();
		System.err.println("Data Provider Caller Suite: "
				+ context.getCurrentXmlTest().getSuite().getName());
		System.err.println(
				"Data Provider Caller Test: " + context.getCurrentXmlTest().getName());
		System.out.println("Data Provider Caller Method: " + method.getName());
		// String testParam =
		// context.getCurrentXmlTest().getParameter("test_param");

		/*
		@SuppressWarnings("deprecation")
		Map<String, String> parameters = (((TestRunner) context).getTest())
				.getParameters();
		for (String key : parameters.keySet()) {
			System.out.println("Data Provider Caller Parameter: " + key + " = "
					+ parameters.get(key));
		}
		*/

		utils.setSheetName(sheetName);
		utils.setColumnNames(columnNames);
		utils.setDebug(debug);
		List<Object[]> result = utils.createDataFromExcel2007(filePath);
		Object[][] resultArray = new Object[result.size()][];
		result.toArray(resultArray);
		return resultArray;

	}

	@DataProvider(parallel = false, name = "Excel 2003")
	public Object[][] createDataFromExcel2003(final ITestContext context,
			final Method method) {

		DataFileParameters parameters = method
				.getAnnotation(DataFileParameters.class);
		if (parameters != null) {
			filePath = String.format("%s/%s",
					(parameters.path().isEmpty() || parameters.path().matches("^\\.$"))
							? System.getProperty("user.dir")
							: Utils.resolveEnvVars(parameters.path()),
					parameters.name());
			sheetName = parameters.sheetName();
		} else {
			throw new RuntimeException(
					"Missing / invalid DataFileParameters annotation");
		}
		if (debug) {
			System.err.println("Reading file: " + filePath);
		}

		utils.setSheetName(sheetName);
		utils.setColumnNames(columnNames);
		utils.setDebug(debug);
		List<Object[]> result = utils.createDataFromExcel2003(filePath);
		Object[][] resultArray = new Object[result.size()][];
		result.toArray(resultArray);
		return resultArray;
	}
}
