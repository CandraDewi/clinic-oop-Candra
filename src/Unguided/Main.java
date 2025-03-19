/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package candramanikadewi.unguided;

import candramanikadewi.unguided.entities.Appointment;
import candramanikadewi.unguided.entities.DataChecker;
import candramanikadewi.unguided.entities.DiagnosisCounter;
import candramanikadewi.unguided.entities.Doctor;
import candramanikadewi.unguided.entities.Patient;
import java.time.LocalDate;

/**
 *
 * @author REDMI
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi data dokter
        List<Doctor> doctors = List.of(
            new Doctor("D1", "Dr. Budi Utami", "Mata"),
            new Doctor("D2", "Dr. Agus Darmawan", "Gigi"),
            new Doctor("D3", "Dr. Indah Paramitha", "Othopedi")
        );
        
        // Inisialisasi data pasien
        List<Patient> patients = List.of(
            new Patient("P1", "Krisna", 20),
            new Patient("P2", "Sandi", 21),
            new Patient("P3", "Artha", 22)
        );
        
        // Validasi data pasien
        for (Patient patient : patients) {
            if (!DataChecker.isValidName(patient.getName()) || !DataChecker.isValidAge(patient.getAge())) {
                System.out.println("Data pasien " + patient.getName() + " tidak valid!");
                return;
            }
        }
        
        // Membuat daftar janji 
        List<Appointment> appointments = new ArrayList<>();
        appointments.add(new Appointment(doctors.get(0), patients.get(0), LocalDate.of(2025, 3, 17), "Glukoma"));
        appointments.add(new Appointment(doctors.get(1), patients.get(1), LocalDate.of(2025, 3, 18), "Gigi berlubang"));
        appointments.add(new Appointment(doctors.get(2), patients.get(2), LocalDate.of(2025, 3, 18), "Patah tulang"));
        
        // Menambah total diagnosis
        appointments.forEach(appointment -> DiagnosisCounter.addDiagnosis());
        
        // Menampilkan informasi dokter
        System.out.println("\n---------- DATA DOKTER ----------");
        doctors.forEach(doctor -> System.out.println("ID: " + doctor.getId() + ", Nama: " + doctor.getName() + ", Spesialis: " + doctor.getSpecialty()));
        
        // Menampilkan informasi pasien
        System.out.println("\n---------- DATA PASIEN -----------");
        patients.forEach(patient -> System.out.println("ID: " + patient.getId() + ", Nama: " + patient.getName() + ", Usia: " + patient.getAge()));
        
        // Menampilkan informasi janji temu
        System.out.println("\n------- DATA JANJI --------");
        appointments.forEach(appointment ->
            System.out.println("Dokter: " + appointment.getDoctor().getName() +
                               " -- Pasien: " + appointment.getPatient().getName() +
                               " -- Tanggal: " + appointment.getDate() +
                               " -- Diagnosis: " + appointment.getDiagnosis()));
        
        // Menampilkan total diagnosis
        System.out.println("\nTotal diagnosis yang diberikan: " + DiagnosisCounter.getTotalDiagnoses());
    }
}
