package com.sg.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Model {

	private String tacctno;
	private String amt;
	private String name;
	private String acctno;
	private String balance; 
	private String custid;
	private String pswd;
	private String email;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	ArrayList al = new ArrayList();
	ArrayList al1 = new ArrayList();
	ArrayList al2 = new ArrayList();
	
	public String getAcctno() {
		return acctno;
	}
	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTacctno() {
		return tacctno;
	}
	public void setTacctno(String tacctno) {
		this.tacctno = tacctno;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public Model()
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "111998");
			System.out.println("connection established");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public boolean login()
	{
		try
		{
			pstmt=con.prepareStatement("select * from bankapp where custid=? and pswd=?");
			pstmt.setString(1, custid);
			pstmt.setString(2, pswd);
			res=pstmt.executeQuery();
			if(res.next()==true)
			{
				acctno = res.getString("ACCTNO");
				name=res.getString("name");
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public boolean checkBalance()
	{
		try
		{
			pstmt=con.prepareStatement("select * from bankapp where acctno=?");
			pstmt.setString(1, acctno);
			res=pstmt.executeQuery();
			if(res.next()==true)
			{
				balance = res.getString("balance");
				return true;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public boolean changePswd()
	{
		try
		{
			pstmt=con.prepareStatement("update bankapp set pswd=? where acctno=?");
			pstmt.setString(1, pswd);
			pstmt.setString(2, acctno);
			int row=pstmt.executeUpdate();
			if(row==0)
			{
				return false; 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public boolean transfer() 
	{
		try
		{
			pstmt=con.prepareStatement("update bankapp set balance=balance-? where acctno=?");
			pstmt.setString(1, amt);
			pstmt.setString(2, acctno);
			int row=pstmt.executeUpdate();
			pstmt=con.prepareStatement("Insert INTO BANKSTATEMENT1 Values(?,?,?)");
			pstmt.setString(1, acctno);
			pstmt.setString(2, tacctno);
			pstmt.setString(3, amt);
			pstmt.executeUpdate();
			if(row==0)
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;	
	}
	public ArrayList getStatement()
	{	
		try 
		{
			pstmt=con.prepareStatement("select * from bankstatement1 where acctno=?");
			pstmt.setString(1, acctno);
			res=pstmt.executeQuery();
			if(res.next()==true)
			{
				amt=res.getString("AMOUNT");
				al.add(amt);
				acctno=res.getString("ACCTNO");
				al1.add(acctno);
				tacctno=res.getString("TOACCTNO");
				al2.add(tacctno);	
			}		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}
	public boolean forgotPswd()
	{
		try
		{
			pstmt=con.prepareStatement("update bankapp set pswd=? where email=?");
			pstmt.setString(1, pswd);
			pstmt.setString(2, email);
			int row=pstmt.executeUpdate();
			if(row==0) {
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public boolean hLoan()
	{
		try
		{
			pstmt=con.prepareStatement("select * from bankapp where acctno=?");
			pstmt.setString(1, acctno);
			res= pstmt.executeQuery();
			if(res.next()==true)
			{
				name = res.getString("name");
				return true;
			}		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public boolean cLoan()
	{
		try
		{
			pstmt=con.prepareStatement("select * from bankapp where acctno=?");
			pstmt.setString(1, acctno);
			res=pstmt.executeQuery();
			if(res.next()==true)
			{
				name=res.getString("name");
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;	
	}
}
