# Introduction

This document is aimed for developers who are responsible for developing msr-api

## Open a project from STS
1. Import
1. Maven
1. Existing Maven projects
1. Select msr-api directory created in the preceding phase


## Add dependencies to pom.xml
```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
```

## Create packages
* ocap.msr.entity 
* ocap.msr.repository
* ocap.msr.service

## Create Entity classes in the ocap.msr.entity package
* User
* Seat
* Reservation

### User.java
generate followings after writing User.java like below
* default constructor
* constructor with fields: email, password
* constructor with fields: id, email, password
* getter / setter
* toString
* hashCode and equals 

'''
package ocap.msr.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7437621130386820555L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String email;
	
	@Column 
	private String password;

'''

### Seat.java
generate followings after writing Seat.java like below
* default constructor
* constructor with fields: seatNo, location
* constructor with fields: id, seatNo, location
* getter / setter
* toString
* hashCode and equals 
```
package ocap.msr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Seat {

	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String seatNo;
	
	@Column
	private String location;
}
```
### ReservationStatus.java
This enum is used to store the status of a reservation
```
package ocap.msr.entity;

public enum ReservationStatus {
	AVAILABLE,
	OCCUPIED;
}
```
### Reservation.java
generate followings after writing Seat.java like below
* default constructor
* constructor with all fields
* getter / setter
* toString
* hashCode and equals 

```
package ocap.msr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Seat seat;
	
	@ManyToOne
	private User user;
	
	@Column
	java.sql.Date date;
	
	@Column
	java.sql.Timestamp from;
	
	@Column
	java.sql.Timestamp to;
	
	@Column
	ReservationStatus status;
	
	@Column
	java.sql.Timestamp reservedAt;
	
	@Column
	java.sql.Timestamp lastModifiedAt;
	
}
```

## Create Repository Interfaces in the ocap.msr.repository package
* SeatRepository
* UserRepository
* ReservationRepository

### SeatRepository.java

```
package ocap.msr.repository;

import org.springframework.data.repository.CrudRepository;

import ocap.msr.entity.Seat;

public interface SeatRepository extends CrudRepository<Seat, Long>{

}
```

### UserRepository.java

```
package ocap.msr.repository;

import org.springframework.data.repository.CrudRepository;

import ocap.msr.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

}

```

### ReservationRepository.java

```
package ocap.msr.repository;

import org.springframework.data.repository.CrudRepository;

import ocap.msr.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long>{

}

```

