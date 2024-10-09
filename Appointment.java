package service1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import hospitalManagement.AppontmentRecord;
public class Appointment {
       ArrayList<AppontmentRecord>appointments;
       Hospital hospital;
       final String logfile="C:\\logfile.txt";
       
       public Appointment(Hospital hospital) {
    	   super();
    	   this.hospital=hospital;
    	   
       }
       public void logAppointmentDetails(String message) {
    	   try {
    		   BufferedWriter=new BufferedWriter(new FileWriter(logfile,true));
    		   
    	   }catch(IOException e) {
    		  System.out.println("error"+e.getMessage());
    	   }
       }
       public void scheduledAppointments(String patientId,String doctorId) {
    	   Doctor doctor=hospital.getDoctor(doctorId);
    	   Patient patient=hospital.getPatient(patientId);
    	   AppontmentRecord appointment=new   AppontmentRecord( String patientId,String doctorId);
    	   appointments.add(appointment);
    	   doctor.setAvilable(false);
    	   
       }
}
