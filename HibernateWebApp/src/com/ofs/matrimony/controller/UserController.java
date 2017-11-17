package com.ofs.matrimony.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.codehaus.jettison.json.JSONObject;

import com.ofs.matrimony.model.User;
import com.ofs.matrimony.service.UserService;
import com.ofs.matrimony.service.UserServiceImpl;

@Path("/user")
public class UserController {
	
	UserService userService = new UserServiceImpl();

	@Path("/auth")
	@GET
	@Produces("application/json")
	public String authUserByEmail(
			@QueryParam("user") User user_details
					
			) throws Exception
	{
	
		User user = userService.findById(user_details.getId());
		
		String response="";
		JSONObject jsonObject = new JSONObject();
		
		//if(email.equalsIgnoreCase(user.getEmailid()) && pwd.equalsIgnoreCase(user.getId()))		{
		
		jsonObject.put("Status", "Success");
		jsonObject.put("name", user.getUserName());
		jsonObject.put("email", user.getEmailid());
		jsonObject.put("uid", user.getEmailid());
		
		response = jsonObject.toString();
	
		//}
		/*else{
			
			jsonObject.put("Status","Failure");			
			response = jsonObject.toString();
			
		}*/
		
		return response;
	}
	@Path("/add")
	@GET
	@Consumes("text/html")
	@Produces("text/html")
	public String addUser(
			@QueryParam("user") User user		
			)
	{
		//User user = new User();
	return userService.addUser(user);
	}
	
	
	
}