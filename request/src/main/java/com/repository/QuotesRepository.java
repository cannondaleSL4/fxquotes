package com.repository;

//import com.dim.fxapp.entity.impl.Quotes;

import com.fxapp.entity.impl.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 25.03.18.
 */
@Repository
public interface QuotesRepository extends JpaRepository<Quotes, Integer> {
}


