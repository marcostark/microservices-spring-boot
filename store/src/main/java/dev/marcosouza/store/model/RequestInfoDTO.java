package dev.marcosouza.store.model;

public class RequestInfoDTO {

	private Long id;
	
	private Integer waitingIime;

	public Integer getWaitingIime() {
		return waitingIime;
	}

	public void setWaitingIime(Integer waitingIime) {
		this.waitingIime = waitingIime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
;
}
