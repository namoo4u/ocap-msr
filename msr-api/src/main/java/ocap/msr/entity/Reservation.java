package ocap.msr.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Seat seat;
	
	@ManyToOne
	private User user;
	
	@Column(nullable=false)
	java.sql.Date reservationDate;
	
	@Column(nullable=false)
	java.sql.Timestamp startingTime;
	
	@Column(nullable=false)
	java.sql.Timestamp endingTime;
	
	@Column
	ReservationStatus status;
	
	@Column(nullable=false, insertable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	java.util.Calendar reservedAt;
	
	@Column(nullable=false, insertable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	java.util.Calendar lastModifiedAt;

	public Reservation() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public java.sql.Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(java.sql.Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public java.sql.Timestamp getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(java.sql.Timestamp startingTime) {
		this.startingTime = startingTime;
	}

	public java.sql.Timestamp getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(java.sql.Timestamp endingTime) {
		this.endingTime = endingTime;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}

	public java.util.Calendar getReservedAt() {
		return reservedAt;
	}

	public void setReservedAt(java.util.Calendar reservedAt) {
		this.reservedAt = reservedAt;
	}

	public java.util.Calendar getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(java.util.Calendar lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", seat=" + seat + ", user=" + user + ", reservationDate=" + reservationDate
				+ ", startingTime=" + startingTime + ", endingTime=" + endingTime + ", status=" + status
				+ ", reservedAt=" + reservedAt + ", lastModifiedAt=" + lastModifiedAt + "]";
	}
	
	
}
