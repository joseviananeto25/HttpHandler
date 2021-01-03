package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class DefaultRequestHandler implements HttpRequestHandler {

	@Override
	public String request(String url, String method, String body) throws UtilException {

		String response = null;
		
		try {

//			URL urlRequest = new URL(url);
			HttpURLConnection httpURLConnection = 
					(HttpURLConnection) new URL(url).openConnection();
			httpURLConnection.setRequestMethod(method.toUpperCase());
			
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(httpURLConnection.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = bufferedReader.readLine()) != null) {
				content.append(inputLine);
			}
			bufferedReader.close();
			
			response = content.toString();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
	}

}
