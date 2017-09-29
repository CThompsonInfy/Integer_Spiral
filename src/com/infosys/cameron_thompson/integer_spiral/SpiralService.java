package com.infosys.cameron_thompson.integer_spiral;

public class SpiralService {
	
	public static final String ERR_MSG_NULL = "Target value cannot be null";
	public static final String ERR_MSG_EMPTY = "Target value is required";
	public static final String ERR_MSG_NOT_INTEGER = "Target value must be an integer";
	public static final String ERR_MSG_NEGATIVE = "Target value must be a positive integer";
	
	public String createSpiral(String input, boolean isRight) {
		String spiralVal;
		int targetVal = validateAndParseInput(input);
		
		double spiralSize = Math.ceil(Math.sqrt(targetVal + 1));
		int spiralSizeInt = (int)spiralSize;
		String[][] grid = new String[spiralSizeInt][spiralSizeInt];
		
		
		
		
		
		spiralVal = "123\r\n456\r\n789";
		return spiralVal;
	}
	
	private int validateAndParseInput(String input) {
		int inputVal;

		if (input == null) {
			throw new IllegalArgumentException(ERR_MSG_NULL);
		}
		
		String trimmedInput = input.trim();
		
		if (trimmedInput.length() == 0) {
			throw new IllegalArgumentException(ERR_MSG_EMPTY);
		}
		
		try {
			inputVal = Integer.parseInt(trimmedInput); 
		} catch(NumberFormatException ex) {
			throw new IllegalArgumentException(ERR_MSG_NOT_INTEGER, ex);
		} catch (Exception ex) {
			throw ex;
		}
		
		if (inputVal < 0) {
			throw new IllegalArgumentException(ERR_MSG_NEGATIVE);
		}
		
		return inputVal;
	}
}
