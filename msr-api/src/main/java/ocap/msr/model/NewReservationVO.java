package ocap.msr.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ocap.msr.model.SeatVO;
import ocap.msr.model.UserVO;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewReservationVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-01T17:30:26.562+09:00")

public class NewReservationVO   {
  @JsonProperty("seat")
  private SeatVO seat = null;

  @JsonProperty("user")
  private UserVO user = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("from")
  private DateTime from = null;

  @JsonProperty("to")
  private DateTime to = null;

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

  public NewReservationVO seat(SeatVO seat) {
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

  public NewReservationVO user(UserVO user) {
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

  public NewReservationVO date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public NewReservationVO from(DateTime from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DateTime getFrom() {
    return from;
  }

  public void setFrom(DateTime from) {
    this.from = from;
  }

  public NewReservationVO to(DateTime to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DateTime getTo() {
    return to;
  }

  public void setTo(DateTime to) {
    this.to = to;
  }

  public NewReservationVO status(StatusEnum status) {
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

  public NewReservationVO reservedAt(DateTime reservedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewReservationVO newReservation = (NewReservationVO) o;
    return Objects.equals(this.seat, newReservation.seat) &&
        Objects.equals(this.user, newReservation.user) &&
        Objects.equals(this.date, newReservation.date) &&
        Objects.equals(this.from, newReservation.from) &&
        Objects.equals(this.to, newReservation.to) &&
        Objects.equals(this.status, newReservation.status) &&
        Objects.equals(this.reservedAt, newReservation.reservedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seat, user, date, from, to, status, reservedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewReservationVO {\n");
    
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reservedAt: ").append(toIndentedString(reservedAt)).append("\n");
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

