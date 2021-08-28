package com.example.test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.test.dto.mail.MailIndexDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class TestApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	 
	@Autowired
	ObjectMapper objectMapper;	

	@Test
	public void updateMailIndexByUserInfo() throws Exception {
	 List<Integer> folderlist = new ArrayList<Integer>();
	 folderlist.add(1);	
		
	 List<MailIndexDTO.UpdatebyUserInfoDTO> updateMailIndexInfoList = new ArrayList<MailIndexDTO.UpdatebyUserInfoDTO>();
	 MailIndexDTO.UpdatebyUserInfoDTO updateMailIndexInfo = new MailIndexDTO.UpdatebyUserInfoDTO("stress.2217", "", "", "false", "", "", folderlist);
	 updateMailIndexInfoList.add(updateMailIndexInfo);
	
	 mockMvc.perform(MockMvcRequestBuilders.post("/mail/updateMailIndexByUserInfo")
			 .contentType(MediaType.APPLICATION_JSON_VALUE)
			 .content(objectMapper.writeValueAsString(updateMailIndexInfoList))
			 ).andExpect(MockMvcResultMatchers.status().isOk())
	 		  .andExpect(jsonPath("$.returnCode").value("00"));
	}
	
	
	
}
