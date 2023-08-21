package com.codeup.site.repositories;

import com.codeup.site.models.CustomerReviews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientReviewsRepository extends JpaRepository<CustomerReviews, Integer> {
    List<CustomerReviews> findAllByUser_Id(int user_Id);

}
