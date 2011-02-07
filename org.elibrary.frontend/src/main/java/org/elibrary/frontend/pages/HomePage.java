package org.elibrary.frontend.pages;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.elibrary.backend.dao.MessageDao;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	@SpringBean
	private MessageDao messageDao;

	public HomePage(final PageParameters parameters) {
		messageDao.saveMessage("Hello World");
		add(new Label("message", messageDao.readMessage()));
	}

}
