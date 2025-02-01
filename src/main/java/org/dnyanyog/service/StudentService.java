package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dnyanyog.common.DBUtils;

public class StudentService {
	public List<String> getFullName(){
		List<String> info = new ArrayList<>();
		
		try {
			ResultSet rs = DBUtils.executeSelectQuery("select * from student");
			
			while(rs.next()) {
				info.add(rs.getString(1));
				info.add(rs.getString(2));
				info.add(rs.getString(3));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return info;
		
	}

}
