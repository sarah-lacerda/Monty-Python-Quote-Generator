package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class QuoteController {

	@Autowired
	private QuoteService service;

	@GetMapping("/v1/quote")
	//@ResponseBody
	public Quote getQuote() {
		return service.getQuote();
	}

	@GetMapping("/v1/quote/{actor}")
	//@ResponseBody
	public Quote getQuoteByActor(@PathVariable("actor") String actor) {
		return service.getQuoteByActor(actor);
	}

}
