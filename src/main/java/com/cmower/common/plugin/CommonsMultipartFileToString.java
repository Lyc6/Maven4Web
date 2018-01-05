package com.cmower.common.plugin;

import org.springframework.core.convert.converter.Converter;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class CommonsMultipartFileToString  implements Converter<CommonsMultipartFile, String>{

	@Override
	public String convert(CommonsMultipartFile file) {
		return null;
	}

}
