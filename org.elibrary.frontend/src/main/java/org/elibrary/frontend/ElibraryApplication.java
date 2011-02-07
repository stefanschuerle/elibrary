package org.elibrary.frontend;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.elibrary.frontend.pages.HomePage;

public class ElibraryApplication extends WebApplication {

	public void init() {
		super.init();
		addComponentInstantiationListener(new SpringComponentInjector(this));
	}

	public Class<HomePage> getHomePage() {
		return HomePage.class;
	}

}
