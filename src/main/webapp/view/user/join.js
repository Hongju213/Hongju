$(document).ready(function() {
	$('#btnJoin').click(function() {
	      var id = $('#id').val();
	      var pw = $('#pw').val();
	      var name = $('#name').val();
	      var gender = $('#gender').val();
	      var role	= null;
	      var birth = $('#day').val();

	      var form = {id : id, 
	    		      password : pw,
	    		      name : name,
	    		      role : role,
	    		      gender : gender,
	    		      birth : birth};
	      
	      $.ajax({
	          type : "POST",
	          url : "/join.do",
	          data : form,
	          success : function(data) {
	        	  alert("회원가입이 완료되었습니다.");
	        	  location.href='/login.do'
	          },
	          error : function(request, status, error) {
	              alert("code:" + request.status + "\n" + "error:" + error);
	          }
	            });
		});
});

