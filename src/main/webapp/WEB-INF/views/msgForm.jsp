<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html;charset=utf-8"%>

<html>
<head>
<title>信息输入</title>
</head>

<body>
	<div class="row">
		<div class="col-xs-12">
			<p>丘比特信息</p>
			<hr>
		</div>
		<form class="form-horizontal"
			action="${rc.contextPath}/routeInfo/addRoute" method="post">
			<div class="form-group">
				<div class="col-xs-6 form-horizontal authweb-shadow"
					id="authModeDiv">
					<div class="form-group" id="accNoDiv">
						<label class="col-xs-3 control-label" id="phoLabel">手机号后四位<span
							style="color: red">*</span></label>
						<div class="col-xs-6">
							<input class="form-control input-show" maxlength=19 type="text"
								name="pho" id="pho">
						</div>
						<label class="col-xs-3 control-label label-tips" id="phoTip"></label>
					</div>
					<div class="form-group" id="nameDiv">
						<label class="col-xs-3 control-label" id="nameLabel">昵称<span
							style="color: red">*</span></label>
						<div class="col-xs-4">
							<input class="form-control input-show" type="text" name="name"
								id="name">
						</div>
						<label class="col-xs-3 control-label label-tips" id="nameTip"></label>
					</div>
					<div class="form-group" id="certificateCodeDiv">
						<label class="col-xs-3 control-label" id="msgLabel">表白信息<span
							style="color: red">*</span></label>
						<div class="col-xs-5">
							<input class="form-control input-show" maxlength=18 type="text"
								name="msg" id="msg">
						</div>
						<label class="col-xs-3 control-label label-tips" id="msgTip"></label>
					</div>
					<hr>
				</div>
			</div>

			<div class="form-group">
				<div class="col-xs-12" style="text-align: center">
					<button type="submit" onclick=true class="btn btn-primary">提交
					</button>
				</div>
			</div>
</body>
</html>