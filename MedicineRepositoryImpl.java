package org.medicinepharma.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.medicinepharma.admin.config.DBConfig;
import org.medicinepharma.admin.model.MedicineModel;

public class MedicineRepositoryImpl extends DBConfig implements MedicineRepository  {
	ArrayList<MedicineModel> list;
	@Override
	public boolean isAddcompanyName(MedicineModel model) {
		try {
		stmt=conn.prepareStatement("insert into companyname values('0',?)");
		stmt.setString(1, model.getCompanyName());
		int value=stmt.executeUpdate();
		return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error is"+ex);
			return false;
		}
		
	}

	@Override
	public List<MedicineModel> getAllCompanyName() {
		try {
			list = new ArrayList<MedicineModel>();
			stmt=conn.prepareStatement("select *from companyname");
			rs=stmt.executeQuery();
			while(rs.next()) {
				MedicineModel model=new MedicineModel();
				model.setCompanyId(rs.getInt(1));
				model.setCompanyName(rs.getString(2));
				list.add(model);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex) {
			System.out.println("Error is"+ex);
			return null;
		}
		
	}

	@Override
	public boolean isDeleteCompanyNameById(int cid) {
		try {
			stmt=conn.prepareStatement("delete from companyname where compid=?");
			stmt.setInt(1,cid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}catch(Exception ex) {
			System.out.println("Error is"+ex);
			return false;
		}
		
	}

	@Override
	public boolean isUpdateCompanyName(MedicineModel model) {
		try {
			System.out.println(model.getCompanyId()+"\t"+model.getCompanyName());
			stmt=conn.prepareStatement("update companyname set cmpname=? where compid=?" );//it is database column name cmpname=? and coloumnid compid=?
			stmt.setString(1, model.getCompanyName());
			stmt.setInt(2, model.getCompanyId());	
			int value=stmt.executeUpdate();
		    return value>0?true:false;
		}catch(Exception ex) {
			System.out.println("Error is"+ex);
			return false;
		}
		
	}

	

}
