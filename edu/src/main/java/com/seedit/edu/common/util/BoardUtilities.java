package com.seedit.edu.common.util;

import javax.servlet.http.HttpServletRequest;

public class BoardUtilities {

	/**
	 * ��������������������� [METHOD] ���������������������
	 * 
	 * @���ϸ� : BoardUtilities.java
	 * @�ۼ����� : ****. **. **.
	 * @�ۼ��� : �ڽ���
	 * @�޼ҵ�� : isAjaxRequest
	 * @�޼ҵ� ���� : Request�� AJAX������ Ȯ���ؼ� True / False ����
	 *      ���������������������������������������������������
	 */
	public boolean isAjaxRequest(HttpServletRequest req) {
		String header = req.getHeader("AJAX");
		return "true".equals(header);
	}

}
