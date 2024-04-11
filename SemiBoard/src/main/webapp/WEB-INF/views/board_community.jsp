<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Board Community</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <script src="https:/code.jquery.com/jquery-3.7.1.js"></script>
    <link href="${pageContext.request.contextPath}/resource/css/board_reset.css"rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resource/css/board_core.css"rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resource/css/board_community.css"rel="stylesheet">
</head>

<body>
    <div class="wrap-header">
        <header>

        </header>
    </div>
    ${dtolist}
    [[${dtolist }]] <br>
    [[<%=request.getAttribute("dtolist") %>]]
    [[<%=request.getAttribute("msg") %>]]
    <br>
    <c:forEach items="${dtolist}" var="item">
    번호: ${item.boardNo}<br>
    제목: ${item.boardTitle}<br>
    작성자: ${item.boardWriter}<br>
    작성일: ${item.boardWriteTime}<br>
    조회수: ${item.hit}<br>
</c:forEach>
    
    
    <div class="wrap-main">
        <div class="container">
            <div class="flexnav">
                <a href="${pageContext.request.contextPath}/community" class="flex community">게시판</a>
                <a href="${pageContext.request.contextPath}/faq" class="flex faq">FAQ</a>
            </div>
            <div class="location">
                <div class="location notice"><span>공지사항</span></div>
                <div class="location community"><span>커뮤니티 > </span></div>
                <div class="location main"><span>메인이미지 > </span></div>
            </div>
            <div class="subject">
                <div>게시판</div>
            </div>
            <div class="search">
                <form action="">
                    <div class="flexsearch">
                        <input type="text" name="" id="" class="search text">
                        <button type="submit" class="search btn">검색</button>
                    </div>
                </form>
            </div>
            <div class="count-write">
                <span>436건</span>
                <div class="community-btn">
                    <button type="button" onclick="location.href='${pageContext.request.contextPath}/write'"
                        class="btn write">글작성</button>
                </div>
            </div>
            <div class="board">
                <div class="board-list">
                    <table class="tb board">
                        <tr>
                            <th class="no">번호</th>
                            <th class="title">제목</th>
                            <th class="file">파일</th>
                            <th class="writer">작성자</th>
                            <th class="date">작성일</th>
                            <th class="hits">조회수</th>
                        </tr>
                        <tbody class="table-body">

                        </tbody>

                    </table>
                </div>


                <div class="pageno">
                    <div class="flexpage">
                        <div class="no 1"><button type="submit">1</button></div>
                        <div class="no 2"><button type="submit">2</button></div>
                        <div class="no 3"><button type="submit">3</button></div>
                        <div class="no 4"><button type="submit">4</button></div>
                        <div class="no 5"><button type="submit">5</button></div>
                        <div class="no 6"><button type="submit">6</button></div>
                        <div class="no 7"><button type="submit">7</button></div>
                        <div class="no 8"><button type="submit">8</button></div>
                        <div class="no 9"><button type="submit">9</button></div>
                        <div class="no 10"><button type="submit">10</button></div>
                        <div class="no next"><button type="submit"> > </button></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="wrap-footer">
        <footer>

        </footer>
    </div>
    <!-- TODO 값을 받으면 테이블 목록 생성... -->
    <!-- <script>
        $(loadedHandler);
        function loadedHandler() {
            $(".btn.write").on("click", btnWriteHandler);
        }
        function btnWriteHandler() {
            var htmlVal = '<tr>' +
                '<td class="td no">번호</td>' +
                '<td class="td title">제목</td>' +
                '<td class="td file"></td>' +
                '<td class="td writer">작성자</td>' +
                '<td class="td date">YYYY-MM-DD</td>' +
                '<td class="td hits">5</td>' +
                '<tr>';
            $(".table-body").append(htmlVal);
        }
    </script> -->
</body>

</html>