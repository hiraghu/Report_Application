<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Report App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" 
    rel="stylesheet" 
    integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" 
    crossorigin="anonymous">
</head>
<body>


<div class="container">
<h3 class="pb-3  pt-3" >Report Application</h3>


 <form:form action ="search" modelAttribute="search" method="POST">
       <table>
       <tr> 
           <td>Plane Name:</td>
           <td>
              <form:select path="planeName">
                  <form:option value="">-select-</form:option>
                  <form:options items="${names}"/>
                  </form:select>
               </td>
                <td>Plane Status:</td>
           <td>
              <form:select path="planeStatus">
                  <form:option value="">-select-</form:option>
                  <form:options items="${status}"/>
                  </form:select>
               </td>
                <td>Gender:</td>
                <td>
                <form:select path ="gender">
                <form:option value="">-select-</form:option>
                <form:option value ="Male">Male</form:option>
                <form:option value ="FeMale">FeMale</form:option>
                </form:select>
                </td>
                 </tr>
                 
                 <tr>
                   <td>StartDate:</td>
                   <td><form:input path="startDate" type="date"
                   date-date-format="mm/dd/yyyy"/></td>
 
                   <td>EndDate:</td>
                   <td><form:input path="enddate" type="date"
                   date-date-format="mm/dd/yyyy" /></td>
                   </tr>
                   
                   <tr>
                     <td><input type="submit" value="search"
                         class="btn btn-primary" /></td>
                         </tr>
                         
                       
                   
                   
        </table>
</form:form>
 <hr/>
      <table class= "table table-stripped table-hover">
          <thead>
              <tr>
                 <th>S.no</th>
                 <th>Holder Name</th>
                 <th>Plan Name </th>
                 <th>Plan Status</th>
                  <th>Gender</th>
                 <th>Start Date</th>
                 <th>End Date</th>
                 <th>Benefit Amount</th>
                 <th>Denial Reason</th>
                 
                    
           </tr>
                       
      </thead>
      
      <tbody>
      <c:forEach items="${plan}" var="details" varStatus="index">
        <tr>
           <td>${index.count}</td>
           <td>${details.citizen_Name}</td>
           <td>${details.plan_Name}</td>
           <td>${details.plan_Status}</td>
           <td>${details.gender}</td>
           <td>${details.plan_start_Date}</td>
           <td>${details.plan_end_Date}</td>
           <td>${details.benefit_Amount}</td>
           <td>${details.denial_Reason}</td>
           
        
        
      </c:forEach>
      </tbody>
      
      
      </table>
 <hr/>
 
 Export: <a href="">Excel</a> <a href="">Pdf</a>
 
</div>
      


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" 
crossorigin="anonymous"></script>
 
</body>
</html>