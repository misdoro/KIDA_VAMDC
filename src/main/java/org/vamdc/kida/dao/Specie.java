package org.vamdc.kida.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.vamdc.kida.dao.auto._Specie;

public class Specie extends _Specie {

	private String[] specialSpecies = { "Cr", "CR" , "Crp" , "CRP",  "e", "e-", "E" ,"photon" , "Photon", "PHOTON" };

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
		
		if ( this.getCharge() < 0 )
			formula += "-";
		if ( this.getCharge() > 0 )
			formula += "+";
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
		
		if ( this.getCharge() < 0 )
			formula += "$^" + "-";
		if ( this.getCharge() > 0 )
			formula += "$^" + "+";
		return formula;
		
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
		Arrays.sort(specialSpecies);
		if (this.getFormula()==null)
			return false;
		int index = Arrays.binarySearch(specialSpecies,this.getFormula() );

		if ( index >= 0 )
			return true;
		return false;
		
	}
	
	public boolean isAnAtom()
	{
		if (this.getCharge() != 0 )
			return false;
		
		if ( this.isASpecialSpecies() )
			return false;
		int occurence = 0;
		List<SpecieHasElement> tabShe = this.getSpecieHasElements();
		for(SpecieHasElement she : tabShe )
		{
			occurence += she.getOccurrence();
			if ( occurence > 1 )
				return false;
			
		}
		if ( occurence == 1 )
			return true;
		return false;
	}
	
}
