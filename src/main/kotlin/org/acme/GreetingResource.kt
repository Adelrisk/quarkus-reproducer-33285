package org.acme

import io.smallrye.mutiny.Uni
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.acme.domain.Document

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello from RESTEasy Reactive"

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun list(): Uni<List<String>> {
        return Document.findAll().list().map { documents ->
            documents.map { document -> document.filename }
        }
    }
}