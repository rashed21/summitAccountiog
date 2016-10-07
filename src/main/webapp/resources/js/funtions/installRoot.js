/*$('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});*/

/*
 * this method create for toggle visible sign in form 
 * and registration form on login page 
 */
function toggle_visibility() {
	$('form').animate({height: "toggle", opacity: "toggle"}, "slow");
}

/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	$("#insRootForm").submit(function(event) {
		$("#insRootForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["rootName"]   = $("#rootName").val(),
		data["amount"]   = $("#amount").val(),
		data["duration"] 	   = $("#duration").val(),
		url = "addinstallroot";
		
		var token = $('#csrfToken').val();
		var header = $('#csrfHeader').val();
		/*
		 * if in spring aplication csrf enable
		 * send csrf parameter in header otherwise 405 error
		 */
		$.ajax({
			type 	 : "POST",
			url      : url,
			data 	 : JSON.stringify(data),
			dataType : 'json',
			beforeSend: function(xhr) {
		        xhr.setRequestHeader("Accept", "application/json");
		        xhr.setRequestHeader("Content-Type", "application/json");
		        xhr.setRequestHeader(header, token);
		    },
			success  : function(resonse) {
				var message = "Added New Installment Sucess";
				//				$("#msg").html(data.message);
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				document.getElementById("insRootForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Added New Installment falied");
//						$("#msg").html(e.message);
				data = null;
				document.getElementById("insRootForm").reset()
			}
		});
			
		});
	});
});