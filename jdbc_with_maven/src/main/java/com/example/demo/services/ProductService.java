package com.example.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.*;
public class ProductService {
	
	private Connection con;

	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	public int updatePriceByName(String productName,double newPrice) {
		int rowsUpdated=0;
		String sql="update punnya_product set price=? where product_Name=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			pstmt.setDouble(1,newPrice);
			pstmt.setString(2,productName.trim());
			
		 rowsUpdated=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return rowsUpdated;
	}
	public int deleteById(int id) {
		int rowsDeleted=0;
		String sql="delete from punnya_product where product_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			pstmt.setInt(1,id);
			
		 rowsDeleted=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowsDeleted;
	}
	
	public Optional<Product> findById(int id){
		Optional<Product> obj=Optional.empty();
		String sql="select * from punnya_product where product_id=?";
		
try(PreparedStatement pstmt=con.prepareStatement(sql)){
	pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int productId=rs.getInt("product_Id");
				String productName=rs.getString("product_Name");
				double price=rs.getDouble("price");
				Product prod=new Product(productId,productName,price);
				obj=Optional.of(prod);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
        return obj;
		
		
	}
	
	
	
	public int addProduct(Product product) {
		int rowAdded=0;
		String sql="insert into punnya_product values(?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			pstmt.setInt(1,product.getProductId());
			pstmt.setString(2,product.getProductName());
			pstmt.setDouble(3,product.getPrice());
		 rowAdded=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}
	public List<Product>findAll(){
		List<Product> productList=new ArrayList<Product>();
		
		String sql="select * from punnya_product";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int productId=rs.getInt("product_Id");
				String productName=rs.getString("product_Name");
				double price=rs.getDouble("price");
				Product prod=new Product(productId,productName,price);
				productList.add(prod);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return productList;
		
	}
	public int  usingTxn(Product prd1,Invoice invoice) {
		int rowAdded =0;
		//g int productAddCount = 0;
		
		String  addProductsql = "insert into punnya_product values(?,?,?)";
		String addInvoicesql = "insert into punnya_invoice\r\n" + 
				" values(?,?,?,?)";
		try(PreparedStatement prodstmt = con.prepareStatement(addProductsql);
				PreparedStatement invpstmt = con.prepareStatement(addInvoicesql)){
			
			con.setAutoCommit(false);
			
			prodstmt.setInt(1,prd1.getProductId());
			prodstmt.setString(2,prd1.getProductName());
			prodstmt.setDouble(3, prd1.getPrice());
			
			int  productAddCount = prodstmt.executeUpdate();
			
			invpstmt.setInt(1, invoice.getInvoiceNumber());
			invpstmt.setString(2, invoice.getCustomerName());
			invpstmt.setDouble(3, invoice.getQuality());
			invpstmt.setInt(4, invoice.getProductref());
			
	     invpstmt.executeUpdate();
			
			con.commit();
			rowAdded = productAddCount;
			// g System.out.println("===================");
			System.out.println(rowAdded);
			
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return  rowAdded;
	}
}
	
	
	
	
			
			

			
			
			
		
		
	


