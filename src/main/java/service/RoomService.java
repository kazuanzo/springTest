package service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.ReservableRoomRepository;
import model.ReservableRoom;

@Service
@Transactional
public class RoomService {

	@Autowired
	ReservableRoomRepository reservableRoomRepository;
	
	public List<ReservableRoom>findReservableRooms(LocalDate date){
		return reservableRoomRepository.findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(date);
		
	}
	
}
