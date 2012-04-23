package org.vamdc.kida.dao;

import org.vamdc.kida.dao.auto._Channel;

public class Channel extends _Channel {
	public final static String PRODUCT="product";
	public final static String REACTANT="reactant";

	// get unit for alpha parameter. Depends of the type of channel
	public String getUnitAlpha() {
		//TODO: there must be a better criteria to figure out units
		try
		{
			if ( this.getTypeChannel().getId() < 4 )
				return "1/s";
		}
		catch (Exception e)
		{

		}

		return "cm3/s";

	}

}
