<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	
	
	<jsp:body>
	
	<h3>Member Registration Form</h3>
	<c:url var="action" value="member/add" />
                   <form:form action="${action}" method="post" commandName="member" class="form-horizontal">
                   
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Name</label>
                        <div class="col-sm-4">
                             <form:input path="username"
                            class="form-control" />
                        </div>
                  </div>z
                  <div class="form-group">
                     <label class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-4">
                             <form:input path="password"
                            class="form-control" />
                        </div>
                  </div>
                  <div class="form-group">
                     <label class="col-sm-2 control-label">Email</label>
                        <div class="col-sm-4">
                             <form:input path="email"
                            class="form-control" />
                        </div>
                  </div>
                  <div class="form-group">
                     <label class="col-sm-2 control-label">First Name</label>
                        <div class="col-sm-4">
                             <form:input path="firstName"
                            class="form-control" />
                        </div>
                  </div>
                  <div class="form-group">
                     <label class="col-sm-2 control-label">Last Name</label>
                        <div class="col-sm-4">
                             <form:input path="lastName"
                            class="form-control" />
                        </div>
                  </div>
                  <div class="form-group">
                     <label class="col-sm-2 control-label">Phone</label>
                        <div class="col-sm-4">
                             <form:input path="phone"
                            class="form-control" />
                        </div>
                  </div>
                 
                  <div class="form-group">
                         <label class="col-sm-2 control-label">Product Item </label>
                            <div class="col-sm-4">
                            <form:select path="installRoot"  class="form-control">
                            <form:option value="0" label="--Select One--" />
                            <c:forEach var="insRoot" items="${installRootList}">
                                <form:option value="${insRoot.installRootID}"
                                    label="${insRoot.rootName}" />
                            </c:forEach>
                        </form:select>
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
	</jsp:body>
</t:dashboard>
</html>