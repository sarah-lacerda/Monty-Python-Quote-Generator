package challenge;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(name="scripts")
public class Quote {

	@Id
//	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	private String actor;
	private String detail;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return detail;
	}

	public void setQuote(String quote) {
		this.detail = detail;
	}

}
