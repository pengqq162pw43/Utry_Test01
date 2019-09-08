<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/common.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>登入</title>
		
	<script src="${ctx }/js/jquery-3.2.1.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="${ctx }/css/bootstrap.css" />
	<script src="${ctx }/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="${ctx }/js/bootstrapValidator.min.js"></script>	
	<style type="text/css">
		body {
		    border: medium none;
		    margin: 0;
		    padding: 0;
		    width: 100%;
		}
		.headerWrap {
		    width: 100%;
		    height: 127px;
		    background: url('${ctx }/img/logo.jpg') no-repeat;
		    background-position-y: 71%;
		    background-position-x: 56.5%;
		    min-width: 1290px;
		    display: block;
		}
		
		.header {
			text-align:center;
		}
		
		.mandatory {
			color:RED;
			text-align:left!important;
			font-weight:normal;
		}
	</style>
	<script type="text/javascript">
		//alert(cxx)
		// $(function(){}) 等价于 <body onload="function(){}"> 
		$(function() {
			// $("#registerForm") 等价于 document.getElementById("registerForm");
			$("#registerForm").bootstrapValidator({
				message : '该值不合法',
				feedbackIcons : {
					valid : 'glyphicon glyphicon-ok',
					invalid : 'glyphicon glyphicon-remove',
					validating : 'glyphicon glyphicon-refresh'
				},
				fields : {
					username : {
						message : '用户名不合法',
						validators : {
							notEmpty : { //非空验证
								message : '用户名不能为空'
							},
							stringLength : { // 长度验证
								min : 1,
								max : 20,
								message : '用户名长度需为6-20'
							},
							regexp : { // 正则式验证
								regexp : /^[0-9a-zA-Z_]+$/,
								message : '用户名只能为字母、数字、下划线'
							},
							different: { //不同验证
		                        field: 'password',
		                        message: '用户名不能与密码相同'
		                    },
						}
					}, //用户名验证结束
					password: {
						message: '密码不合法',
						validators: {
							notEmpty : { //非空验证
								message : '密码不能为空'
							},
							stringLength : { // 长度验证
								min : 1,
								max : 20,
								message : '密码长度需为6-20'
							},
							regexp : { // 正则式验证
								regexp : /^[0-9a-zA-Z_]+$/,
								message : '密码只能为字母、数字、下划线'
							},
							different: {
		                        field: 'username',
		                        message: '密码不能与用户名相同'
		                    }
						}
					}
				}// end of fields
			});
		});

		// 改变验证码图片
		function changeValidateImage() {
			var img = document.getElementById("validateImage");
			img.src = "${basePath}/validationCode.do?t=" + (new Date()).valueOf();
		}

		// 重置按钮的点击事件
		function resetForm() {
			$('#registerForm').data('bootstrapValidator').resetForm(true);
		}
	</script>
</head>
<body>
	<div class="container">
		
		<form id="registerForm" class="form-horizontal bv-form" novalidate="novalidate"  action="${pageContext.request.contextPath}/user/toLogin"  method="post">
		<button type="submit" class="bv-hidden-submit" style="display: none; width: 0px; height: 0px;"></button>
			<div class="form-group header">
			    <h2 class="col-sm-8">单点登录</h4><br/>
			    <h5>${msg1 }</h5>
			</div>
		  
		    <div class="form-group has-feedback">
			    <label for="username" class="col-sm-2 control-label">用户名</label>
			    <div class="col-sm-4">
				        <input type="text" class="form-control" id="username" name="username" placeholder="请填写用户名" data-bv-field="username"><i class="form-control-feedback" data-bv-icon-for="username" style="display: none;"></i>
					    <!--<small class="help-block" data-bv-validator="notEmpty" data-bv-for="username" data-bv-result="NOT_VALIDATED" style="display: none;">用户名不能为空</small>
					    <small class="help-block" data-bv-validator="stringLength" data-bv-for="username" data-bv-result="NOT_VALIDATED" style="display: none;">用户名长度需为6-20</small>
					    <small class="help-block" data-bv-validator="regexp" data-bv-for="username" data-bv-result="NOT_VALIDATED" style="display: none;">用户名只能为字母、数字、下划线</small>
					    <small class="help-block" data-bv-validator="different" data-bv-for="username" data-bv-result="NOT_VALIDATED" style="display: none;">用户名不能与密码相同</small>-->
			    </div>
		    </div>
		  
		  <div class="form-group has-feedback">
		    <label for="password" class="col-sm-2 control-label">密码</label>
		    <div class="col-sm-4">
			    <input type="password" class="form-control" id="password" name="password" placeholder="请填写密码" data-bv-field="password"><i class="form-control-feedback" data-bv-icon-for="password" style="display: none;"></i>
			    <!--<small class="help-block" data-bv-validator="notEmpty" data-bv-for="password" data-bv-result="NOT_VALIDATED" style="display: none;">密码不能为空</small>
			    <small class="help-block" data-bv-validator="stringLength" data-bv-for="password" data-bv-result="NOT_VALIDATED" style="display: none;">密码长度需为6-20</small>
			    <small class="help-block" data-bv-validator="regexp" data-bv-for="password" data-bv-result="NOT_VALIDATED" style="display: none;">密码只能为字母、数字、下划线</small>
			    <small class="help-block" data-bv-validator="different" data-bv-for="password" data-bv-result="NOT_VALIDATED" style="display: none;">密码不能与用户名相同</small>-->
		    </div>
		    <!--
		    	<label for="password" class="col-sm-5 control-label mandatory">*(6~20 字符，可用数字、字母、下划线)</label>
		    -->
		  </div>
		 
		    <div class="checkbox center-container col-sm-offset-2 col-sm-"5>
				    <label>
				    	<div class="center-container" >
				    		记住：&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="checkbox"  value=1/>	
				    	</div>
				    </label>
				    
				    <label>
				    	<div class="center-container" >
				    	        忘记：&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="checkbox"  value=1/>	
				    	</div>
				    </label>
				    <br />
				    <br />
		    </div>
		    
		  	<div class="form-group">
			    <div class="col-sm-offset-2 col-sm-6">
			      <button type="submit" class="btn btn-primary">登入</button>
			      <button type="reset" class="btn btn-primary" onclick="javascript:resetForm();">重置</button>
			    </div>  
		    </div>
		    
		</form>
	</div>
</body>
</html>

