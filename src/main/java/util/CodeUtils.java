package main.java.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CodeUtils {
	
	private static final String fileName = "./src/resources/counter.txt";
	
	public static Integer getSupermarketCode() {
		
		Path directory = Paths.get(fileName);
		Integer supermarketCode = 0;
		
		try {
			List<String> codes = Files.readAllLines(directory);
			
			supermarketCode = Integer.valueOf(codes.get(0))+1;
			codes.set(0, supermarketCode.toString());
			
			Files.write(directory, codes, StandardCharsets.UTF_8);
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return supermarketCode;
		
	}
	
	public static Integer getProductCode() {
		
		Path directory = Paths.get(fileName);
		Integer productCode = 0;
		
		try {
			List<String> codes = Files.readAllLines(directory);
			
			productCode = Integer.valueOf(codes.get(1))+1;
			codes.set(1, productCode.toString());
			
			Files.write(directory, codes, StandardCharsets.UTF_8);
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return productCode;
		
	}
	
	public static Integer getOrderCode() {
		
		Path directory = Paths.get(fileName);
		Integer orderCode = 0;
		
		try {
			List<String> codes = Files.readAllLines(directory);
			
			orderCode = Integer.valueOf(codes.get(2))+1;
			codes.set(2, orderCode.toString());
			
			Files.write(directory, codes, StandardCharsets.UTF_8);
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return orderCode;
		
	}
	
	public static Integer getOrderLineCode() {
		
		Path directory = Paths.get(fileName);
		Integer orderLineCode = 0;
		
		try {
			List<String> codes = Files.readAllLines(directory);
			
			orderLineCode = Integer.valueOf(codes.get(3))+1;
			codes.set(3, orderLineCode.toString());
			
			Files.write(directory, codes, StandardCharsets.UTF_8);
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return orderLineCode;
		
	}

}
