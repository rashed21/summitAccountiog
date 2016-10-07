<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	
	
	<jsp:body>
	
	<center><h3>Installment Root Form </h3></center>
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
                     <label class="col-sm-2 control-label">Duration</label>
                        <div class="col-sm-4">
                             <form:input path="duration"
                            class="form-control" />
                        </div>
                  </div>
                  <div class="form-group">
                     <label class="col-sm-2 control-label">Fine Rate On Late</label>
                        <div class="col-sm-4">
                             <form:input path="fineRate"
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
			
			<c:if test="${not empty installRootList}">
                <div class="table-responsive">
                    <table class="table table-bordered ">
        
                        <thead>
                            <tr class="info">
                                <th>Sl No.</th>
                                <th>Install Name</th>
                                <th>Duration</th>
                                <th>Fine Rate</th>
                                <th>Amount</th>
                            </tr>
                        </thead>
        
                        <tbody>
                            <c:forEach var="root" items="${installRootList}"
                                varStatus="itemSl">
                                <tr class="success">
                                    <td>${itemSl.index+1}</td>
                                    <td>${root.rootName}</td>
                                    <td>${root.duration}</td>
                                    <td>${root.fineRate}</td>
                                    <td>${root.amount}</td>
                                </tr>
                            </c:forEach>                        
                        </tbody>
        
                    </table>
                </div>
            </c:if>
	</jsp:body>
</t:dashboard>
</html>