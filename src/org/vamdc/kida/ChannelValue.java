package org.vamdc.kida;

import java.util.List;

import org.apache.cayenne.query.SelectQuery;
import org.vamdc.kida.auto._ChannelValue;


public class ChannelValue extends _ChannelValue {

	public double getValue(String variableName)
	{
		List<ChannelVariable> values = this.getChannelVariableArray();
		for(ChannelVariable oneValue : values )
		{
			if ( oneValue.getToVariableName().getName().equals(variableName))
			{
				return Double.parseDouble(oneValue.getValue() + "e" + oneValue.getExposant());
			}
				
			
		}
		return -1;
		
	}
	
}
