package com.xml.parser;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		XMLParser parser = new XMLParser();
		
        parser.parseFile("/usr/local/bin/com.amoedo.calculadora_2/AndroidManifest.xml", 4);
        
	}
}
