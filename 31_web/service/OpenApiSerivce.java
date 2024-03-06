package jdbc.common.model.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.Gson;

import jdbc.common.JdbcTemplate;
import jdbc.common.model.vo.OpenApiVo;

//	http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty
public class OpenApiSerivce { // ArpltnInforInqireSvc
	private Properties prop = new Properties();

	public void getMinuDustFrcstDspth() {

	}

	public List<OpenApiVo> getCtprvnRltmMesureDnstyByJson() throws IOException {
		List<OpenApiVo> volist = null;
		String currentPath = JdbcTemplate.class.getResource("./").getPath();
		prop.load(new FileReader(currentPath + "driver.properties"));
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + URLEncoder
				.encode(prop.getProperty("openapi.servicekey.ArpltnInforInqireSvc", "UTF-8"))); /* Service Key */
		urlBuilder.append("&" + URLEncoder.encode("returnType", "UTF-8") + "="
				+ URLEncoder.encode("json", "UTF-8")); /* xml 또는 json */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("100", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("sidoName", "UTF-8") + "=" + URLEncoder.encode("서울",
				"UTF-8")); /*
							 * 시도 이름(전국, 서울, 부산, 대구, 인천, 광주, 대전, 울산, 경기, 강원, 충북, 충남, 전북, 전남, 경북, 경남, 제주, 세종)
							 */
		urlBuilder.append(
				"&" + URLEncoder.encode("ver", "UTF-8") + "=" + URLEncoder.encode("1.0", "UTF-8")); /* 버전별 상세 결과 참고 */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}

		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
//		        System.out.println(sb.toString());
//				return sb.toString();
		Gson gson = new Gson();
		gson.fromJson(sb.toString(), (Type) new HashMap());
		gson.toJson(null);

		Document doc = parseXML(conn.getInputStream());
		conn.disconnect();
		// item들을 NodeList nodelist 담기
		NodeList nodelist = doc.getElementsByTagName("item");
		// item 데이터가 없으면 바로 null return;
		if (nodelist.getLength() < 1) {
			return volist;
		}
		// item 데이터가 있다면

		volist = new ArrayList<OpenApiVo>();
		for (int i = 0; i < nodelist.getLength(); i++) {
			Node item = nodelist.item(i);
			Node n = item.getFirstChild();
			OpenApiVo vo = new OpenApiVo();
			while (n != null) {
				String nodeName = n.getNodeName();
				String nodeText = n.getTextContent();
				System.out.println(nodeName + " " + nodeText);
				switch (nodeName) {
				case "stationName":
					vo.setStationName(nodeText);
					break;
				case "dataTime":
					vo.setDataTime(nodeText);
					break;
				case "pm10Value":
					vo.setPm10Value(nodeText);
					break;
				case "so2Value":
					vo.setSo2Value(nodeText);
					break;
				case "so2Grade":
					vo.setSo2Grade(nodeText);
					break;
				}
				n = n.getNextSibling();
			}
			volist.add(vo);
		}
		return volist;
	}

	// xml to Java parse / Object
	private Document parseXML(InputStream stream) {
		DocumentBuilderFactory objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder objDocumentBuilder = null;
		Document result = null;

		try {
			objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
			result = objDocumentBuilder.parse(stream);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) { // Simple API for XML
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
