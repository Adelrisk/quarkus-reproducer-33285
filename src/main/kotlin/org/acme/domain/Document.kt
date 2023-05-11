package org.acme.domain


import io.quarkus.hibernate.reactive.panache.kotlin.PanacheCompanionBase
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheEntityBase
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*


/**
 * @author Mike Prechtl
 * @author Michael Rauh
 */
@Entity
@Table(name = "document")
open class Document : PanacheEntityBase {

    companion object : PanacheCompanionBase<Document, UUID> {

    }

    @Id
    var id: UUID? = null

    lateinit var mimetype: String
    lateinit var extension: String

    lateinit var filename: String

    @CreationTimestamp
    @Column(name = "created_at")
    lateinit var createdAt: Instant

    @UpdateTimestamp
    @Column(name = "last_modified")
    lateinit var lastModified: Instant

}
