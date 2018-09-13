package com.caner;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class App {

	Logger logger = Logger.getLogger(App.class);
	static {
		init();
	}

	private static void init() {
		DOMConfigurator.configure("log4j.xml");

	}

	public static void main(String[] args) {
		App obj = new App();
		obj.runMe("Example");

	}

	private void runMe(String parameter) {

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		logger.debug("This is debug : " + parameter);
	}
}
