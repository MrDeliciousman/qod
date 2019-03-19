package edu.cnm.deepdive.qod.demo.model.dao;

import edu.cnm.deepdive.qod.demo.model.entity.Quote;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, UUID> {



}
