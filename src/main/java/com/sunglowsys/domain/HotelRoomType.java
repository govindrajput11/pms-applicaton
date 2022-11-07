package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotelRoomType")
public class HotelRoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_Id", nullable = false,unique = true)
    private Long hotelId;

    @Column(name = "roomTypeId", nullable = false, unique = true)
    private Long roomTypeId;

    public HotelRoomType() {
    }

    public HotelRoomType(Long hotelId, Long roomTypeId) {
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRoomType that = (HotelRoomType) o;
        return Objects.equals(hotelId, that.hotelId) && Objects.equals(roomTypeId, that.roomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelId, roomTypeId);
    }

    @Override
    public String toString() {
        return "HotelRoomType{" +
                "hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }
}
