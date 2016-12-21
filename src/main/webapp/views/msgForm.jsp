<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html;charset=utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1"/>
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
		<form class="form-horizontal" action="addMsgForm" method="post">
			<div class="form-group">
				<div class="col-xs-6 form-horizontal authweb-shadow"
					id="authModeDiv">
					<div class="form-group" id="accNoDiv">
						<label class="col-xs-3 control-label" id="phoneLabel">手机尾号(四位哦)<span
							style="color: red">*</span></label>
						<div class="col-xs-6">
							<input class="form-control input-show" maxlength=19 type="text"
								name="phone" id="phone">
						</div>
						<label class="col-xs-3 control-label label-tips" id="phoneTip"></label>
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
				<div class="col-xs-12" style="text-align: left">
					<button type="submit" onclick=true class="btn btn-primary">提交
					</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>