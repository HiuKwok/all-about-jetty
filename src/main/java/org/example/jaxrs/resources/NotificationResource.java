package org.example.jaxrs.resources;

import jakarta.ws.rs.Path;

/**
 * At the end of the day, JAX-RS is just a layer on top of servlet.
 */
@Path("/notifications")
public class NotificationResource {
//    @GET
//    @Path("/ping")
//    public Response ping() {
//        return Response.ok().entity("Service online").build();
//    }
//
//    @GET
//    @Path("/get/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getNotification(@PathParam("id") int id) {
//        return Response.ok()
//                .entity(new Notification(id, "john", "test notification"))
//                .build();
//    }
//
//    @POST
//    @Path("/post/")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response postNotification(Notification notification) {
//        return Response.status(201).entity(notification).build();
//    }
}