<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/common.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>目录</title>
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
	<script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
<body>
  <a href="${ctx }/user/LoginUI">登录</a>
  <a href="${ctx }/logout/toLogout">ccc </a>		
  <ul class="easyui-tree">
        <li>
            <span>Folder</span>
            <ul>
                <li><span><a href="http://localhost:8080/blogfile/1.txt">File1</a></span></li>
                <li><span><a href="http://localhost:8080/blogfile/2.txt">File2</a></span></li>
                <li><span><a href="http://localhost:8080/blogfile/3.txt">File3</a></span></li>
                <li><span><a href="http://localhost:8080/blogfile/4.txt">File4</a></span></li>
            </ul>
        </li>
    </ul>
</body>
</html>

