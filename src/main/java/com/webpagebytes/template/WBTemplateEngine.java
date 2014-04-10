package com.webpagebytes.template;

import java.io.Writer;
import java.util.Map;

import com.webpagebytes.exception.WBException;

public interface WBTemplateEngine {
	
	public static final String WEBPAGES_PATH_PREFIX = "webpages/";
	public static final String WEBMODULES_PATH_PREFIX = "webmodules/";

	public void initialize() throws WBException;
	public void process(String templateName, Map<String, Object> model, Writer out) throws WBException;
}