<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>포트폴리오 문제</title>
</head>
<style>
    table{
        /* width: 100%; */
    }
.list th{
color : white;
}
td:first-child{
    /* width: 100px; */
}
textarea {
    resize: none;
}

.input {
    width: 100%;
}
.write tr:last-child td{
        text-align: center;
    }
    .list td{
        background-color: beige;
    }
    .list th{
        background-color: coral;
    }
</style>

<body>
    <form action="" method="post">
        <fieldset>
            <legend>공지사항 작성하기</legend>
            <table class="write">
                <tr>
                    <th>제목</th>
                    <td><input type="text" name="title" id="" class="input tit" placeholder="제목을 입력하시오."></td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td><textarea name="content" id="" cols="30" rows="10" class="input content" placeholder="내용을 입력하시오."></textarea></td>
                </tr>
                <tr>
                    <th>첨부파일</th>
                    <td><input type="file" name="uploadFile" id="" value="선택된 파일 없음">
                </tr>
                <tr>
                    <td colspan="2"><input type="button" name="" value="작성하기">
                    </td>
            </table>
        </fieldset>
        <table border="1" class="list">
            <tr>
                <th>번호</th>
                <th colspan="2"  width=400>제목</th>
                <th>작성자</th>
                <th>작성일</th>
                <th>조회수</th>
            </tr>
            <tr>
                <td>9</td>
                <td width=400>공지사항 제목 9</td>
                <td><input type="button" value="바로가기"></td>
                <td>user01</td>
                <td>2021-03-29</td>
                <td>34</td>
            </tr>
            <tr>
                <td>6</td>
                <td>공지사항 제목 6</td>
                <td><input type="button" value="바로가기"></td>
                <td>answ445</td>
                <td>2021-03-12</td>
                <td>67</td>
            </tr>
            <tr>
                <td>3</td>
                <td>공지사항 제목 3</td>
                <td><input type="button" value="바로가기"></td>
                <td>testg12</td>
                <td>2021-03-01</td>
                <td>98</td>
            </tr>
            <tr>
                <td>2</td>
                <td>공지사항 제목 2</td>
                <td><input type="button" value="바로가기"></td>
                <td>palwe3</td>
                <td>2021-01-02</td>
                <td>85</td>
            </tr>
            <tr>
                <td>1</td>
                <td>공지사항 제목 1</td>
                <td><input type="button" value="바로가기"></td>
                <td>xm123</td>
                <td>2020-12-24</td>
                <td>124</td>
            </tr>
            <tr>
                <th colspan="4">전체공지사항 </th>
                <th colspan="2">5개</th>
            </tr>
        </table>
    </form>
    <hr>
</body>

</html>