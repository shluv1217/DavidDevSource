package com.example.test.controller;

import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.test.dto.mail.MailIndexDTO;
import com.example.test.dto.mail.MailIndexResponseDTO;
import com.example.test.service.mail.MailIndexS;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/mail/")
@RequiredArgsConstructor
public class ConstructInjectMailIndexC {
	
	
		private final MailIndexS UserMailIndexS;
	
	
		Logger logger = LoggerFactory.getLogger(ConstructInjectMailIndexC.class);

	
		//메일인덱스재색인
		@RequestMapping(method = RequestMethod.POST, value = "updateMailIndexByUserInfo")
		@ApiOperation(value = "Method - updateMailIndexByUserInfo", notes = "Notes - updateMailIndexByUserInfo")
		public MailIndexResponseDTO.Response updateMailIndexByUserInfoC(
																	//@RequestHeader HttpHeaders 
																	//HttpServletRequest request
																	 @RequestHeader Map<String, Object> requestHeader
																	,@RequestBody List<MailIndexDTO.UpdatebyUserInfoDTO> updateMailIndexInfoList
															        ,BindingResult BindingResult
				  												  ){
	    	
			logger.info("request={}", requestHeader);
			
			MailIndexResponseDTO.Response mailIndexResponse = new MailIndexResponseDTO.Response();
			
			//메일인덱스재색인 서비스호출 및 결과값리턴
			HashMap<String,String> responseMap = new HashMap<String,String>();
			
			try {
				logger.info("Start MailIndex Process [updateMailIndexByUserInfo] ========================");
				responseMap = UserMailIndexS.updateIndexByUserInfoB(updateMailIndexInfoList);
				logger.info("End MailIndex Process [updateMailIndexByUserInfo] ========================");
			}catch (Exception e) { 
				mailIndexResponse.setRequestCnt("");
			    mailIndexResponse.setErrorCnt("");
			    mailIndexResponse.setReturnCode("99");
			    mailIndexResponse.setReturnMessage(e.getMessage());
			    logger.error(e.getMessage());
			    return mailIndexResponse;
	        }
				
			
			
			mailIndexResponse.setRequestCnt(responseMap.get("reqeustCnt"));
		    mailIndexResponse.setErrorCnt(responseMap.get("errorCnt"));
		    mailIndexResponse.setReturnCode(responseMap.get("returnCode"));
		    mailIndexResponse.setReturnMessage(responseMap.get("returnMessage"));         
			    
		    
		    return mailIndexResponse;
				
	    }
		
		
		
		
		@RequestMapping(method = RequestMethod.GET, value = "/helloget")
		public void helloget(){	
			HashMap<String,String> responseMap = new HashMap<String,String>();
			
			try {
				logger.info("Start MailIndex Process [updateMailIndexByUserInfo] ========================");
				responseMap = UserMailIndexS.helloService();
				logger.info("End MailIndex Process [updateMailIndexByUserInfo] ========================");
			}catch (Exception e) { 
			    logger.error(e.getMessage());
	        }
		}
		
		
		@RequestMapping(method = RequestMethod.POST, value = "/hellopost")
		public void hellopost(@RequestHeader Map<String, Object> requestHeader, @RequestBody List<MailIndexDTO.UpdatebyUserInfoDTO> updateMailIndexInfoList){	
			HashMap<String,String> responseMap = new HashMap<String,String>();
			
			try {
				logger.info("Start MailIndex Process [updateMailIndexByUserInfo] ========================");
				responseMap = UserMailIndexS.helloService();
				logger.info("End MailIndex Process [updateMailIndexByUserInfo] ========================");
			}catch (Exception e) { 
			    logger.error(e.getMessage());
	        }
			

		}

}








