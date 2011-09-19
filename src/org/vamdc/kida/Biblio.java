package org.vamdc.kida;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import org.vamdc.kida.auto._Biblio;


public class Biblio extends _Biblio 
{

	public boolean isAJournal()
	{
		if ( this.getToBiblio1() != null )
			return true;
		return false;
	}
	
	public boolean isABook()
	{
		if ( this.getToBiblio() != null )
			return true;
		return false;
	}
	
	public boolean isAThesis()
	{
		if ( this.getToBiblio2() != null )
			return true;
		return false;
	}

	public Vector<String> getAllAuthorsCollection() {
		
		Vector<String> authors = new Vector<String>(); 
		authors.add(this.getMainAuthor());
		try
		{
			String[] othersAuthors = this.getAuthors().split(";");
			for(int i =0; i < othersAuthors.length ; i++)
			{
				authors.add(othersAuthors[i]);
			}
		}
		catch(Exception e)
		{
			
		}
		return authors;
		
		
	}
	
	public BiblioJournal getBiblioJournal()
	{
		if ( ! this.isAJournal() )
			return null;
		return  this.getToBiblio1();
		
	}
	
	public BiblioBook getBiblioBook()
	{
		if ( ! this.isABook() )
			return null;
		return  this.getToBiblio();
		
	}
	
	public BiblioThesis getBiblioThesis()
	{
		if ( ! this.isAThesis() )
			return null;
		return  this.getToBiblio2();
		
	}
	
	
	

	
	
}
