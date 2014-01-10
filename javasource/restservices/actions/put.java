// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.consume.RestConsumer;
import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class put extends UserAction<IMendixObject>
{
	private String url;
	private IMendixObject dataObject;
	private String optEtag;

	public put(String url, IMendixObject dataObject, String optEtag)
	{
		super();
		this.url = url;
		this.dataObject = dataObject;
		this.optEtag = optEtag;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		return RestConsumer.putObject(getContext(), url, dataObject, optEtag).getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "put";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
