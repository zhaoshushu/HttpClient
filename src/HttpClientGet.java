import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientGet {

	public static void main(String[] args) {
		new Get().start();
	}
	
	static class Get extends Thread{
		
		HttpClient httpClient = HttpClients.createDefault();
		
		public void run() {
			    HttpGet httpGet = new HttpGet("http://www.baidu.com");
			    
			try {
				
				HttpResponse httpResponse = httpClient.execute(httpGet);
				HttpEntity httpEntity = httpResponse.getEntity();
				String result = EntityUtils.toString(httpEntity,"UTF-8");
				
				
				System.out.println(result);
				
				
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
		}
	}

}
