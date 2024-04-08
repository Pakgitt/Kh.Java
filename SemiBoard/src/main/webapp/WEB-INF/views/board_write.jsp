<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Board Write</title>
    <script src="https:/code.jquery.com/jquery-3.7.1.js"></script>
    <link rel="stylesheet" href="/semi/css/reset.css">
    <link rel="stylesheet" href="/semi/css/board_core.css">
    <link rel="stylesheet" href="/semi/css/board_write.css">
</head>
<style>
    .modal {
        position: absolute;
        display: none;
        justify-content: center;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: rgba(0, 0, 0, 0.4);
    }

    .modal_body {
        position: absolute;
        top: 40%;
        /*모달을 화면가운데 놓기위함. */
        left: 41%;
        width: 400px;
        /*모달의 가로크기 */
        height: 200px;
        /*모달의 세로크기 */
        padding: 40px;
        text-align: center;
        background-color: rgb(255, 255, 255);
        /*모달창 배경색 흰색*/
        border-radius: 10px;
        /*테두리 */
        box-shadow: 0 2px 3px 0 rgba(34, 36, 38, 0.15);
        /*테두리 그림자*/
        transform: translateY(-50%);
        /*모듈창열었을때 위치설정 가운데로*/
    }
    .modal-btn{
        margin-top: 70px;
        width: 100%;
        display: flex;
        justify-content: space-evenly;
        
    }
    .modal-btn #btn-modalok{
        width: 70px;
    }
    .modal-btn #btn-modalcancel{
        width: 70px;
    }
</style>

<body>
    <div class="wrap-header">
        <div class="wrap-header">
            <header>

            </header>
        </div>
        <div class="wrap-main">
            <div class="container">
                <div class="flexnav">
                    <a href="/semi/views/board_community.html" class="flex community">게시판</a>
                    <a href="/semi/views/board_faq.html" class="flex faq">FAQ</a>
                </div>
                <div class="location">
                    <div class="location notice"><span>게시판</span></div>
                    <div class="location community"><span>커뮤니티 > </span></div>
                    <div class="location main"><span>메인이미지 > </span></div>
                </div>
                <div class="subject">
                    <div>게시판</div>
                </div>
                <div class="contents">
                    <div class="board-write">
                        <form action="board_community.html" name="notice" id="notice" method="get">
                            <div class="insert-form">
                                <table>
                                    <tr>
                                        <th>작성자</th>
                                        <td>memId</td>
                                    </tr>
                                    <tr>
                                        <th>제목</th>
                                        <td><input type="text" name="" id="write-title" title="제목 입력"></td>
                                    </tr>
                                    <tr>
                                        <th>내용</th>
                                        <td><textarea name="" id="write-content" cols="15" rows="5"
                                                title="내용 입력"></textarea></td>
                                    </tr>
                                    <tr>
                                        <th>첨부파일</th>
                                        <td>
                                            <ul>
                                                <li>
                                                    <input type="file" name="" id="file_1">
                                                </li>
                                                <li>
                                                    <input type="file" name="" id="file_2">
                                                </li>
                                                <li>
                                                    <input type="file" name="" id="file_3">
                                                </li>
                                            </ul>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                            <div class="write-btn">
                                <button type="button" id="btn-submit">등록하기</button>
                                <button type="button"
                                    onclick="location.href='/semi/views/board_community.html'">목록</button>
                            </div>
                            <!-- 모달 -->
                            <div class="modal">
                                <div class="modal_body">
                                    <h2>글을 등록하시겠습니까?</h2>
                                    <div class="modal-btn">
                                        <button type="submit" id="btn-modalok">확인</button>
                                        <button type="button" id="btn-modalcancel">취소</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="wrap-footer">
        <footer>

        </footer>
    </div>

    <script>
        $(loadedHandler);
        function loadedHandler() {
            $("#btn-submit").on("click", btnModalClickHandler);
            $("#btn-modalok").on("click", btnModalOkClickHandler);
            $("#btn-modalcancel").on("click", btnModalCancleClickHandler);
        }

        function btnModalClickHandler() {
            console.log("모달창 오픈");
            $(".modal").css("display", "block");
        }
        function btnModalOkClickHandler() {
            console.log("눌림");
            location.href = '/semi/views/board_community.html';
            
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
        function btnModalCancleClickHandler() {
            console.log("모달창 닫기");
            $(".modal").css("display", "none");
        }
        // $(loadedHandler);
        // function loadedHandler() {
        //     $(".btn.write").on("click", btnWriteHandler);
        // }
        // function btnWriteHandler() {
        //     var htmlVal = '<tr>' +
        //         '<td class="td no">번호</td>' +
        //         '<td class="td title">제목</td>' +
        //         '<td class="td file"></td>' +
        //         '<td class="td writer">작성자</td>' +
        //         '<td class="td date">YYYY-MM-DD</td>' +
        //         '<td class="td hits">5</td>' +
        //         '<tr>';
        //     $(".table-body").append(htmlVal);
        // }
    </script>
</body>

</html>