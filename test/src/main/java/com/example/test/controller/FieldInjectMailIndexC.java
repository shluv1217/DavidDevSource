package com.example.test.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.dto.mail.MailIndexDTO;
import com.example.test.dto.mail.MailIndexResponseDTO;
import com.example.test.service.mail.MailIndexS;



@RestController
@RequestMapping("/mailfield/")
public class FieldInjectMailIndexC {
	
	
		@Autowired
		private MailIndexS mailIndexservice;
	
		Logger logger = LoggerFactory.getLogger(FieldInjectMailIndexC.class);

	
		//메일 인덱스 재색인
		@RequestMapping(method = RequestMethod.POST, value = "updateMailIndexByUserInfo")
		public MailIndexResponseDTO.Response updateMailIndexByUserInfoC
												//(@RequestHeader HttpHeaders requestHeader
											   (@RequestBody List<MailIndexDTO.UpdateIndexInfo> updateMailIndexInfoList
									          ,BindingResult BindingResult
										  ) throws Exception {
	    		
			
			
				MailIndexResponseDTO.Response mailIndexResponse = new MailIndexResponseDTO.Response();
				
				mailIndexservice.updateIndexByUserInfoB(updateMailIndexInfoList);
				
					    
			    mailIndexResponse.setReqeustCnt("");
			    mailIndexResponse.setErrorCnt("");
			    mailIndexResponse.setReturnCode("00");
			    mailIndexResponse.setReturnMessage("Success");         
			    
				return mailIndexResponse;
				
	    }

}
