package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Util.DBUtil;
import com.model.User;

public class UserDaoImpl {

	private Connection conn;

	public UserDaoImpl() {
		conn = DBUtil.getConnection();
	}
	

	public static int save(User u) {
		int status = 0;
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into users(username,password) values (?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());

			status = ps.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
	
	public static int update(User u){  
        int status=0;  
        try{  
        	Connection con = DBUtil.getConnection(); 
            PreparedStatement ps=con.prepareStatement(  
                         "update users set name=?,surname=?,phone=?,address=?,age=? where username=?");  
            ps.setString(1,u.getName());  
            ps.setString(2,u.getSurname());  
            ps.setString(3,u.getPhone());  
            ps.setString(4,u.getAddress());  
            ps.setString(5,u.getAge()); 
            ps.setString(6,u.getUsername());
              
            status = ps.executeUpdate();  
              
            //con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }
	public static int delete(User u){  
        int status=0;  
        try{  
        	Connection con = DBUtil.getConnection(); 
            PreparedStatement ps=con.prepareStatement(  
                         "update users set name=?,surname=?,phone=?,address=?,age=? where username=?");  
             
            ps.setString(1,u.getName());  
            ps.setString(2,u.getSurname());  
            ps.setString(3,u.getPhone());  
            ps.setString(4,u.getAddress());  
            ps.setString(5,u.getAge()); 
            ps.setString(6,u.getUsername());
              
            status = ps.executeUpdate();  
              
            //con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }

	public static boolean checkUser(String username, String password) {
		boolean st = false;
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			st = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	
	public static User getUserById(String username){  
		User e = new User();  
          
        try{  
        	Connection con = DBUtil.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from users where username=?");  
            ps.setString(1,username);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setUsername(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setName(rs.getString(4));  
                e.setSurname(rs.getString(5));  
                e.setPhone(rs.getString(6)); 
                e.setAddress(rs.getString(7)); 
                e.setAge(rs.getString(8)); 
            }  
            //con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    } 

}
