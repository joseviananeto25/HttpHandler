package util;

public interface HttpRequestHandler {
	
	public String request(String url, String method, String body) throws UtilException;

}
