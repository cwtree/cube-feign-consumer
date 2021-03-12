package com.cube.common;

import cn.hutool.crypto.symmetric.AES;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年2月22日
 */
public class GlobalVar {

	public static AES AES = null;

	public static String UTF8 = "UTF-8";

	public static String MAIL_PATTERN = "^[A-Za-z0-9\\u4e00-\\u9fa5_.]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";

	public static String PHONE_PATTERN = "^1[3,4,5,6,7,8,9][0-9]{9}$";

}
