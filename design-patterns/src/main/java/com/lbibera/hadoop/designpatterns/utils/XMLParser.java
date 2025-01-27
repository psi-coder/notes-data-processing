package com.lbibera.hadoop.designpatterns.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.io.Text;

public class XMLParser {
	
	public static Map<String, String> toMap(Text text) {
		return toMap(text.toString());
	}

	public static Map<String, String> toMap(String xml) {
		Map<String, String> map = new HashMap<>();
		
		try {
			String[] tokens = xml.trim().substring(5, xml.trim().length() - 3).split("\"");
			
			for (int i = 0; i < tokens.length - 1; i += 2) {
				String key = tokens[i].trim();
				String val = tokens[i + 1];

				map.put(key.substring(0, key.length() - 1), val);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return map;
	}
}
