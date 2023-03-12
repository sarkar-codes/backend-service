package com.bezkoder.spring.jpa.h2.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "checkInDb")
public class CheckInDB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long checkInId;

    @Column(name = "roomType")
    private RoomType roomType;

    @Column(name = "numberOfRooms")
    private Integer numberOfRooms;

    @Column(name = "roomNumber")
    private Integer roomNumber;

    @Column(name = "reservationNumber")
    private Integer reservationNumber;

    @Column(name = "bookingDate")
    private String bookingDate;

    @Column(name = "extraBed")
    private boolean extraBed;

    @Column(name = "mealPlan")
    private MealPlan mealPlan;

    @Column(name = "arrivalDate")
    private String arrivalDate;

    @Column(name = "nights")
    private String nights;

    @Column(name = "departureDate")
    private String departureDate;

    @Column(name = "roomRate")
    private String roomRate;

    @Column(name = "discountAmount")
    private String discountAmount;

    @Column(name = "paymentType")
    private PaymentType paymentType;

    @Column(name = "gst")
    private String gst;

    @Column(name = "deposit")
    private String deposit;

    @Column(name = "specialRequest")
    private String specialRequest;

    @Column(name = "guestName")
    private String guestName;

    @Column(name = "icNo")
    private Integer icNo;

    @Column(name = "phoneNumber")
    private Integer phoneNumber;


    @Column(name= "Company")
    private String Company;

    @Column(name = "Address")
    private String Address;

    @Column(name = "City")
    private String City;

    @Column(name = "State")
    private String State;

    @Column(name = "Zip")
    private Integer Zip;

    @Column(name = "Adults")
    private Integer Adults;

    @Column(name = "Children")
    private Integer Children;

    @Column(name = "CityLedgetAcct")
    private String CityLedgetAcct;

    @Column(name = "GroupId")
    private Integer GroupId;

    @Column(name = "Country")
    private Country Country;

    @Column(name = "AdhaarNo")
    private Long Adhaar;

    @Column(name = "PassportNo")
    private Long PassportNo;

    @Column(name = "VisaNo")
    private Long VisaNo;

    @Column(name = "passportsDateofIssue")
    private String passportsDateofIssue;

    @Column(name = "VisasDateofIssue")
    private String VisasDateofIssue;

    @Column(name = "ArrivedFrom")
    private String ArrivedFrom;

    @Column(name = "Placeofissue")
    private String Placeofissue;

    @Column(name = "PurposedDurationOfStayInHotel")
    private String PurposedDurationOfStayInHotel;

    @Column(name = "timestamp")
    private Timestamp Timestamp;


    public CheckInDB() {

    }

    public CheckInDB(RoomType roomType, Integer numberOfRooms, Integer roomNumber, Integer reservationNumber, String bookingDate, boolean extraBed, MealPlan mealPlan, String arrivalDate, String nights, String departureDate, String roomRate, String discountAmount, PaymentType paymentType, String gst, String deposit, String specialRequest) {
        this.roomType = roomType;
        this.numberOfRooms = numberOfRooms;
        this.roomNumber = roomNumber;
        this.reservationNumber = reservationNumber;
        this.bookingDate = bookingDate;
        this.extraBed = extraBed;
        this.mealPlan = mealPlan;
        this.arrivalDate = arrivalDate;
        this.nights = nights;
        this.departureDate = departureDate;
        this.roomRate = roomRate;
        this.discountAmount = discountAmount;
        this.paymentType = paymentType;
        this.gst = gst;
        this.deposit = deposit;
        this.specialRequest = specialRequest;
        this.guestName = guestName;
        this.icNo = icNo;
        this.phoneNumber = phoneNumber;
        this.Company = Company;
        this.Address = Address;
        this.City = City;
        this.State = State;
        this.Zip = Zip;
        this.Adults = Adults;
        this.Children = Children;
        this.CityLedgetAcct = CityLedgetAcct;
        this.GroupId = GroupId;
        this.Country = Country;
        this.Adhaar = Adhaar;
        this.PassportNo = PassportNo;
        this.VisaNo = VisaNo;
        this.passportsDateofIssue = passportsDateofIssue;
        this.VisasDateofIssue = VisasDateofIssue;
        this.ArrivedFrom = ArrivedFrom;
        this.Placeofissue = Placeofissue;
        this.PurposedDurationOfStayInHotel = PurposedDurationOfStayInHotel;

    }

    public long getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(long checkInId) {
        this.checkInId = checkInId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(Integer reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public boolean isExtraBed() {
        return extraBed;
    }

    public void setExtraBed(boolean extraBed) {
        this.extraBed = extraBed;
    }

    public MealPlan getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getNights() {
        return nights;
    }

    public void setNights(String nights) {
        this.nights = nights;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(String roomRate) {
        this.roomRate = roomRate;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {this.guestName = guestName;}

    public Integer getIcNo() {
        return icNo;
    }

    public void setIcNo(Integer icNo) {
        this.icNo = icNo;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {

        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Integer getZip() {
        return Zip;
    }

    public void setZip(Integer zip) {
        Zip = zip;
    }

    public Integer getAdults() {
        return Adults;
    }

    public void setAdults(Integer adults) {
        Adults = adults;
    }

    public Integer getChildren() {
        return Children;
    }

    public void setChildren(Integer children) {
        Children = children;
    }

    public String getCityLedgetAcct() {
        return CityLedgetAcct;
    }

    public void setCityLedgetAcct(String cityLedgetAcct) {
        CityLedgetAcct = cityLedgetAcct;
    }

    public Integer getGroupId() {
        return GroupId;
    }

    public void setGroupId(Integer groupId) {
        GroupId = groupId;
    }

    public Country getCountry() {
        return Country;
    }



    public void setCountry(Country country) {
        Country = country;
    }

    public Long getAdhaar() {
        return Adhaar;
    }

    public void setAdhaar(Long adhaar) {
        Adhaar = adhaar;
    }

    public Long getPassportNo() {
        return PassportNo;
    }

    public void setPassportNo(Long passportNo) {
        PassportNo = passportNo;
    }

    public Long getVisaNo() {
        return VisaNo;
    }

    public void setVisaNo(Long visaNo) {
        VisaNo = visaNo;
    }

    public String getPassportsDateofIssue() {
        return passportsDateofIssue;
    }

    public void setPassportsDateofIssue(String passportsDateofIssue) {
        this.passportsDateofIssue = passportsDateofIssue;
    }

    public String getVisasDateofIssue() {
        return VisasDateofIssue;
    }

    public void setVisasDateofIssue(String visasDateofIssue) {
        VisasDateofIssue = visasDateofIssue;
    }

    public String getArrivedFrom() {
        return ArrivedFrom;
    }

    public void setArrivedFrom(String arrivedFrom) {
        ArrivedFrom = arrivedFrom;
    }

    public String getPlaceofissue() {
        return Placeofissue;
    }

    public void setPlaceofissue(String placeofissue) {
        Placeofissue = placeofissue;
    }

    public String getPurposedDurationOfStayInHotel() {
        return PurposedDurationOfStayInHotel;
    }

    public void setPurposedDurationOfStayInHotel(String purposedDurationOfStayInHotel) {
        PurposedDurationOfStayInHotel = purposedDurationOfStayInHotel;
    }

    public java.sql.Timestamp getTimestamp() {
        return Timestamp;
    }

    @Override
    public String toString() {
        return "CheckInDB{" +
                "checkInId=" + checkInId +
                ", roomType=" + roomType +
                ", numberOfRooms=" + numberOfRooms +
                ", roomNumber=" + roomNumber +
                ", reservationNumber=" + reservationNumber +
                ", bookingDate='" + bookingDate + '\'' +
                ", extraBed=" + extraBed +
                ", mealPlan=" + mealPlan +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", nights='" + nights + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", roomRate='" + roomRate + '\'' +
                ", discountAmount='" + discountAmount + '\'' +
                ", paymentType=" + paymentType +
                ", gst='" + gst + '\'' +
                ", deposit='" + deposit + '\'' +
                ", specialRequest='" + specialRequest + '\'' +
                ", guestName='" + guestName + '\'' +
                ", icNo=" + icNo +
                ", phoneNumber=" + phoneNumber +
                ", Company='" + Company + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zip=" + Zip +
                ", Adults=" + Adults +
                ", Children=" + Children +
                ", CityLedgetAcct='" + CityLedgetAcct + '\'' +
                ", GroupId=" + GroupId +
                ", Country=" + Country +
                ", Adhaar=" + Adhaar +
                ", PassportNo=" + PassportNo +
                ", VisaNo=" + VisaNo +
                ", passportsDateofIssue='" + passportsDateofIssue + '\'' +
                ", VisasDateofIssue='" + VisasDateofIssue + '\'' +
                ", ArrivedFrom='" + ArrivedFrom + '\'' +
                ", Placeofissue='" + Placeofissue + '\'' +
                ", PurposedDurationOfStayInHotel='" + PurposedDurationOfStayInHotel + '\'' +
                '}';
    }
}
