package com.empresa.mcp.api;
import com.empresa.mcp.ai.ChatService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class ChatResource {
   @Inject
    ChatService chatService;

    @POST
    public String chat(String message) {
        return chatService.ask(message);
    }
}

