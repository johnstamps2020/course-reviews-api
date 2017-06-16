package com.teamtreehouse.review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by johnstamps2020 on 6/16/17.
 */
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
}
