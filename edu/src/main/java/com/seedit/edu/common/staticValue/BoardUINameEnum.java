package com.seedit.edu.common.staticValue;

public enum BoardUINameEnum {
	
	JSP_BOARD_LIST("sample/boardList"),
	JSP_BOARD_DETAIL("sample/boardDetail"),
	JSP_BOARD_UPDATE("sample/boardUpdate"),
	JSP_404_ERROR("sample/error/404error"),
	JSP_EXCEPTION("sample/error/exception"),
	JSP_BOARD_WRITE("sample/boardWrite");
	
	private String jspFileName;
	BoardUINameEnum (String code){
		this.jspFileName = code;
	}
	
	public String getJSPFileName(){
		return this.jspFileName;
	}
}
