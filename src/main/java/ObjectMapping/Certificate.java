package ObjectMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate {

	@Id
	private int certificateId;
	private String certificateName;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
}
