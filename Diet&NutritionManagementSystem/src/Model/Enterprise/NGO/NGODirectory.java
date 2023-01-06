/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise.NGO;

import Model.Database.DBconnection;
import Model.Organization.ProductDirectory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vipul
 */
public class NGODirectory {
    
    public List<String> getAllNGOs(){
        List<String> list = new ArrayList<String>();
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select ngo_name  
                                                            from ngo 
                                                            """);

            ResultSet res = st.executeQuery();
            
            
            while(res.next()){
                list.add(res.getString("ngo_name"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NGODirectory.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return list;
    }
    
    public String getOverallHospitals(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(distinct Hospital) as cnt 
                                                            from dietitians
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getOverallDietitians(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(Name) as cnt 
                                                            from dietitians
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getResearchDietitians(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(Name) as cnt from dietitians 
                                                            where type = 'Research'
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getDiabetesUsers(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Diebetes Control'
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getBPUsers(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'BP Control'
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getCholestrolUsers(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Cholestrol Control'
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }


    public String getWeightLossUsers(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Weight Loss'
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getWeightGainUsers(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Weight Gain'
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getCoreUsers(){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Core Strengthening'
                                                            """);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    
    public String getDiabetesUsersForHospital(String hospital){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Diebetes Control' AND a.hospital =?
                                                            """);
            st.setString(1, hospital);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getBPUsersForHospital(String hospital){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'BP Control' AND a.hospital =?
                                                            """);
            st.setString(1, hospital);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getCholestrolUsersForHospital(String hospital){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Cholestrol Control' AND a.hospital =?
                                                            """);
            st.setString(1, hospital);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }


    public String getWeightLossUsersForHospital(String hospital){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Weight Loss' AND a.hospital =?
                                                            """);
            st.setString(1, hospital);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getWeightGainUsersForHospital(String hospital){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Weight Gain' AND a.hospital =?
                                                            """);
            st.setString(1, hospital);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
    
    public String getCoreUsersForHospital(String hospital){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            select count(*) as cnt from appointments a 
                                                            inner join end_users b on a.userName = b.Name 
                                                            where Purpose = 'Core Strengthening' AND a.hospital =?
                                                            """);
            st.setString(1, hospital);
            ResultSet res = st.executeQuery();
            if (res.next()){
                String val = res.getString(1);
                return val;
            }
            else{
                return "0";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return "0";
        }
    }
}
