package org.vamdc.kida;

import org.vamdc.kida.auto._Channel;

public class Channel extends _Channel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7305934736554177365L;

	// get unit for alpha parameter. Depends of the type of channel
	public String getUnitAlpha() {
		try
		{
			if ( this.getToTypeChannel().getId() < 4 )
				return "1/s";
		}
		catch (Exception e)
		{
			
		}
		
		return "cm3/s";
			
	}

}
