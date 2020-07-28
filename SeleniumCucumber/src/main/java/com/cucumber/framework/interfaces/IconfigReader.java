/**
 * Vinay Kumar 
 *
 *27/07/2020
 */
package com.cucumber.framework.interfaces;

import com.cucumber.framework.configuration.browser.BrowserType;




/**
 * @author Vinay Kumar
 *
 * 27/07/2020
 */
public interface IconfigReader {
	public String getUserName();
	public String getPassword();
	public String getWebsite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public BrowserType getBrowser();
}
