package model;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.*;



@Entity
public class Reservation implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer reservationId;
	
	private LocalTime startTime;
	private LocalTime endTime;
	
	@ManyToOne
	@JoinColumns({@JoinColumn(name="reserved_date"),@JoinColumn(name="roo_id")})
	private ReservableRoom reservableRoom;
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	}
