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
		throw new IllegalArgumentException("Value for variable "+variableName+" not found in channel "+this.getChannel().getId());	
	}
	
	public boolean isValid() {
		if (getIsTrash() == 1)
			return false;
		if (getIsTemp() == 1)
			return false;
		if (getStatus() == 0)
			return false;
		return true;
	}
}
