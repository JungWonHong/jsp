<%-- �����ϴ� ������ �Դϴ�.

	include ���þ�(��Ƽ��)
	Ư���� JSP ���� �Ǵ� HTML ������ �ش� JSP�������� ������ ��
	�ֵ��� ����� �����ϴ� ���þ� �Դϴ�.
	include ���þ�� �����Ǿ� ���� �������� ���ԵǴ� JSP���ϵ���
	�� �����̳ʿ� ���� ���ε��� ������ �Ǵ� ���� �ƴ϶� �� �ҽ���
	include ���þ ����� �ش� �������� ����Ǿ� �������� ������
	�� �����̳ʴ� ��ü JSP���ϵ��� �ҽ��� ������ �ϳ��� ���������� �������մϴ�.
	
	���� JSP ���������� ����Ǵ� �κ��� ���� �� �̷��� ����Ǵ� �κ���
	���Ϸ� ����� include ���þ�� �����մϴ�.
 --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<title>include �׽�Ʈ</title>
	</head>
	<body>
		<%@ include file="header.jsp" %>
		<h1> includeTest.jsp �����Դϴ�.</h1>
		<%@ include file="footer.jsp" %>		
	</body>
</html>