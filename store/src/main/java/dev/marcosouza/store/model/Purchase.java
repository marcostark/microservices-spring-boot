package dev.marcosouza.store.model;

public class Purchase {
	
	public Long id;
	
	private Long requestId;
	
	public Integer waitingIime;
	
	public String deiveryAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Integer getWaitingIime() {
		return waitingIime;
	}

	public void setWaitingIime(Integer waitingIime) {
		this.waitingIime = waitingIime;
	}

	public String getDeiveryAddress() {
		return deiveryAddress;
	}

	public void setDeiveryAddress(String deiveryAddress) {
		this.deiveryAddress = deiveryAddress;
	}
	
	

}
