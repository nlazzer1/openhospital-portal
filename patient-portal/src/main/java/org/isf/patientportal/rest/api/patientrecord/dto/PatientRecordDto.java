package org.isf.patientportal.rest.api.patientrecord.dto;

import java.time.LocalDateTime;

import org.isf.patientportal.rest.api.patient.dto.PatientDto;
import org.isf.patientportal.rest.api.recordtype.dto.RecordTypeDto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientRecordDto {

    private Long id;
	
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private LocalDateTime recordDate;
	
	private PatientDto patient;
	
	private RecordTypeDto recordType;
	
	private float value1;
	
	private float value2;
	
	private String optionValue;
	
	private String note;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private LocalDateTime created;
}
