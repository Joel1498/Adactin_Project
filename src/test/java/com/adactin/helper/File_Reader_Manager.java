package com.adactin.helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
		
	}
	
	public static File_Reader_Manager get_Instance_FR() {
		
		File_Reader_Manager reader = new File_Reader_Manager();
		return reader;
	}

	public Configuration_reader get_Instance_CR() throws Throwable {
		
		Configuration_reader helper = new Configuration_reader();
		return helper;	
		
	}
	
	
}
