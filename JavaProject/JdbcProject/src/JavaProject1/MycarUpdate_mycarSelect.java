//package JavaProject1;
//
//import java.awt.Container;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Vector;
//
//import javax.swing.JFrame;
//
//import oracleDb.DbConnect;
//
//public class MycarUpdate_mycarSelect extends JFrame{
//
//	DbConnect db=new DbConnect();
//	Jdbc_Car jcar=new Jdbc_Car();
//	
//	public void mycarUpdateInsert() {
//		jcar.selectCar();
//		
//		String car_fuel=jcar.model.getValueAt(1, 3);
//		
//		Connection conn=db.getOracle();
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		
//		String sql="select * from car where ";
//		
//		conn=db.getOracle();
//		try {
//			pstmt=conn.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			
//				
////				data1.add(rs.getString("car_fuel"));
////				data1.add(rs.getString("car_fe"));
////				data1.add(rs.getString("car_op"));
////				data1.add(rs.getString("car_dis"));
////				data1.add(rs.getString("car_en"));
////				data1.add(rs.getString("car_sh"));
////				data1.add(rs.getString("car_size"));
////				data1.add(rs.getString("car_price"));
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			db.dbClose(rs, pstmt, conn);
//		}
//	}
////	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////
////	}
//
//}
