package com.repository;

import com.dim.fxapp.entity.impl.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by dima on 07.05.18.
 */
@RepositoryRestResource(collectionResourceRel = "quotes", path = "quotes")
public interface QuotesRepository extends PagingAndSortingRepository<Quotes, Integer> {
}


