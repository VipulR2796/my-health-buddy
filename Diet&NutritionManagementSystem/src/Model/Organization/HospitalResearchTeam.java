/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Database.DBconnection;
import Model.Enterprise.NGO.NGODirectory;
import Model.People.PersonDirectory;
import Model.Utilities.UtilityFunctions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vipul
 */
public class HospitalResearchTeam {
    
    
    public void sendHospitalDataToNGO(String name, int diabetes, int bp, int cholesterol, int weightloss, int weightgain, int core, String ngo){
    
        Connection dbconn = DBconnection.connectDB();
        try {
            
//            PreparedStatement query = (PreparedStatement)dbconn.prepareStatement("")
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("INSERT INTO researchdata (hospital,diabetes, bp, cholesterol, weightloss, weightgain, core, ngo_name) VALUES(?,?,?,?,?,?,?,?)");
            st.setString(1, name);
            st.setInt(2, diabetes);
            st.setInt(3, bp);
            st.setInt(4, cholesterol);
            st.setInt(5, weightloss);
            st.setInt(6, weightgain);
            st.setInt(7, core);
            st.setString(8, ngo);
            
            int res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HospitalResearchTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public List<String> getAllHospitals(String ngo){
        List<String> list = new ArrayList<String>();
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select Hospital  
                                                            from researchdata where ngo_name=? 
                                                            """);
            st.setString(1, ngo);
            ResultSet res = st.executeQuery();
            
            
            while(res.next()){
                list.add(res.getString("Hospital"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HospitalResearchTeam.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return list;
    }
    
    public void addNewDietitianToDB(String name, Date dob, int age, String gender, long phNumber, String address, Date doj, int experience, String qualification, int slotsAvailable, String associatedHospital, String type, String email){
    
        Connection dbconn = DBconnection.connectDB();
        try {
            
//            PreparedStatement query = (PreparedStatement)dbconn.prepareStatement("")
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("INSERT INTO dietitians(Name, DOB, Age, Gender, Contact, Address, DOJ, Experience, Qualification, Hospital, Type, Slots, Email) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, name);
            st.setDate(2, new UtilityFunctions().convertFromJAVADateToSQLDate(dob));
            st.setInt(3, age);
            st.setString(4,gender);
            st.setLong(5, phNumber);
            st.setString(6, address);
            st.setDate(7, new UtilityFunctions().convertFromJAVADateToSQLDate(doj));
            st.setInt(8, experience);
            st.setString(9, qualification);
            st.setString(10, associatedHospital);
            st.setString(11, type);
            st.setInt(12, slotsAvailable);
            st.setString(13, email);
            
            int res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
