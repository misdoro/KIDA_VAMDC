package org.vamdc.kida.dao;

import org.vamdc.kida.dao.auto._Channel;

public class Channel extends _Channel {
	public final static String PRODUCT="product";
	public final static String REACTANT="reactant";

	public boolean isValid(){
		if (this.getAddedStatus() == 0)
			return false;
		if (this.getTypeChannel() == null || "3-body".equals(this.getTypeChannel().getAbbrev()))
			return false;
		for (Specie element:this.getSpecies()){
			if (!element.isValid())
				return false;
		}
		
		return true;
	}
	
}
