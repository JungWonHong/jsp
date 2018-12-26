/*
	DAO(Data Access Object) Ŭ����
	- ������ ���̽��� �����Ͽ� ���ڵ��� �߰�, ����, ���� �۾��� �̷������ Ŭ���� �Դϴ�.
	- � Action Ŭ������ ȣ��Ǵ��� �׿� �ش��ϴ� ������ ���̽� ���� ó����
	  DAO Ŭ�������� �̷������ �˴ϴ�.
 */
package ch12.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	DataSource ds;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	// �����ڿ��� JNDI ���ҽ��� �����Ͽ� Connection ��ü�� ���ɴϴ�.
	public MemberDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB ���� ���� : " + ex);
			return;
		}
	}
	
	public void member_delete(String id){
		try {
			con = ds.getConnection();
			System.out.println("getConnection");
			
			String sql = "delete from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			if(pstmt != null)
				try {
					pstmt.close();
				} catch(SQLException e) {
				}
			if(con != null)
				try {
					con.close();
				} catch(SQLException e) {
				}
		}
		
	}
	
	public Member member_info(String id){
		Member m = new Member();
		try {
			con = ds.getConnection();
			System.out.println("getConnection");
			
			String sql = "select * from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				m.setId(rs.getString(1));
				m.setPassword(rs.getString(2));
				m.setName(rs.getString(3));
				m.setAge(rs.getInt(4));
				m.setGender(rs.getString(5));
				m.setEmail(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
		return m;
	}
	
	public List<Member> getList(){
		List<Member> list = new ArrayList<Member>();
		try {
			con = ds.getConnection();
			System.out.println("getConnection");
			
			String sql = "select * from member";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member data = new Member();
				data.setId(rs.getString(1));
				data.setPassword(rs.getString(2));
				data.setName(rs.getString(3));
				data.setAge(rs.getInt(4));
				data.setGender(rs.getString(5));
				data.setEmail(rs.getString(6));
				list.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
		
		return list;
	}
	
	public int isId(String id) {
		try {
			con = ds.getConnection();
			System.out.println("getConnection");
			
			String sql = "select id from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				result = 1; //���̵��  ��ġ�ϴ� ���
			} else {
				result = -1; //���̵� �������� �ʴ� ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
		
		return result;
	}
	
	public int isId(String id, String pass) {
		try {
			con = ds.getConnection();
			System.out.println("getConnection");
			
			String sql = "select id, password from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				if(rs.getString(2).equals(pass)) {
					result = 1; //���̵�� ��й�ȣ ��ġ�ϴ� ���
				} else {
					result = 0; //��й�ȣ�� ��ġ���� �ʴ� ���
				}
			} else {
				result = -1; //���̵� �������� �ʴ� ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
		
		return result;
	}
	
	public int insert(Member m) {
		try {
			con = ds.getConnection();
			System.out.println("getConnection");
			
			String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getName());
			pstmt.setInt(4, m.getAge());
			pstmt.setString(5, m.getGender());
			pstmt.setString(6, m.getEmail());
			
			result = pstmt.executeUpdate(); //�μ�Ʈ�� �Ǹ� �μ�Ʈ�� row�� 1�� ����, �ƴϸ� 0�� ����
		} catch (Exception e){
			System.out.println("insert failed");
			e.printStackTrace();
		} finally {
			if(pstmt != null)
				try {
					pstmt.close();
				} catch(SQLException e) {
				}
			if(con != null)
				try {
					con.close();
				} catch(SQLException e) {
				}
		}
		
		return result;
	}

}