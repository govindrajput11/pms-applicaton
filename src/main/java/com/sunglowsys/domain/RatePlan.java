package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rate_Plan")
public class RatePlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "hotel_Id")
    private Long hotelId;

    @Column(name = "room_type_id")
    private Long roomTypeId;

    public RatePlan() {
    }

    public RatePlan(String name, Long hotelId, Long roomTypeId) {
        this.name = name;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        RatePlan ratePlan = (RatePlan) o;
        return Objects.equals(id, ratePlan.id) && Objects.equals(name, ratePlan.name) && Objects.equals(hotelId, ratePlan.hotelId) && Objects.equals(roomTypeId, ratePlan.roomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hotelId, roomTypeId);
    }

    @Override
    public String toString() {
        return "RatePlan{" +
                "name='" + name + '\'' +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }
}
