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
	
	public String getAccuracy(){
		StringBuilder result = new StringBuilder();
		result.append("Accuracy: ");
		String unc1="";
		String unc2="";
		
		for (ChannelVariable var: this.getChannelVariables()){
			if ("alpha".equals(var.getVariableName().getName()))
				unc1=var.getTypeUncert()+" F_0="+var.getUncert();
			else if ("beta".equals(var.getVariableName().getName())
					&& var.getUncert()!=null){
				unc2=" g="+var.getUncert();
			}
		}
		result.append(unc1).append(unc2).append(", see http://kida.obs.u-bordeaux1.fr/help/helpUncert for more info");
		return result.toString();
		
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
