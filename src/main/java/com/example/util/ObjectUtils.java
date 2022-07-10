package com.example.util;

import java.util.Collection;
import java.util.Map;

public class ObjectUtils {

	/**
	 * 对象是否非空
	 */
	public static boolean isNotNull(Object object) {
		return !ObjectUtils.isNull(object);
	}

	/**
	 * 对象是否为空
	 */
	public static boolean isNull(Object object) {
		return object == null;
	}

	/**
	 * 是否非空
	 * 
	 * @param map 要判断的Map
	 * @return true：非空 false：空
	 */
	public static boolean isNotEmpty(Map<?, ?> map) {
		return !ObjectUtils.isEmpty(map);
	}

	/**
	 * 是否为空
	 */
	public static boolean isEmpty(Map<?, ?> map) {
		return isNull(map) || map.isEmpty();
	}

	/**
	 * 数组是否非空
	 */
	public static boolean isNotEmpty(Object[] objects) {
		return !ObjectUtils.isEmpty(objects);
	}

	/**
	 * 对象数组是否为空
	 */
	public static boolean isEmpty(Object[] objects) {
		return isNull(objects) || (objects.length == 0);
	}

	/**
	 * 集合是否非空
	 */
	public static boolean isNotEmpty(Collection<?> coll) {
		return !ObjectUtils.isEmpty(coll);
	}

	/**
	 * 集合是否为空
	 */
	public static boolean isEmpty(Collection<?> coll) {
		return isNull(coll) || coll.isEmpty();
	}

}
