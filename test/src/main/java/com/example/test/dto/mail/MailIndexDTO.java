package com.example.test.dto.mail;

import java.util.List;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



public class MailIndexDTO {	
	
	@AllArgsConstructor
	@NoArgsConstructor
	@Getter
	@Setter
	@ToString
	@Builder
	public static class UpdateIndexInfo {
		@NotBlank
	    private String id;
	    private String recursive;
	    private String priority;
	    private String gt;
	    private String gte;
	    private String lt;
	    private String lte;
	    private String clean;
	    private List<Integer> folderlist;
	}	
}
	

