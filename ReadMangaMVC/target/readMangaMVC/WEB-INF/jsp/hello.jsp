<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/9/2019
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Word</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">
    $(document).ready(function () {
//login
        $("#btnLogin").click(function () {

            var email =$("#txt_user").val();
            var pass =$("#txt_pass").val();
            if(email == ""){
                alert("email không được để trống!");
                return ;
            }
            if(pass ==""){
                alert("password không được để trống");
                return ;
            }
            alert("OK!" + email);
            // $.ajax({
            //
            //     url:"/rentalcar/api/Checklogin",
            //     type:"GET",
            //     data:{
            //         email:email,
            //         matkhau:pass
            //     },
            //     success:function (value) {
            //         if(value=="true"){
            //             duongdanhientai = window.location.href;
            //             duongdan =duongdanhientai.replace("login/","");
            //             window.location =duongdan;
            //
            //
            //         }else{
            //             $("#ketqua").text(" Sai tài khoản or mật khẩu!")
            //         }
            //     }
            // })
        });

    })



</script>

<body>
    <h2>${h}</h2>
    <div class="all_login">

        <div class="b_login">
            <div class="b_login_body">

                <table>

                    <tr>

                        <td class="b_login_body_label">Tên tài khoản</td>
                    </tr>
                    <tr>
                        <td><input class="input" type="text" name="email"
                                   id="txt_user"></td>


                    </tr>
                    <tr>
                        <td class="b_login_body_label">Mật khẩu</td>
                    </tr>
                    <tr>
                        <td><input class="input" type="password" name="matkhau"
                                   id="txt_pass"></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" name="ckghinho" id="ckghinho"><a>
                            Ghi nhớ đăng nhập</a></td>
                    </tr>
                </table>
                <div class="b_login_foot">
                    <div class="b_login_but"><input type="submit" class="but" name="btnLogin" id="btnLogin" value="Đăng nhập" /></div>

                    <span style="color:yellow" id="ketqua"> </span>
                </div>

            </div>
        </div>
    </div>
</body>
</html>
