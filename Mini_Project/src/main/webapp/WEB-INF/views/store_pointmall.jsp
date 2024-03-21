<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath}/resource/css/reset.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resource/css/core.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resource/css/layout.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resource/css/store.css"
	rel="stylesheet">
<title>스토어-포인트몰</title>
</head>

<body>
	<div class="header-wrap">
		<header>
			<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
				Voluptatum, illum quasi nemo omnis dolorum eveniet unde dignissimos
				exercitationem tenetur. Laboriosam suscipit quam magni facere enim
				maiores necessitatibus, id ea ullam!</p>
		</header>
	</div>

	<section class="container">

		<div class="inner-wrap">
			<div class="location">
				<span>Home</span> <a href="" title="스토어"></a>
			</div>

			<div class="contents">
				<div class="contents-inner-wrap">
					<h2 class="tit">스토어</h2>
					<div class="tab-list">
						<a href="store_main.html">
							<div class="list">새로운 상품</div>
						</a> <a href="store_ticket.html">
							<div class="list">메가티켓</div>
						</a> <a href="store_snack.html">
							<div class="list">팝콘/음료/굿즈</div>
						</a> <a href="store_pointmall.html">
							<div class="list pointmall">포인트몰</div>
						</a>
					</div>
					<!-- <div class="store-main">
                        <div class="best-goods">
                            <a href="">
                                <div class="slogun">
                                    <p class="font-gblue">소중한 분들과 함께</p>
                                    <p class="font-purple">즐거운 관람되세요~</p>
                                </div>
                                <div class="goods">
                                    <p class="name">러브콤보패키지</p>
                                    <p class="txt">2인 관람권 + 러브콤보 [팝콘(L)1 + 탄산음료(R)2]</p>
                                </div>
                                <div class="price">
                                    <p class="sale"><em>32,000</em>
                                        <span>원</span>
                                    </p>
                                    <p class="original">
                                        <em>36,000 원</em>

                                    </p>
                                </div>
                                <p class="img">
                                    <img src="/mini/img/meagapopup.png" alt="">
                                </p>
                            </a>
                        </div> -->
				</div>
				<div class="tit-util">
					<h3 class="tit ticket">메가티켓</h3>
					<a href="#" class="more">더보기></a>
				</div>
				<div class="flex-box">
					<div class="item">
						<a href="#" class="item-a">
							<div class="soldout">SOLD OUT</div>
							<div class="lable event">EVENT</div>
							<div class="img">
								<img src="/mini/img/megapass.jpg" alt="">
							</div>
							<div class="info">
								<div class="tit">
									<p class="name">[송도 돌비 시네마 오픈] 돌피패스 패키지</p>
								</div>
								<div class="price">
									<p class="sale">
										<em>60,000</em> <span>원</span>
									</p>
									<p class="ea">
										<span>0</span> 개 남음
									</p>
								</div>
							</div>
						</a>
					</div>
					<div class="item">
						<a href="#" class="item-a"> <!-- <div class="soldout">SOLD OUT</div> -->
							<div class="lable hot">대표상품</div>
							<div class="img">
								<img src="/mini/img/megaticket1.png" alt="">
							</div>
							<div class="info">
								<div class="tit">
									<p class="name">일반관람권</p>
									<p class="bundle">일반 관람권</p>
								</div>
								<div class="price">
									<p class="sale">
										<em>13,000</em> <span>원</span>
									</p>
									<p class="ea">
										<!-- <span>0</span> 개 남음 -->
									</p>
								</div>
							</div>
						</a>
					</div>
					<div class="item">
						<a href="#" class="item-a"> <!-- <div class="soldout">SOLD OUT</div> -->
							<div class="lable push">추천</div>
							<div class="img">
								<img src="/mini/img/megaticket3.png" alt="">
							</div>
							<div class="info">
								<div class="tit">
									<p class="name">Dolby Cinema 전용 관람권</p>
									<p class="bundle">Dolby Cinema 전용 관람권</p>
								</div>
								<div class="price">
									<p class="sale">
										<em>18,000</em> <span>원</span>
									</p>
									<p class="ea">
										<!-- <span>0</span> 개 남음 -->
									</p>
								</div>
							</div>
						</a>
					</div>
					<div class="item">
						<a href="#" class="item-a"> <!-- <div class="soldout">SOLD OUT</div> -->
							<!-- <div class="lable event">EVENT</div> -->
							<div class="img">
								<img src="/mini/img/megabutique.png" alt="">
							</div>
							<div class="info">
								<div class="tit">
									<p class="name">더 부티크 전용 관람권</p>
									<p class="bundle">더 부티크 전용 관람권</p>
								</div>
								<div class="price">
									<p class="sale">
										<em>15,000</em> <span>원</span>
									</p>
									<p class="ea"></p>
								</div>
							</div>
						</a>
					</div>
				</div>
				<div class="tit-util">
					<h3 class="tit ticket">팝콘/음료/굿즈</h3>
					<a href="#" class="more">더보기></a>
				</div>
				<div class="flex-box">
					<div class="item">
						<a href="#" class="item-a">
							<div class="lable new">NEW</div>
							<div class="img">
								<img src="/mini/img/megacombo.png" alt="">
							</div>
							<div class="info">
								<div class="tit">
									<p class="name">오징어튀김 세트</p>
									<p class="bundle">오징어튀김1 + 탄산음료(L)1</p>
								</div>
								<div class="price">
									<p class="sale">
										<em>8,900</em> <span>원</span>
									</p>
									<p class="ea"></p>
								</div>
							</div>
						</a>
					</div>
					<div class="item">
						<a href="#" class="item-a">
							<div class="lable new">NEW</div>
							<div class="img">
								<img src="/mini/img/megasquid.png" alt="">
							</div>
							<div class="info">
								<div class="tit">
									<p class="name">오징어튀김</p>
									<p class="bundle">오징어튀김1</p>
								</div>
								<div class="price">
									<p class="sale">
										<em>6,900</em> <span>원</span>
									</p>
									<p class="ea"></p>
								</div>
							</div>
						</a>
					</div>
					<div class="item">
						<!-- <a href="#" class="item-a">
                                <div class="lable new">NEW</div>
                                <div class="img">
                                    <img src="/mini/img/megacombo.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="tit">
                                        <p class="name">(특가) 오징어튀김 세트</p>
                                        <p class="bundle">오징어튀김 + 탄산음료(L)1</p>
                                    </div>
                                    <div class="price">
                                        <p class="sale">
                                            <em>60,000</em> <span>원</span>
                                        </p>
                                        <p class="ea">
                                        </p>
                                    </div>
                                </div>
                            </a> -->
					</div>
					<div class="item">
						<!-- <a href="#" class="item-a">
                                <div class="lable hot">대표상품</div>
                                <div class="img">
                                    <img src="/mini/img/megapop.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="tit">
                                        <p class="name">러브콤보</p>
                                        <p class="bundle">팝콘(L)1 + 탄산음료(R)2</p>
                                    </div>
                                    <div class="price">
                                        <p class="sale">
                                            <em>9,900</em> <span>원</span>
                                        </p>
                                        <p class="ea">
                                        </p>
                                    </div>
                                </div>
                            </a> -->
					</div>
				</div>
				<div class="tit-util">
					<!-- <h3 class="tit ticket">포인트몰</h3>
                        <a href="#" class="more">더보기></a> -->
				</div>
				<div class="flex-box">
					<div class="item">
						<!-- <a href="#" class="item-a">
                                <div class="img">
                                    <img src="/mini/img/megaticket1.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="tit">
                                        <p class="name">평일 일반 2D 관람쿠폰</p>
                                        <p class="bundle">일반/컴포트/더 부티크 전용 (월~금,공휴일 제외)</p>
                                    </div>
                                    <div class="price">
                                        <p class="sale">
                                            <em>9,900</em> <span>Point</span>
                                        </p>
                                        <p class="ea">
                                        </p>
                                    </div>
                                </div>
                            </a> -->
					</div>
					<div class="item">
						<!-- <a href="#" class="item-a">
                                <div class="img">
                                    <img src="/mini/img/megaticket2.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="tit">
                                        <p class="name">평일 Dolby Atmos 관람쿠폰</p>
                                        <p class="bundle">Dolby Atmos 전용 예매권(월~금,공휴일 제외)</p>
                                    </div>
                                    <div class="price">
                                        <p class="sale">
                                            <em>10,900</em> <span>Point</span>
                                        </p>
                                        <p class="ea">
                                        </p>
                                    </div>
                                </div>
                            </a> -->
					</div>
					<div class="item">
						<!-- <a href="#" class="item-a">
                                <div class="img">
                                    <img src="/mini/img/megacoupon1.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="tit">
                                        <p class="name">영화 4천원 할인쿠폰</p>
                                        <p class="bundle">일반/컴포트/더 부티크/Dolby Atmos 사용 가능</p>
                                    </div>
                                    <div class="price">
                                        <p class="sale">
                                            <em>2,000</em> <span>Point</span>
                                        </p>
                                        <p class="ea">
                                        </p>
                                    </div>
                                </div>
                            </a> -->
					</div>
					<div class="item">
						<!-- <a href="#" class="item-a">
                                <div class="img">
                                    <img src="/mini/img/megacoupon2.png" alt="">
                                </div>
                                <div class="info">
                                    <div class="tit">
                                        <p class="name">영화 3천원 할인쿠폰</p>
                                        <p class="bundle">일반/컴포트/더 부티크/Dolby Atmos 사용 가능</p>
                                    </div>
                                    <div class="price">
                                        <p class="sale">
                                            <em>1,500</em> <span>Point</span>
                                        </p>
                                        <p class="ea">
                                        </p>
                                    </div>
                                </div>
                            </a> -->
					</div>
				</div>
			</div>
		</div>
		</div>
	</section>
	<footer id="wrap-footer">
		<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
			Dolores nemo voluptatum inventore numquam, deleniti suscipit facere
			ea sed fuga officiis natus consequuntur sequi, ducimus quia soluta
			optio ex exercitationem quidem?</p>
	</footer>
</body>

</html>