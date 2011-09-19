package org.vamdc.kida;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Arrays;


import org.vamdc.kida.auto._Specie;

public class Specie extends _Specie {

	//public static final String INCHI_KEY_PROPERTY = "inchi_key";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6528897272169839978L;
	
	private String[] specialSpecies = { "Cr", "CR" , "Crp" , "CRP",  "e", "e-", "E" ,"photon" , "Photon", "PHOTON" };

	// return the formula sorted alphabetically
	public String getFormulaSorted()
	{
		String formula = "";
		Map<String, Integer> tm = new TreeMap<String, Integer>(); 
		List<SpecieHasElement> tabShe = this.getSpecieHasElementArray();
		for(SpecieHasElement she : tabShe )
		{
			tm.put(she.getToElement().getSymbol(), she.getOccurrence() );
			
		}
		Set set = tm.entrySet(); 
		Iterator i = set.iterator(); 
		while(i.hasNext()) 
		{
			Map.Entry me = (Map.Entry)i.next();
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
		List<SpecieHasElement> tabShe = this.getSpecieHasElementArray();
		for(SpecieHasElement she : tabShe )
		{
			tm.put(she.getToElement().getSymbol(), she.getOccurrence() );
			
		}
		Set set = tm.entrySet(); 
		Iterator i = set.iterator(); 
		while(i.hasNext()) 
		{
			Map.Entry me = (Map.Entry)i.next();
			
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
		List<SpecieHasElement> tabShe = this.getSpecieHasElementArray();
		for(SpecieHasElement she : tabShe )
		{
			mass += she.getToElement().getMassValue() * she.getOccurrence();
			
		}
	 return mass;	
	}
	
	public Integer getNuclearCharge()
	{
		
		if ( ! this.isAnAtom()) 
			return null;
		List<SpecieHasElement> tabShe = this.getSpecieHasElementArray();
		for(SpecieHasElement she : tabShe )
		{
			if ( she.getToElement().getAtomicNumber() != null  )
				return she.getToElement().getAtomicNumber(); 	
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
		List<SpecieHasElement> tabShe = this.getSpecieHasElementArray();
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
	
	/* public void setInchiKey(String inchi) {
	        writeProperty("inchi_key", inchi);
	    }
	    public String getInchiKey() {
	        return (String)readProperty("inchi_key");
	    }*/
	

}
