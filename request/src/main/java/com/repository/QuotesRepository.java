package com.repository;

import com.dim.fxapp.entity.impl.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dima on 25.03.18.
 */

public interface QuotesRepository extends JpaRepository<Quotes, Integer> {
}


