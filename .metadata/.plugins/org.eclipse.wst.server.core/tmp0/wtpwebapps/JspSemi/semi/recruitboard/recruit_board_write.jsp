<%-- 글쓰기 폼 페이지 --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ page import="semi.db.bean.*" %>
<%@ page import="semi.db.*" %>
<%
	request.setCharacterEncoding("euc-kr");
	List<EListBean> elist = (ArrayList<EListBean>)request.getAttribute("elist");
%>
<html>
<head>
<title>MVC 게시판</title>
<script src="./js/jquery-3.2.1.js"></script>
<script src="./js/rcwrite.js"></script>
<link href="./css/board.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<jsp:include page="../Header.jsp"></jsp:include>
	<jsp:include page="../menubar.jsp"></jsp:include>
	<form action="RecruitAddAction.bo" method="post" name="boardform">

		<table>
			<tr class="center">
				<th colspan="2">채용게시판 write</th>
			</tr>
			<tr>
				<td>
					<div>기업명</div>
				</td>
				<td><!-- <input id="rc_company" name="rc_company" type="text" value=""> -->
					<select id="rc_company" name="rc_company">
						<option value="">선택하세요</option>
						<%for(EListBean e : elist){ %>
						<option value="<%=e.getEl_company() %>"><%=e.getEl_company() %></option>
						<%} %>
					</select>
				</td>
			</tr>
			<tr>
				<td>고용형태</td>
				<td><select id="rc_hirekind" name="rc_hirekind">
						<option value="">선택하세요</option>
						<option value="1">정규직</option>
						<option value="2">계약직</option>
				</select></td>
			</tr>
			<tr>
				<td>경력여부</td>
				<td><select id="rc_career" name="rc_career">
						<option value="">선택하세요</option>
						<option value="1">신입</option>
						<option value="2">경력</option>
						<option value="3">신입/경력</option>
				</select></td>
			</tr>
			<tr>
				<td>
					<div>급여</div>
				</td>
				<td><input id="rc_sal" name="rc_sal" type="text" placeholder="0 : 협의" value=""></td>
			</tr>
			<tr>
				<td>
					<div>채용 분야</div>
				</td>
				<td><input id="rc_ability" name="rc_ability" type="text" value=""></td>
			</tr>
			<tr>
				<td>
					<div>근로 시간</div>
				</td>
				<td><input id="rc_worktime" name="rc_worktime" type="text" placeholder="ex)주5일  09:00 ~ 18:00" value=""></td>
			</tr>
			<tr>
				<td>
					<div>마감 날짜</div>
				</td>
				<td><input id="rc_expire" type="date" name="rc_expire"></td>
			</tr>
			<tr>
				<td>
					<div>제 목</div>
				</td>
				<td><input id="rc_title" name="rc_title" type="text" value=""></td>
			</tr>
			<tr>
				<td>
					<div>상세내용</div>
				</td>
				<td><textarea name="rc_content" cols="83" rows="15" ></textarea>
				</td>
			</tr>
			<tr>
				<td>
					<div>채용홈페이지</div>
				</td>
				<td><input name="rc_url" type="text"></td>
			</tr>
			<tr class="center">
				<td colspan="2" class="h30 lime">
					<!-- 등록을 클릭할 경우  addboard()를 호출합니다.--> 
					<a id="addrecruit" href="javascript:boardform.submit()">[등록]</a>&nbsp;&nbsp; <!-- 뒤로를 클릭할 경우 이전 페이지로 이동합니다. -->
					<a href="javascript:history.go(-1)">[뒤로]</a>
				</td>
			</tr>
		</table>
	</form>
	<jsp:include page="../Footer.jsp"></jsp:include>
</body>
</html>