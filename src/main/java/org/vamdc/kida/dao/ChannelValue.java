package org.vamdc.kida.dao;

import org.vamdc.kida.dao.auto._ChannelValue;

public class ChannelValue extends _ChannelValue {
	public double getValue(String variableName)
	{
		for(ChannelVariable oneValue : this.getChannelVariables() )
		{
			if ( oneValue.getVariableName().getName().equals(variableName))
			{
				return Double.parseDouble(oneValue.getValue() + "e" + oneValue.getExposant());
			}
				
			
		}
		return -1;
		
	}
}
