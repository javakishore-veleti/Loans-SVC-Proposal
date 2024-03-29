package loans.proposal.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Corporation")
@Table(name = "corporation")
public class Corporation {

	private String name;
	private String description;

	public Corporation() {
	}

	public Corporation(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
