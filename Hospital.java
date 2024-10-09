package service1;
import java.util.HashMap;
import java.util.Map;

import entity.*;
import hospitalManagement.Doctor;
import hospitalManagement.Patient;
public class Hospital {
  HashMap<String,Patient> patients;
  HashMap<String,Doctor> doctors;
  public void addPatient(Patient patient) {
	  patients.put(patient.getPatientId(), patient );
	  
  }
  public void removePatient(String patientId) {
	  patients.remove(patientId);
  }
  public void updatePatient(String patientId,Patient p) {
	  patients.replace(patientId, p);
  }
  public  void displayAllPatient() {
	  for(Patient p:patients.values())
	  {
		  System.out.println(p);
	  }
  }
  public Patient getPatient(String patientId) {
	  return patients.get(patientId);
  }
  public void addDoctor(Doctor doctors) {
	   doctors.put(doctor.getDoctorId(), doctor );
	  
  }
  public void removeDoctor(String doctorId) {
	  doctors.remove(doctorId);
  }
  public void updateDoctor(String doctorId ,Doctor d) {
	  doctors .remove(doctorId, d);
  }
  public  void displayAllDoctor() {
	  for(Doctor d:doctors.values())
	  {
		  System.out.println(d);
	  }
  }
  public Doctor getDoctor(String doctorId ) {
	  return doctors.get(doctorId);
  }
 
}
