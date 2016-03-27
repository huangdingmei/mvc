package com.netshop.conveter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class GoodsDateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		//(nn-mm-dd)
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yy-mm-dd");
		try {
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
