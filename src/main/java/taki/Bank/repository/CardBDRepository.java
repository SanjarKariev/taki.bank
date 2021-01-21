package taki.Bank.repository;

import org.springframework.data.repository.CrudRepository;
import taki.Bank.models.CardBD;

public interface CardBDRepository extends CrudRepository<CardBD, Long> {
}
