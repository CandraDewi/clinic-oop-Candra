/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candramanikadewi.unguided.entities;

/**
 *
 * @author REDMI
 */
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String id;
    private String name;
    private String specialty;
    private List<Appointment> appointments; // Relasi ke Appointment

    public Doctor(String id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.appointments = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialty() { return specialty; }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}