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
			for (String author: this.getAuthors().split("[;\n\r]"))
			{
				if (author.trim().length()>0)
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
	
	@Override
	public boolean equals(Object o){
		if (o!=null && this.getClass().isAssignableFrom(o.getClass())){
			Biblio bib = (Biblio) o;
			return this.getAuthors().equals(bib.getAuthors())
					&& this.getMainAuthor().equals(bib.getMainAuthor())
					&& this.getTitle().equals(bib.getTitle())
					&& this.getYear().equals(bib.getYear());
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		if (this.getTitle()!=null)
			return this.getTitle().hashCode();
		else
			return this.getId();
	}
	
}
