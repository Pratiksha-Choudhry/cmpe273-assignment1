/**
 * 
 */
package edu.sjsu.cmpe.library.repository;

import java.util.ArrayList;

import edu.sjsu.cmpe.library.domain.Review;

/**
 * @author lisa
 *
 */
public interface ReviewRepositoryInterface {

	 Review saveReview(long isbn, Review newReview);
	 
	 Review getReviewById(Integer id);

	 ArrayList<Review> getReviews();
}
