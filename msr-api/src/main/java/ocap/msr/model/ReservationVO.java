package ocap.msr.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ocap.msr.model.NewReservationVO;
import ocap.msr.model.SeatVO;
import ocap.msr.model.UserVO;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-04T12:45:48.978+09:00")

public class ReservationVO   {
  @JsonProperty("seat")
  private SeatVO seat = null;

  @JsonProperty("user")
  private UserVO user = null;

  @JsonProperty("reservationDate")
  private LocalDate reservationDate = null;

  @JsonProperty("startingTime")
  private DateTime startingTime = null;

  @JsonProperty("endingTime")
  private DateTime endingTime = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    OCCUPIED("occupied");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("reservedAt")
  private DateTime reservedAt = null;

  @JsonProperty("id")
  private Long id = null;

  public ReservationVO seat(SeatVO seat) {
    this.seat = seat;
    return this;
  }

   /**
   * Get seat
   * @return seat
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SeatVO getSeat() {
    return seat;
  }

  public void setSeat(SeatVO seat) {
    this.seat = seat;
  }

  public ReservationVO user(UserVO user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserVO getUser() {
    return user;
  }

  public void setUser(UserVO user) {
    this.user = user;
  }

  public ReservationVO reservationDate(LocalDate reservationDate) {
    this.reservationDate = reservationDate;
    return this;
  }

   /**
   * Get reservationDate
   * @return reservationDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getReservationDate() {
    return reservationDate;
  }

  public void setReservationDate(LocalDate reservationDate) {
    this.reservationDate = reservationDate;
  }

  public ReservationVO startingTime(DateTime startingTime) {
    this.startingTime = startingTime;
    return this;
  }

   /**
   * Get startingTime
   * @return startingTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DateTime getStartingTime() {
    return startingTime;
  }

  public void setStartingTime(DateTime startingTime) {
    this.startingTime = startingTime;
  }

  public ReservationVO endingTime(DateTime endingTime) {
    this.endingTime = endingTime;
    return this;
  }

   /**
   * Get endingTime
   * @return endingTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DateTime getEndingTime() {
    return endingTime;
  }

  public void setEndingTime(DateTime endingTime) {
    this.endingTime = endingTime;
  }

  public ReservationVO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ReservationVO reservedAt(DateTime reservedAt) {
    this.reservedAt = reservedAt;
    return this;
  }

   /**
   * Get reservedAt
   * @return reservedAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DateTime getReservedAt() {
    return reservedAt;
  }

  public void setReservedAt(DateTime reservedAt) {
    this.reservedAt = reservedAt;
  }

  public ReservationVO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationVO reservation = (ReservationVO) o;
    return Objects.equals(this.seat, reservation.seat) &&
        Objects.equals(this.user, reservation.user) &&
        Objects.equals(this.reservationDate, reservation.reservationDate) &&
        Objects.equals(this.startingTime, reservation.startingTime) &&
        Objects.equals(this.endingTime, reservation.endingTime) &&
        Objects.equals(this.status, reservation.status) &&
        Objects.equals(this.reservedAt, reservation.reservedAt) &&
        Objects.equals(this.id, reservation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seat, user, reservationDate, startingTime, endingTime, status, reservedAt, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationVO {\n");
    
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    reservationDate: ").append(toIndentedString(reservationDate)).append("\n");
    sb.append("    startingTime: ").append(toIndentedString(startingTime)).append("\n");
    sb.append("    endingTime: ").append(toIndentedString(endingTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reservedAt: ").append(toIndentedString(reservedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

