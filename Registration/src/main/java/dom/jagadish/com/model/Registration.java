package dom.jagadish.com.model;

import javax.xml.bind.annotation.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.ResourceSupport;

/*@XmlAccessorType(XmlAccessType.FIELD)
//@JsonPropertyOrder({"userId","firstName","lastName","password","confirmPassword","phoneNumber","emailId"})
@XmlRootElement
@XmlType(propOrder={"userId","firstName","lastName","password","confirmPassword","phoneNumber","emailId"})*/
@Document(collection="UserData")
//@RequestMapping("/reg")

public class Registration  {
	// public static final String LINK_NAME_CATALOG = null;
		//private static final long serialVersionUID = 1L;
		 @Id //@XmlAttribute
		private String userId;
		private String firstName;
		private String lastName;
		private String password;
		private String confirmPassword;	
		private double phoneNumber;
		private String emailId;
		
		public Registration() { 
			
		}
		public Registration(String userId, String firstName, String lastName, String password, String confirmPassword,
				double phoneNumber, String emailId) {
			super();
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
			this.confirmPassword = confirmPassword;
			this.phoneNumber = phoneNumber;
			this.emailId = emailId;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmPassword() {
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		public double getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(double phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		@Override
		public String toString() {
			return "Registration [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", phoneNumber=" + phoneNumber
					+ ", emailId=" + emailId + "]";
		}
		
}

