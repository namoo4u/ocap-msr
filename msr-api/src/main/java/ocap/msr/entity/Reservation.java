package ocap.msr.entity;

import java.sql.Date;
import java.sql.Timestamp;

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

	public Reservation() {
		super();
	}

	public Reservation(long id, Seat seat, User user, Date date, Timestamp from, Timestamp to, ReservationStatus status,
			Timestamp reservedAt, Timestamp lastModifiedAt) {
		super();
		this.id = id;
		this.seat = seat;
		this.user = user;
		this.date = date;
		this.from = from;
		this.to = to;
		this.status = status;
		this.reservedAt = reservedAt;
		this.lastModifiedAt = lastModifiedAt;
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

	public java.sql.Date getDate() {
		return date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}

	public java.sql.Timestamp getFrom() {
		return from;
	}

	public void setFrom(java.sql.Timestamp from) {
		this.from = from;
	}

	public java.sql.Timestamp getTo() {
		return to;
	}

	public void setTo(java.sql.Timestamp to) {
		this.to = to;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}

	public java.sql.Timestamp getReservedAt() {
		return reservedAt;
	}

	public void setReservedAt(java.sql.Timestamp reservedAt) {
		this.reservedAt = reservedAt;
	}

	public java.sql.Timestamp getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(java.sql.Timestamp lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", seat=" + seat + ", user=" + user + ", date=" + date + ", from=" + from
				+ ", to=" + to + ", status=" + status + ", reservedAt=" + reservedAt + ", lastModifiedAt="
				+ lastModifiedAt + "]";
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
	
	
}
