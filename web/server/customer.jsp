<%@page import="com.rajesh.entity.Customer"%>
<%
    Customer customer=new Customer(1, "rajesh", "dadarajesh@gmail.com", true);
    response.setHeader("Content-Type", "application/json");
    out.println(customer.toJson());
 %>