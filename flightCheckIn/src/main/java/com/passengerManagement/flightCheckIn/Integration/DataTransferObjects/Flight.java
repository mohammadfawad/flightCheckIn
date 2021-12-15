/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passengerManagement.flightCheckIn.Integration.DataTransferObjects;

import java.util.Date;
/**
 *
 * @author spring
 */
public class Flight {

	private Integer flightId;
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Date estimatedDepartureTime;

	public Flight() {
	}

	public Flight(Integer flightId) {
		this.flightId = flightId;
	}

	public Flight(Integer flightId, String flightNumber, String operatingAirlines, String departureCity,
			String arrivalCity, Date dateOfDeparture, Date estimatedDepartureTime) {
		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.operatingAirlines = operatingAirlines;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Date getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Date estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (flightId != null ? flightId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Flight)) {
			return false;
		}
		Flight other = (Flight) object;
		if ((this.flightId == null && other.flightId != null)
				|| (this.flightId != null && !this.flightId.equals(other.flightId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flight [flightId=");
		builder.append(flightId);
		builder.append(", flightNumber=");
		builder.append(flightNumber);
		builder.append(", operatingAirlines=");
		builder.append(operatingAirlines);
		builder.append(", departureCity=");
		builder.append(departureCity);
		builder.append(", arrivalCity=");
		builder.append(arrivalCity);
		builder.append(", dateOfDeparture=");
		builder.append(dateOfDeparture);
		builder.append(", estimatedDepartureTime=");
		builder.append(estimatedDepartureTime);
		builder.append(", reservationCollection=");
		builder.append("]");
		return builder.toString();
	}

}
