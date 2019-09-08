package com.utry.ut.web.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 *
 * @版权: Copyright (c) 2016-2017 *********公司技术开发部
 * @author : huangjiapeng
 * @E-mail:1625545295@qq.com
 * @版本: 1.0
 * @创建日期: 2019年4月15日 上午11:46:38
 * @ClassName DateConverter
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class DateConverter implements Converter<String, Date> {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * source target
	 */
	@Override
	public Date convert(String source) {
		try {
			Date parse;
			parse = format.parse(source);
			return parse;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
