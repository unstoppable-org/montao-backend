package org.irreprimivel.montao.api.user

import com.fasterxml.jackson.annotation.JsonFilter
import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "users")
@JsonFilter("user")
data class User(@Id
                @GeneratedValue(strategy = GenerationType.AUTO)
                val id: Long?,

                @NotNull
                @Column(name = "uuid", nullable = false, unique = true)
                val uuid: String,

                @NotNull
                @Column(name = "username", nullable = false, unique = true)
                val username: String,

                @NotNull
                @Column(name = "password", nullable = false)
                @JsonIgnore
                val password: String,

                @NotNull
                @Column(name = "email", nullable = false, unique = true)
                val email: String,

                @NotNull
                @Column(name = "role", nullable = false)
                @JsonIgnore
                val role: String,

                @NotNull
                @Column(name = "is_confirmed", nullable = false)
                val isConfirmed: Boolean,

                @NotNull
                @Column(name = "is_locked", nullable = false)
                val isLocked: Boolean,

                @NotNull
                @Column(name = "registration_date", nullable = false)
                val createdAt: LocalDate
)