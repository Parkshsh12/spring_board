package com.seedit.edu.common.util;

import javax.servlet.http.HttpServletRequest;

public class BoardUtilities {

	/**
	 * □■□■□■□■□■□■□■□■□■□■ [METHOD] □■□■□■□■□■□■□■□■□■□■
	 * 
	 * @파일명 : BoardUtilities.java
	 * @작성일자 : ****. **. **.
	 * @작성자 : 박승현
	 * @메소드명 : isAjaxRequest
	 * @메소드 설명 : Request가 AJAX인지를 확인해서 True / False 리턴
	 *      □■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■
	 */
	public boolean isAjaxRequest(HttpServletRequest req) {
		String header = req.getHeader("AJAX");
		return "true".equals(header);
	}

}
