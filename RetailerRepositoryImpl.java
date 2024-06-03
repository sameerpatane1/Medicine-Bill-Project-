package org.medicinepharma.admin.repository;

import java.util.ArrayList;
import java.util.List;
import org.medicinepharma.admin.config.DBConfig;
import org.medicinepharma.admin.model.RetailerModel;

public class RetailerRepositoryImpl extends DBConfig implements RetailerRepository {
	ArrayList<RetailerModel> list;

	@Override
	public boolean isaddRetailer(RetailerModel model) {
		try {
			stmt = conn.prepareStatement("insert into retailer values('0',?,?,?,?)");
			stmt.setString(1, model.getRetName());
			stmt.setString(2, model.getContact());
			stmt.setString(3, model.getAddress());
			stmt.setString(4, model.getEmail());
			int value = stmt.executeUpdate();
			return value > 0 ? true : false;

		} catch (Exception ex) {
			System.out.println("Error is" + ex);
			return false;
		}

	}

	@Override
	public List<RetailerModel> getAllRetailer() {
		try {
			list = new ArrayList<RetailerModel>();
			stmt = conn.prepareStatement("select *from retailer");
			rs = stmt.executeQuery();
			while (rs.next()) {
				RetailerModel model = new RetailerModel();
				model.setRetId(rs.getInt(1));
				model.setRetName(rs.getString(2));
				model.setContact(rs.getString(3));
				model.setAddress(rs.getString(4));
				model.setEmail(rs.getString(5));
				list.add(model);
			}
			return list.size() > 0 ? list : null;
		} catch (Exception ex) {
			System.out.println("Error is" + ex);
			return null;
		}

	}

	@Override
	public boolean isdeleteAllRetailerById(int retid) {
		try {
			stmt = conn.prepareStatement("delete from retailer where retid=?");

			stmt.setInt(1, retid);
			int value = stmt.executeUpdate();
			return value > 0 ? true : false;

		} catch (Exception ex) {
			System.out.println("Error is" + ex);
			return false;
		}
	}

	@Override
	public boolean isupdateRetailer(RetailerModel model) {
		try {
			stmt=conn.prepareStatement("update retailer set retname=?,contact=?,address=?,email=? where retid=?");
			stmt.setString(1, model.getRetName());
			stmt.setString(2, model.getContact());
			stmt.setString(3, model.getAddress());
			stmt.setString(4, model.getEmail());
			stmt.setInt(5,model.getRetId());
			int value=stmt.executeUpdate();
			return value>0?true:false;

		} catch (Exception ex) {
			System.out.println("Error is" + ex);
			return false;
		}
		
	}

}
