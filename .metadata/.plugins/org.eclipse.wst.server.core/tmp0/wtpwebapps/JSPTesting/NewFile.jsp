<%@page import="javax.security.auth.login.Configuration"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             HttpSession httpSession = request.getSession();
  String uname=httpSession.getAttribute("username").toString();
        String fname=request.getParameter("fname");
String  lname=request.getParameter("lname");
String email=request.getParameter("email");
String pass=request.getParameter("pass");
String phone=request.getParameter("phone");
try
{
Configuration cfg=new Configuration();  
    cfg.configure("/com/login/hibernate.cfg.xml");//populates the data of the configuration file  

    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
  Session sess = factory.openSession();
Transaction tr = sess.beginTransaction();
//cfg.configure("/com/login/hibernate.cfg.xml");
Contact c = (Contact)sess.get(Contact.class,fname);
c.setFname(fname);
c.setLname(lname);
c.setEmail(email);
c.setPass(pass);
c.setPhone(phone);
tr.commit();
sess.update(c);
sess.close();
out.println("<h1>Updated successfully!</h1>");
}
catch(Exception e)
{
System.out.println("e="+e.getMessage());
}
        %>
    </body>
</html>