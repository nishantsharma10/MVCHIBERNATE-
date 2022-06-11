package myproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="LOGINUSER")
public class User implements Serializable {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int userId;
		@Column(name="USERNAME")
		private String name;
		
		private String password;
		private String city;
		
		public User() {
			
			
		}

		public User(int userId, String name, String password, String city) {
			
			this.userId = userId;
			this.name = name;
			this.password = password;
			this.city = city;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		
		
}
