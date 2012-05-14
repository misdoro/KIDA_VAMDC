package org.vamdc.kida.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.vamdc.kida.dao.auto._Specie;

public class Specie extends _Specie {

	private static final  String[] specialSpecies = { "Cr", "CR" , "Crp" , "CRP",  "e", "e-", "E" ,"photon" , "Photon", "PHOTON" };
	static{
		Arrays.sort(specialSpecies);
	}
	
	
	// return the formula sorted alphabetically
	public String getFormulaSorted()
	{
		String formula = "";
		Map<String, Integer> tm = new TreeMap<String, Integer>(); 
		List<SpecieHasElement> tabShe = this.getSpecieHasElements();
		for(SpecieHasElement she : tabShe )
		{
			tm.put(she.getElement().getSymbol(), she.getOccurrence() );

		}
		for (Entry<String,Integer>me: tm.entrySet())
		{
			formula += me.getKey().toString();
			if ( (Integer) me.getValue() > 1 )
				formula += me.getValue().toString();

		} 

		formula+=getChargeStr(this.getCharge());
		
		return formula;
	}

	public String getCommonNameLatex()
	{
		String formula = "";
		Map<String, Integer> tm = new HashMap<String, Integer>(); 
		List<SpecieHasElement> tabShe = this.getSpecieHasElements();
		for(SpecieHasElement she : tabShe )
		{
			tm.put(she.getElement().getSymbol(), she.getOccurrence() );

		}

		for (Entry<String,Integer>me: tm.entrySet())
		{

			if ( (Integer) me.getValue() > 1 )
			{
				formula += me.getKey().toString() + "$_" + me.getValue().toString();
			}
			else
			{
				formula += me.getKey().toString();
			}


		} 

		String charge = getChargeStr(this.getCharge());
		if (charge!="")
			formula+="$^"+charge;
		
		return formula;

	}

	private String getChargeStr(Integer charge){
		if (charge==null || charge ==0)
			return "";
		if (charge>0)
			return "+";
		else 
			return "-";
	}
	
	public double getMass()
	{
		double mass = 0;
		List<SpecieHasElement> tabShe = this.getSpecieHasElements();
		for(SpecieHasElement she : tabShe )
		{
			mass += she.getElement().getMassValue() * she.getOccurrence();

		}
		return mass;	
	}

	public Integer getNuclearCharge()
	{

		if ( ! this.isAnAtom()) 
			return null;
		List<SpecieHasElement> tabShe = this.getSpecieHasElements();
		for(SpecieHasElement she : tabShe )
		{
			if ( she.getElement().getAtomicNumber() != null  )
				return she.getElement().getAtomicNumber(); 	
		}
		return null;

	}

	public boolean isASpecialSpecies()
	{
		if (this.getFormula()==null)
			return false;
		int index = Arrays.binarySearch(specialSpecies,this.getFormula() );

		return index >= 0;

	}

	public boolean isAnAtom()
	{
		if ( this.isASpecialSpecies() )
			return false;
		
		if (this.getSpecieHasElements() ==null || this.getSpecieHasElements().size()!=1)
			return false;
		
		return this.getSpecieHasElements().get(0).getOccurrence()==1;
	}

	public boolean isValid(){
		return (this.isASpecialSpecies() || (this.getInchiKey()!=null && this.getInchiKey().length()>0));
	}
}
