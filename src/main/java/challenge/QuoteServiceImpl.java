package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;
	private Random generator = new Random();

	public QuoteServiceImpl(QuoteRepository repository){
		//generator = new Random();
		this.repository = repository;
	}

	@Override
	public Quote getQuote() {
		return repository.findById(generator.nextInt(repository.findAll().size()-1)).get();
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		List<Quote> listOfQuotesFromActor = repository.findAllByActor(actor);
		return listOfQuotesFromActor.get(generator.nextInt(listOfQuotesFromActor.size()-1));
	}

}
