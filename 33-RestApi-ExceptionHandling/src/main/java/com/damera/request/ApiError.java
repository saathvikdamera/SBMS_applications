package com.damera.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {

	private Integer errorCode;
	private String errorMsg;
	private LocalDateTime dateAndTime;
}
