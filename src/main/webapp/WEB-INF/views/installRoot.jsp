<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Installment Root</title>
        <link href="<c:url value='/resources/css/login.css' />" rel="stylesheet"></link>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
        <script type="text/javascript" src="<c:url value='/resources/js/funtions/installRoot.js' />"></script>
    </head>
 
    <body>
<!-- 			<div >
		      </font>
			  <form  id="insRootForm" action="#" method="post">
			    <input type="text" placeholder="Install root name" id="rootName" />
			    <input type="text" placeholder="Amount"            id="amount"/>
			    <input type="text" placeholder="Duration"          id="duration"/>
			    <button>create</button>
			    </form>
			</div> -->
			<div>
			<c:url var="action" value="installRoot/addInsRoot" />
                   <form:form action="${action}" method="post" commandName="installRoot" class="form-horizontal">
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Name</label>
                        <div class="col-sm-4">
                             <form:input path="rootName"
                            class="form-control" />
                        </div>
                  </div>
                  <div class="form-group">
                     <label class="col-sm-2 control-label">Amount</label>
                        <div class="col-sm-4">
                             <form:input path="amount"
                            class="form-control" />
                        </div>
                  </div>
    
                  <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-2">
                          <button type="submit"
                            class="btn btn-primary btn-sm btn-block">Add</button>
                    </div>
                  </div>
            </form:form>
			</div>
    </body>
</html>