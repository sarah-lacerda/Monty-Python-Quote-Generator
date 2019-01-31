package challenge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface QuoteRepository extends JpaRepository<Quote, Integer> {

    List<Quote> findAllByActor(String name);
}
