package dev.marcosouza.store.model;

public class Purchase {
	
	public Long id;
	
	private Long requestId;
	
	public Long waitingIime;
	
	public Long deiveryAddress;

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

	public Long getWaitingIime() {
		return waitingIime;
	}

	public void setWaitingIime(Long waitingIime) {
		this.waitingIime = waitingIime;
	}

	public Long getDeiveryAddress() {
		return deiveryAddress;
	}

	public void setDeiveryAddress(Long deiveryAddress) {
		this.deiveryAddress = deiveryAddress;
	}
	
	

}
