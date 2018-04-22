<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSearchStudentProxyid" scope="session" class="mrumi_hw5.SearchStudentProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSearchStudentProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSearchStudentProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSearchStudentProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        mrumi_hw5.SearchStudent getSearchStudent10mtemp = sampleSearchStudentProxyid.getSearchStudent();
if(getSearchStudent10mtemp == null){
%>
<%=getSearchStudent10mtemp %>
<%
}else{
        if(getSearchStudent10mtemp!= null){
        String tempreturnp11 = getSearchStudent10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String fname_1id=  request.getParameter("fname16");
            java.lang.String fname_1idTemp = null;
        if(!fname_1id.equals("")){
         fname_1idTemp  = fname_1id;
        }
        String lname_2id=  request.getParameter("lname18");
            java.lang.String lname_2idTemp = null;
        if(!lname_2id.equals("")){
         lname_2idTemp  = lname_2id;
        }
        String city_3id=  request.getParameter("city20");
            java.lang.String city_3idTemp = null;
        if(!city_3id.equals("")){
         city_3idTemp  = city_3id;
        }
        String state_4id=  request.getParameter("state22");
            java.lang.String state_4idTemp = null;
        if(!state_4id.equals("")){
         state_4idTemp  = state_4id;
        }
        mrumi_hw5.Student[] searchedStudents13mtemp = sampleSearchStudentProxyid.searchedStudents(fname_1idTemp,lname_2idTemp,city_3idTemp,state_4idTemp);
if(searchedStudents13mtemp == null){
%>
<%=searchedStudents13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(searchedStudents13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(searchedStudents13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 24:
        gotMethod = true;
        String action_5id=  request.getParameter("action27");
            java.lang.String action_5idTemp = null;
        if(!action_5id.equals("")){
         action_5idTemp  = action_5id;
        }
        java.lang.String deleteStudent24mtemp = sampleSearchStudentProxyid.deleteStudent(action_5idTemp);
if(deleteStudent24mtemp == null){
%>
<%=deleteStudent24mtemp %>
<%
}else{
        String tempResultreturnp25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteStudent24mtemp));
        %>
        <%= tempResultreturnp25 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>