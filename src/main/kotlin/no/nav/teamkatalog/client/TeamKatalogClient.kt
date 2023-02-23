package no.nav.teamkatalog.client

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*

class TeamKatalogClient {

    val client = HttpClient() {
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun hentMedlemmerIAvdeling(agressoId: String) :OrganisasjonsenhetDto {
        val response: OrganisasjonsenhetDto = client.get("https://teamkatalog-api.dev.intern.nav.no/org/$agressoId").body()

        return response
    }

}