<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@ page import="com.netshop.model.User" %>
<body>

     
     <%
     List<User> user=(List<User>)request.getAttribute("user");
     %>
     
     <table>
           <tr>
               <th>u_id</th>
               <th>u_name</th>
               <th>u_password</th>
               <th>u_tel</th>
               <th>u_country</th>
               <th>u_state</th>
               <th>u_city</th>
               <th>u_addr</th>
               <th>u_zip</th>
            </tr>
     <%
         for(User users:user){
      %>  	 
        	 <tr>
        	    <td><%=users.getUserid() %></td>
        	    <td><%=users.getUsername() %></td>
        	    <td><%=users.getUserpassword() %></td>
        	    <td><%=users.getUsertel()%></td>
        	    <td><%=users.getUsercountry() %></td>
        	    <td><%=users.getUserstate() %></td>
        	    <td><%=users.getUsercity() %></td>
        	    <td><%=users.getUseraddr() %></td>
        	    <td><%=users.getUserzip() %></td>
        	 
        	 </tr>
       <% 
         }
        %>
     </table>
</body>
</html>