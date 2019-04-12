<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">
	$(document).ready(function() {
		$("#ajax").click(function() {
			
			$.ajax ({
				type: "get"
				, url: "/ajax/test01_ok"
				, data: { }
				, dataType: "json"
				, success : function(res){
					console.log("성공");
					console.log(res.result);
					$("#resultDiv").html(res.result);
				}
				,error : function(e) {
					console.log("실패");
					console.log(e);
				}
				
			})
		})
	})
</script>


<h2>ajax 테스트</h2>
<hr>

<button id="ajax">ajax 요청 보내기</button>
<div id="resultDiv">


</div>
