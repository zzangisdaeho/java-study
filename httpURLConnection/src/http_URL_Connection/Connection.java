package http_URL_Connection;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://localhost:9999/count");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			InputStream inputStream = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			
			String temp;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("망함;;;");
		}
	}

}
