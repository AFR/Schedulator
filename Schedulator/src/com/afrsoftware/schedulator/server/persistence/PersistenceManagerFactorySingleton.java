package com.afrsoftware.schedulator.server.persistence;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class PersistenceManagerFactorySingleton {
	private static PersistenceManagerFactory PMF = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	public static PersistenceManagerFactory getPMF() {
		if (PMF == null) {
			return JDOHelper.getPersistenceManagerFactory("transactions-optional");
		}
		return PMF;
	}
}
