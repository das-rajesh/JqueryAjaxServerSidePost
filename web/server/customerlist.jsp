<%@page import="com.rajesh.entity.dao.impl.CustomerDaoImpl"%>
<%@page import="com.rajesh.entity.dao.CustomerDao"%>
<%@page import="com.rajesh.entity.Customer"%>
<%
     CustomerDao customerDao=new CustomerDaoImpl();
    
    if (request.getParameter("id") == null) {
        response.setHeader("Content-Type", "application/json");
        String output = "";
        for (Customer c : customerDao.getAll()) {
            if (output.equals("")) {
                output = c.toJson();
            } else {
                output = output + "," + c.toJson();
            }
        }
        out.println("[" + output + "]");
    } else {
        int id = Integer.parseInt(request.getParameter("id"));
        out.println(customerDao.getById(id).toJson());
    }

%>