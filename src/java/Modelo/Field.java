/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class Field {    
  int idescenario;
  String name;
  String address;
  String phone;
  String schedule;
  String cover;
  String parking;
  String coveredParking;
  String ParkingCost;
  String measurements;
  String Payment;
  String Licoursale;
  String scoreboard;
  String chronometer;
  String dressingRoom;
  String stands;
  String HydrationZone;
  String foodZone;
  ArrayList services;
  ArrayList products;
  
  public Field()
  {
    idescenario = 0;
    name = "";
    address = "";
    phone = "";
    schedule = "";
    cover = "";
    parking = "";
    coveredParking = "";
    ParkingCost = "";
    measurements = "";
    Payment = "";
    Licoursale = "";
    scoreboard = "";
    chronometer = "";
    dressingRoom = "";
    stands = "";
    HydrationZone = "";
    foodZone = "";
  }
  


  public int getIdescenario()
  {
    return idescenario;
  }
  
  public void setIdescenario(int idescenario) {
    this.idescenario = idescenario;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getPhone() {
    return phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  public String getSchedule() {
    return schedule;
  }
  
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }
  
  public String getCover() {
    return cover;
  }
  
  public void setCover(String cover) {
    this.cover = cover;
  }
  
  public String getParking() {
    return parking;
  }
  
  public void setParking(String parking) {
    this.parking = parking;
  }
  
  public String getCoveredParking() {
    return coveredParking;
  }
  
  public void setCoveredParking(String coveredParking) {
    this.coveredParking = coveredParking;
  }
  
  public String getParkingCost() {
    return ParkingCost;
  }
  
  public void setParkingCost(String ParkingCost) {
    this.ParkingCost = ParkingCost;
  }
  
  public String getMeasurements() {
    return measurements;
  }
  
  public void setMeasurements(String measurements) {
    this.measurements = measurements;
  }
  
  public String getPayment() {
    return Payment;
  }
  
  public void setPayment(String Payment) {
    this.Payment = Payment;
  }
  
  public String getLicoursale() {
    return Licoursale;
  }
  
  public void setLicoursale(String Licoursale) {
    this.Licoursale = Licoursale;
  }
  
  public String getScoreboard() {
    return scoreboard;
  }
  
  public void setScoreboard(String scoreboard) {
    this.scoreboard = scoreboard;
  }
  
  public String getChronometer() {
    return chronometer;
  }
  
  public void setChronometer(String chronometer) {
    this.chronometer = chronometer;
  }
  
  public String getDressingRoom() {
    return dressingRoom;
  }
  
  public void setDressingRoom(String dressingRoom) {
    this.dressingRoom = dressingRoom;
  }
  
  public String getStands() {
    return stands;
  }
  
  public void setStands(String stands) {
    this.stands = stands;
  }
  
  public String getHydrationZone() {
    return HydrationZone;
  }
  
  public void setHydrationZone(String HydrationZone) {
    this.HydrationZone = HydrationZone;
  }
  
  public String getFoodZone() {
    return foodZone;
  }
  
  public void setFoodZone(String foodZone) {
    this.foodZone = foodZone;
  }
  
  public ArrayList getServices() {
    return services;
  }
  
  public void setServices(ArrayList services) {
    this.services = services;
  }
  
  public ArrayList getProducts() {
    return products;
  }
  
  public void setProducts(ArrayList products) {
    this.products = products;
  }
}