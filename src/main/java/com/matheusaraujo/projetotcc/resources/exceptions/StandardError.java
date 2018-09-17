package com.matheusaraujo.projetotcc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msgErro;
	private Long timeStamp;
	public StandardError(Integer status, String msgErro, Long timeStamp) {
		super();
		this.status = status;
		this.msgErro = msgErro;
		this.timeStamp = timeStamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsgErro() {
		return msgErro;
	}
	public void setMsgErro(String msgErro) {
		this.msgErro = msgErro;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
		
	
	
}
