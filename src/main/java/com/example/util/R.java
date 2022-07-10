package com.example.util;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 返回结果 
 */
public class R extends HashMap<String, Object> {
	
	private static final long serialVersionUID = 1L;

	/** 状态码 */
	public static final String CODE_TAG = "code";
	public static final String MSG_TAG = "msg";

	/** 数据对象 */
	public static final String DATA_TAG = "data";

	public R() {
	}

	public R(int code, String msg) {
		super.put(CODE_TAG, code);
		super.put(MSG_TAG, msg);
	}

	public R(int code, String msg, Object data) {
		super.put(CODE_TAG, code);
		super.put(MSG_TAG, msg);
		if (ObjectUtils.isNotNull(data)) {
			super.put(DATA_TAG, data);
		}
	}

	/**
	 * 返回成功消息
	 * 
	 * @return 成功消息
	 */
	public static R success() {
		return R.success("操作成功");
	}

	/**
	 * 返回成功数据
	 * 
	 * @return 成功消息
	 */
	public static R success(Object data) {
		return R.success("操作成功", data);
	}

	/**
	 * 返回成功消息
	 * 
	 * @param msg 返回内容
	 * @return 成功消息
	 */
	public static R success(String msg) {
		return R.success(msg, null);
	}

	/**
	 * 返回成功消息
	 * 
	 * @param msg  返回内容
	 * @param data 数据对象
	 * @return 成功消息
	 */
	public static R success(String msg, Object data) {
		if (data instanceof List)
			return new R(HttpStatus.SUCCESS, msg, data);
		List<Object> temp = new ArrayList<>();
		temp.add(data);
		return new R(HttpStatus.SUCCESS, msg, temp);
	}

	/**
	 * 返回错误消息
	 * 
	 * @return 错误消息
	 */
	public static R error() {
		return R.error("操作失败");
	}

	/**
	 * 返回错误消息
	 * 
	 * @param msg 返回内容
	 * @return 错误消息
	 */
	public static R error(String msg) {
		return R.error(msg, null);
	}

	/**
	 * 返回错误消息
	 * 
	 * @param msg  返回内容
	 * @param data 数据对象
	 * @return 错误消息
	 */
	public static R error(String msg, List<Object> data) {
		return new R(HttpStatus.ERROR, msg, data);
	}

	/**
	 * 返回错误消息
	 * 
	 * @param code 状态码
	 * @param msg  返回内容
	 * @return 错误消息
	 */
	public static R error(int code, String msg) {
		return new R(code, msg, null);
	}
	
}
