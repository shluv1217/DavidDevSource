package com.example.test.service.mail;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dto.mail.MailIndexDTO;

@Service
public class MailIndexS {
	
	
	//인덱스 재색인 
    public HashMap<String,String> updateIndexByUserInfoB(List<MailIndexDTO.UpdatebyUserInfoDTO> updateIndexInfoList) throws Exception{

    	
    	HashMap<String,String> resultMap = new HashMap<String,String>();
    	
    	
    	
    	resultMap.put("returnCode", "00");
		resultMap.put("returnMessage", "Success");
    	
    	
    	return resultMap;
    }
    
    
    //Test
    public HashMap<String,String> helloService() throws Exception{

    	
    	HashMap<String,String> resultMap = new HashMap<String,String>();
    	
    	
    	
    	resultMap.put("returnCode", "00");
		resultMap.put("returnMessage", "Success");
    	
    	
    	return resultMap;
    }

}