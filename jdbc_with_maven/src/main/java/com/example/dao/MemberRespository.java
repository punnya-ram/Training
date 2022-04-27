package com.example.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;

public class MemberRespository implements CrudRepository<Member> {
	private Connection con;

	public  MemberRespository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member member) {
		int addrow=0;
		String sql = "insert into SHANMAMEMBER3 values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1,member.getMemberId());
			pstmt.setString(2,member.getMemberName());
			pstmt.setString(3,member.getMemberAddress());
			//pstmt.setDate(4, member.getAccountOpenDate());
			pstmt.setDate(4,Date.valueOf(member.getAccountOpenDate()));
			pstmt.setString(5,member.getMemberShipType());
			pstmt.setDouble(6, member.getFeesPaid());
			pstmt.setInt(7,member.getMaxBookAllowed());
			pstmt.setDouble(8, member.getPenaltyAmount());
			
			addrow = pstmt.executeUpdate();
		}catch(SQLException e) { 
			e.printStackTrace();
		}
		
		
		return addrow;
	}
	
		
	public List<Member> findAll() {
		List<Member> memberList=new ArrayList<Member>();
		String sql="select * from PUNNYAMEMBER2";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int memberId=rs.getInt("member_Id");
				String memberName=rs.getString("member_Name");
				String memberAddress=rs.getString("member_Address");
				String memberShipType=rs.getString("membership_Type");
				int maxBookAllowed=rs.getInt("MAX_BOOKS_ALLOWED");
				Date accountOpenDate=rs.getDate("ACC_OPEN_DATE");
				LocalDate accDate = accountOpenDate.toLocalDate();
				
				double feespaid=rs.getDouble("fees_paid");
				double penaltyAmountpaid=rs.getDouble("PENALTY_AMOUNT");
				Member memb=new Member(memberId,memberName,memberAddress,memberShipType,maxBookAllowed,accDate,feespaid,penaltyAmountpaid);
				memberList.add(memb);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		return memberList;
	}

	public Member findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updatePriceByname(String memberName,Double newfeesPaid) {
		int rowsUpdated=0;
		String sql="update SHANMAMEMBER3 set fees_paid=? where member_Name=?";
try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			pstmt.setDouble(1,newfeesPaid);
			pstmt.setString(2,memberName);
			
		 rowsUpdated=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return rowsUpdated;
		
		
	}

	@Override
	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
