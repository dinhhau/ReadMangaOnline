<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/9/2019
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Hello Word</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<body>
<table id="table-car" class=" table">
    <thead>
    <tr>
        <th>
            <div class="checkbox">
                <label><input id="check-all" type="checkbox" value=""/></label>
            </div>
        </th>
        <th>Tên KH</th>
        <th>Mail</th>
        <th>Ngày lập</th>
        <th>Trạng thái</th>
        <th>Quê quán</th>
        <th>ý kiến</th>



    </tr>
    </thead>
    <tbody>
    <c:forEach var="ds" items="${h}">
        <tr >
            <td></td>
            <td>${ds.name} </a></td>
            <td> ${ds.userId }</td>
            <td>${ds.address }</td>
            <td>${ds.gender}</td>
            <td>${ds.username }</td>
            <td>${ds.password }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>Username</p> <input type="text" id="user">
<p>Password</p> <input type="password" id="pass">
<button id="dangKy">Dang ky</button>
</body>
<script rel="script" type="text/javascript">

    $(document).ready(function () {
        $("#dangKy").click(function () {

            var email =$("#user").val();
            var pass =$("#pass").val();
            $.ajax({
                url:"readMangaOnline/dangKy",
                type:"GET",
                data:{
                    email:email,
                    matkhau:pass
                },
                success:function (value) {
                    if(value=="true"){
                        window.location.reload();


                    }else{
                        alert("That bai");
                    }
                }
            })
        });
    })
</script>
</html>
