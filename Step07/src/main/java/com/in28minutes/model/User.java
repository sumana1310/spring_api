package com.in28minutes.model;


	import java.io.Serializable;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name = "users")
	public class User implements Serializable {

		private static final long serialVersionUID = 2681531852204068105L;
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private String username;
		private String emailId;
		private String password;
		private boolean enabled;

	/*
	 * @OneToOne(mappedBy = "users") private Customer customer;
	 * 
	 * public Customer getCustomer() { return customer; }
	 * 
	 * public void setCustomer(Customer customer) { this.customer = customer; }
	 */

		public String getUserName() {
			return username;
		}

		public void setUserName(String UserName) {
			this.username = UserName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
// parameter constructor 
		public User(String userName, String emailId, String password, boolean enabled) {
			super();
			this.username = userName;
			this.emailId = emailId;
			this.password = password;
			this.enabled = enabled;
			
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
public User() {
	
}
	}

