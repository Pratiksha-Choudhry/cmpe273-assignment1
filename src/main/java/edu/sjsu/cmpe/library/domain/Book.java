package edu.sjsu.cmpe.library.domain;

import java.util.ArrayList;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Book {
	
	private long isbn;
	
	@NotEmpty(message = "title cannot be null or empty")
    private String title;
	
	@NotNull(message = "status cannot be null or empty if present")
	@Pattern(regexp = "available|checked-out|in-queue|lost")
    private String status = "available";
    
    @JsonProperty("publication-date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
	@NotNull(message = "publication-date cannot be empty")
    private String publicationDate;
    
    private String language;
    
    @JsonProperty("num-pages")
    @Min(0)
    private long numPages = 0;
    
    @JsonProperty("authors")
    @NotEmpty(message = "author list cannot be empty")
	@Valid
    private ArrayList<Author> authors;
    
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getNumPages() {
		return numPages;
	}
	public void setNumPages(long numPages) {
		this.numPages = numPages;
	}
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
    
    
    

}