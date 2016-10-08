<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	
	
	<jsp:body>
	<p>Hi <c:out value="${member.firstName}"></c:out></p>
	<h3>Savings Amount</h3>
	<c:url var="action" value="savings/member" />
                   <form:form action="${action}" method="post" commandName="savings" class="form-horizontal">
                   
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Contact Number</label>
                        <div class="col-sm-4">
                             <form:input path="contact"
                            class="form-control" />
                        </div>
                  </div>
                  <<%-- div class="form-group">
                     <label class="col-sm-2 control-label">Amount</label>
                        <div class="col-sm-4">
                             <form:input path="amount"
                            class="form-control" />
                        </div>
                  </div>
                  <div class="form-group">
                     <label class="col-sm-2 control-label">Month</label>
                        <div class="col-sm-4">
                             <form:input path="month"
                            class="form-control" />
                        </div>
                  </div>
                  <div class="form-group">
                     <label class="col-sm-2 control-label">Fine On Due</label>
                        <div class="col-sm-4">
                             <form:input path="fineAmount"
                            class="form-control" />
                        </div>
                  </div> --%>
                  <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-2">
                          <button type="submit"
                            class="btn btn-primary btn-sm btn-block">Add</button>
                    </div>
                  </div>
            </form:form>
			</div>
	</jsp:body>
</t:dashboard>
</html>