package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel_rate_calendar")
public class HotelRateCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "single_Occupancy")
    private float singleOccupancy;

    @Column(name = "double_occupancy")
    private  float doubleOcuupancy;

    @Column(name = "extra_adult_price")
    private  float extraAdultPrice;

    @Column(name = "applicable_days")
    private  int applicableDays;

    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "hotel_room_type_rateId")
    private Long hoteRoomTypeRateId;

    public HotelRateCalendar() {
    }

    public HotelRateCalendar(float singleOccupancy, float doubleOcuupancy, float extraAdultPrice, int applicableDays, Long hotelId, Long hoteRoomTypeRateId) {
        this.singleOccupancy = singleOccupancy;
        this.doubleOcuupancy = doubleOcuupancy;
        this.extraAdultPrice = extraAdultPrice;
        this.applicableDays = applicableDays;
        this.hotelId = hotelId;
        this.hoteRoomTypeRateId = hoteRoomTypeRateId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getSingleOccupancy() {
        return singleOccupancy;
    }

    public void setSingleOccupancy(float singleOccupancy) {
        this.singleOccupancy = singleOccupancy;
    }

    public float getDoubleOcuupancy() {
        return doubleOcuupancy;
    }

    public void setDoubleOcuupancy(float doubleOcuupancy) {
        this.doubleOcuupancy = doubleOcuupancy;
    }

    public float getExtraAdultPrice() {
        return extraAdultPrice;
    }

    public void setExtraAdultPrice(float extraAdultPrice) {
        this.extraAdultPrice = extraAdultPrice;
    }

    public int getApplicableDays() {
        return applicableDays;
    }

    public void setApplicableDays(int applicableDays) {
        this.applicableDays = applicableDays;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getHoteRoomTypeRateId() {
        return hoteRoomTypeRateId;
    }

    public void setHoteRoomTypeRateId(Long hoteRoomTypeRateId) {
        this.hoteRoomTypeRateId = hoteRoomTypeRateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRateCalendar that = (HotelRateCalendar) o;
        return Float.compare(that.singleOccupancy, singleOccupancy) == 0 && Float.compare(that.doubleOcuupancy, doubleOcuupancy) == 0 && Float.compare(that.extraAdultPrice, extraAdultPrice) == 0 && applicableDays == that.applicableDays && Objects.equals(id, that.id) && Objects.equals(hotelId, that.hotelId) && Objects.equals(hoteRoomTypeRateId, that.hoteRoomTypeRateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, singleOccupancy, doubleOcuupancy, extraAdultPrice, applicableDays, hotelId, hoteRoomTypeRateId);
    }

    @Override
    public String toString() {
        return "HotelRateCalendar{" +
                "id=" + id +
                ", singleOccupancy=" + singleOccupancy +
                ", doubleOcuupancy=" + doubleOcuupancy +
                ", extraAdultPrice=" + extraAdultPrice +
                ", applicableDays=" + applicableDays +
                ", hotelId=" + hotelId +
                ", hoteRoomTypeRateId=" + hoteRoomTypeRateId +
                '}';
    }
}
