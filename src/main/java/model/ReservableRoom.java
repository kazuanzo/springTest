package model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class ReservableRoom implements Serializable {
	
	//複合主キーを表す
	@EmbeddedId
	private ReservableRoomId reservableRoomId;
	
	//多対１
	@ManyToOne
	
	//外部カラムと結合する
	@JoinColumn(name="room_id",insertable=false,updatable=false)
	
	//主キーを共有する
	@MapsId("roomId")
	private MeetingRoom meetingRoom;
	
	public ReservableRoom(ReservableRoomId resevableRoomId){
		this.reservableRoomId=resevableRoomId;
	}
	
	public ReservableRoom(){
		
	}
	

}
