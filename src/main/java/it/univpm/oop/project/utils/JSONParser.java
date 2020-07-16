package it.univpm.oop.project.utils;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.json.*;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.univpm.oop.project.model.*;


public class JSONParser {

/*
	public JSONParser() {
	ObjectMapper objectMapper = new ObjectMapper() ; 

    try {
        Feed feed = objectMapper.readValue(new File("JSONFile.json"), Feed.class);
        //bisogna creare il file json

        printParsedObject(feed);
    } catch (IOException e) {
       e.printStackTrace();
    }
	}
	*/
    public static void printParsedObject(Feed feed) {
        printData(feed.getData());
    }

    
    private static void printData(List<Post> data) {
        System.out.println("Page Posts:");
        for(Post post : data) {
        	System.out.println("**********");
            printPost(post);
        }
    }

    private static void printPost(Post post) {
        System.out.println("\n\tPost Id                   : " + post.getId());
        printComment(post.getComments().getData());
        
    }
    
    private static void printComment(List<Comment> data) {
    	System.out.println("\nComments:");
    	System.out.println("**********");
    	for(Comment comment: data) {
    		 System.out.println("\tComment Id                : " + comment.getId());
    		 System.out.println("\tMessage                   : " + comment.getMessage());
    		 System.out.println("\tAttachment                   : " + comment.getAttachment().toString());
    		 System.out.println("\n");
    	}
    
   
}
	
	
	/*public static void JSONParsing(String resp) {
	JsonParser springParser = JsonParserFactory.getJsonParser();
	Map<String, Object> map = springParser.parseMap(resp);

	String mapArray[] = new String[map.size()];
	System.out.println("Items found: " + mapArray.length);

	int i = 0;
	for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
			i++;
}}
	
	public static void JSONParsing(String resp) throws JsonMappingException, JsonProcessingException {
	ObjectMapper objectMapper = new ObjectMapper();
	//convert json file to map
	Map<?, ?> map = objectMapper.readValue(resp, Map.class);
	//iterate over map entries and print to console
	for (Map.Entry<?, ?> entry : map.entrySet()) {
	    System.out.println(entry.getKey() + "=" + entry.getValue());
	}*/
	
}


