/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candramanikadewi.unguided.entities;


/**
 *
 * @author REDMI
 */


import java.time.LocalDate;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDate date;
    private String diagnosis;

    public Appointment(Doctor doctor, Patient patient, LocalDate date, String diagnosis) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.diagnosis = diagnosis;

        this.doctor.addAppointment(this);
        this.patient.addAppointment(this);
    }

    public Doctor getDoctor() { return doctor; }
    public Patient getPatient() { return patient; }
    public LocalDate getDate() { return date; }
    public String getDiagnosis() { return diagnosis; }
}
