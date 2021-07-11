package com.example.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootApplication
@RestController
public class TestApplication {
	
	Logger logger = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
//	@PostMapping("/test")
//	public void post(@RequestBody Param param) {
//	    String msg = "Data1 : " + param.getData1() + ", Data2 : " + param.getData2();
//	    
//	    //logger.info("Success!", msg);
//	    System.out.println("Success! : "+msg);
//	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/fileTest")
	public void fileTest(@RequestParam("file") MultipartFile mfile){	
		
		byte[] bytes;
		
		try {
			bytes = mfile.getBytes();
			String inputString = new String(bytes);
			
			ObjectMapper mapper = new ObjectMapper(); 
	    	//String json = inputString; 
	    	try { // convert JSON string to Map 
	    		//Map<String, List> map = mapper.readValue(json, Map.class); 
	    		List<Person> list = Arrays.asList(mapper.readValue(inputString, Person[].class));
	    		System.out.println(list.get(0));
	    	}catch (IOException e) { e.printStackTrace(); }
	    	
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		 File convFile = new File( mfile.getOriginalFilename());
		 
		 
//		 try {
//			mfile.transferTo(convFile);
//		} catch (IllegalStateException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//			
		//}
		 
		  // File convFile = new File(file.getOriginalFilename());
//		    try {
//				convFile.createNewFile();
//				  FileOutputStream fos = new FileOutputStream(convFile); 
//				    fos.write(mfile.getBytes());
//				    fos.close(); 
//			} catch (IOException e2) {
//				// TODO Auto-generated catch block
//				e2.printStackTrace();
//			} 
		  
		 
		 
		 //System.out.println("convFile.getName() : " + convFile.getName());
		 //System.out.println("convFile.getName() : " + convFile.);
		 
		 
		 
//		 try( FileReader fileStream = new FileReader( convFile ); 
//				    BufferedReader bufferedReader = new BufferedReader( fileStream ) ) {
//
//				    String line = "";
//
//				    while( (line = bufferedReader.readLine()) != null ) {
//				    	System.out.println("line : " + line);
//				    	
//				    	ObjectMapper mapper = new ObjectMapper(); 
//				    	String json = line; 
//				    	try { // convert JSON string to Map 
//				    		//Map<String, List> map = mapper.readValue(json, Map.class); 
//				    		List<Person> list = Arrays.asList(mapper.readValue(json, Person[].class));
//				    		System.out.println(list.get(0));
//				    	}catch (IOException e) { e.printStackTrace(); }
//
//				    }
//
//				    } catch ( FileNotFoundException ex ) {
//				        //exception Handling
//				    } catch ( IOException ex ) {
//				        //exception Handling
//				}
//		 
//		 
//		 Scanner sc;
//		try {
//			sc = new Scanner(convFile);
//			 while(sc.hasNextLine()){
//			     String str = sc.nextLine();  
//			     System.out.println("convFile.getName() : " + str);
//			 }
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		 
		 

		
		
//		if (!mfile.isEmpty()) {
//		    byte[] bytes;
//			try {
//				bytes = mfile.getBytes();
//				//bytes = mfile.getInputStream();
//			    String completeData = new String(bytes);
//			    
//			    String tempString = completeData.substring(completeData.indexOf("begin")+7, completeData.indexOf("end"));
//
//			    //byte[] b = "{ \"name\" : \"John\", \"age\" : 18 }".getBytes();
//			    System.out.println("tempString : " + tempString);
//			    //byte[] b = tempString.getBytes();
//				//byte[] b = mfile.getBytes();
////			    InputStream is = new ByteArrayInputStream(b);
////			    BufferedReader bufferedReader;
////				bufferedReader = new BufferedReader(new InputStreamReader(is));
////				JSONTokener tokener = new JSONTokener(bufferedReader);
////				JSONObject json = new JSONObject(tokener);
//				//System.out.println("json : " + tempString);
//			    
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
//		try {
//			System.out.println("getContentType : " + mfile.getBytes());
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

		
	    //byte[] b = "{ \"name\" : \"John\", \"age\" : 18 }".getBytes();
	   





		  
		  
		  
//		  try {
//			mfile.transferTo(file);
//			InputStream targetStream = new FileInputStream(file);
//			  
//			  Scanner scanner = new Scanner(targetStream).useDelimiter(",");
//			  
//			  while(scanner.hasNext()){
//				  logger.info(scanner.next());
//			  }
//			  
//			} catch (IllegalStateException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}	  
	  }

}
