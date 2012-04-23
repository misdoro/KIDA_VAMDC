package org.vamdc.kida.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.vamdc.kida.dao.auto._Biblio;

public class Biblio extends _Biblio {

	public boolean isAJournal()
	{
		return this.getBibliography1() != null;
	}
	
	public boolean isABook()
	{
		return this.getBibliography()!= null; 
	}
	
	public boolean isAThesis()
	{
		return this.getBibliography2()!=null;
	}

	public Collection<String> getAllAuthors() {
		
		Collection<String> authors = new ArrayList<String>(); 
		authors.add(this.getMainAuthor());
		if (this.getAuthors()!=null)
			for (String author: this.getAuthors().split(";"))
			{
				authors.add(author.trim());
			}
		return authors;
	}
	
	public BiblioJournal getBiblioJournal()
	{
		if (this.isAJournal())
			return this.getBibliography1();
		return null;	
	}
	
	public BiblioBook getBiblioBook()
	{
		if (this.isABook())
			return this.getBibliography();
	
		return null;
		
	}
	
	public BiblioThesis getBiblioThesis()
	{
		if (this.isAThesis())
			return this.getBibliography2();
		return null;	
	}
	
}
