package ocap.msr.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ocap.msr.model.ReservationCommonVO;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewReservationVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-04T16:47:01.335+09:00")

public class NewReservationVO   {
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

  @JsonProperty("seatId")
  private Long seatId = null;

  @JsonProperty("userId")
  private Long userId = null;

  public NewReservationVO reservationDate(LocalDate reservationDate) {
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

  public NewReservationVO startingTime(DateTime startingTime) {
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

  public NewReservationVO endingTime(DateTime endingTime) {
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

  public NewReservationVO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


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
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getReservedAt() {
    return reservedAt;
  }

  public void setReservedAt(DateTime reservedAt) {
    this.reservedAt = reservedAt;
  }

  public NewReservationVO seatId(Long seatId) {
    this.seatId = seatId;
    return this;
  }

   /**
   * Get seatId
   * @return seatId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getSeatId() {
    return seatId;
  }

  public void setSeatId(Long seatId) {
    this.seatId = seatId;
  }

  public NewReservationVO userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
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
    return Objects.equals(this.reservationDate, newReservation.reservationDate) &&
        Objects.equals(this.startingTime, newReservation.startingTime) &&
        Objects.equals(this.endingTime, newReservation.endingTime) &&
        Objects.equals(this.status, newReservation.status) &&
        Objects.equals(this.reservedAt, newReservation.reservedAt) &&
        Objects.equals(this.seatId, newReservation.seatId) &&
        Objects.equals(this.userId, newReservation.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationDate, startingTime, endingTime, status, reservedAt, seatId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewReservationVO {\n");
    
    sb.append("    reservationDate: ").append(toIndentedString(reservationDate)).append("\n");
    sb.append("    startingTime: ").append(toIndentedString(startingTime)).append("\n");
    sb.append("    endingTime: ").append(toIndentedString(endingTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reservedAt: ").append(toIndentedString(reservedAt)).append("\n");
    sb.append("    seatId: ").append(toIndentedString(seatId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

