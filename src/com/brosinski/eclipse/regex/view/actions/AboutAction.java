package com.brosinski.eclipse.regex.view.actions;

import java.util.Dictionary;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;

import com.brosinski.eclipse.regex.RegExPlugin;
import com.brosinski.eclipse.regex.view.RegExView;


public class AboutAction extends Action {

	private RegExView view;
	
    public AboutAction(RegExView view) {
		setText("About");
		this.view = view;
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.jface.action.Action#run()
     */
    public void run() {
    	Dictionary d = RegExPlugin.getDefault().getBundle().getHeaders();
    	String version = (String) d.get(org.osgi.framework.Constants.BUNDLE_VERSION);
    	
		String msg = "Regular Expression Tester " + version + "\n";
		msg += "(C) 2006-2012 by Stephan Brosinski <sbrosinski@gmail.com>\n\n";
		msg += "https://github.com/sbrosinski/RegexTester \n";
		

		MessageDialog.openInformation(view.getSite().getShell(), "About RegexTester", msg);     
        
        
    }
    

}
