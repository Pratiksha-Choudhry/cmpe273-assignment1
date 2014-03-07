package edu.sjsu.cmpe.library.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import edu.sjsu.cmpe.library.domain.Review;

@JsonPropertyOrder({"reviews"})
public class ReviewsDto extends LinksDto {
	
	private Review review;

    /**
     * @param book
     */
    public ReviewsDto(Review review) {
	super();
	this.review = review;
    }

    /**
     * @return the book
     */
    public Review getReview() {
	return review;
    }

    /**
     * @param book
     *            the book to set
     */
    public void setReview(Review review) {
	this.review = review;
    }
	
}
