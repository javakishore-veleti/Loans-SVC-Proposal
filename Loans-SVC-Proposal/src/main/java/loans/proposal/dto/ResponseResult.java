package loans.proposal.dto;

import java.util.HashMap;
import java.util.Map;

public class ResponseResult {

	private Map<String, Object> results = new HashMap<>();

	public ResponseResult() {
	}
	
	public ResponseResult(String key, Object value) {
		this.results.put(key, value);
	}

	public void addResult(String key, Object value) {
		this.results.put(key, value);
	}

}
