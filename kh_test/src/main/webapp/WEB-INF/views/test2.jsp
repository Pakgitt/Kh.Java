<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>포트폴리오 문제 2</title>
    <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
</head>
<style>
    body {
        background-color: skyblue;
    }

    .join .tb-join {
        background-color: lightgray;
        padding: 10px;
    }

    th {
        float: left;
    }

    input {
        border: 0;
        border-bottom: 1px dashed black;
        background-color: transparent;
    }

    .pwcheck {
        font-size: 8px;
        color: gray;
        height: 12px;
    }
    .email{
        text-align: center;
    }

    /* .addr {
        height: 67px;

    } */

    .submit {
        text-align: center;

    }

    .submit button {
        width: 100%;
        height: 40px;
        background-color: yellowgreen;
        border: 0;
    }
</style>

<body>
    <div class="join">
        <form action="#" method="post">
            <table class="tb-join">
                <tr>
                    <th>아이디</th>
                    <td>
                        <input type="text" name="" id="" required>
                    </td>
                </tr>
                <tr>
                    <th>패스워드</th>
                    <td>
                        <input type="password" name="" id="" required class="pw">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td colspan="2" class="pwcheck"></td>
                </tr>
                <tr>
                    <th>패스워드 확인</th>
                    <td>
                        <input type="password" name="" id="" required>
                    </td>
                </tr>
                <tr>
                    <th>이메일</th>
                    <td>
                        <input type="email" value="@" class="email">
                    </td>
                </tr>
                <tr class="addr">
                    <th>주소</th>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="submit">
                        <button type="submit">가입</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <script>
        $(function () {
            $(".pw").on("focus", function () {
                console.log(this);
                htmlVal = '영문자 대/소문자 특수문자, 숫자 포함 8 ~ 32자';
                $(".pwcheck").html(htmlVal);
            });
            $(".pw").on("blur", function () {
                console.log(this);
                htmlVal = '';
                $(".pwcheck").html(htmlVal);
            });
        });

    </script>
</body>

</html>