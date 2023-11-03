package org.starking.websocketsession;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

/**
 * @author pedroRhamon
 */

@ServerEndpoint("/websocket")
public class WebSocketEndpoint {
	
	@OnOpen
	public void onOpen(Session session) {
		
	}
	
	@OnClose
    public void onClose(Session session) {
		
	}
	
	@OnMessage
    public void onMessage(String message, Session session) {
		
	}

}
