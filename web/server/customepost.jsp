<%@page import="com.rajesh.entity.Customer"%>
<%
    Customer customer=new Customer(1, "rajesh", "dadarajesh@gmail.com", true);
    if(request.getMethod().equalsIgnoreCase("POST")){
        out.println(request.getParameter("name"));
    }
 %>