package no.nav.teamkatalog.client

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class TeamKatalogClient {

    val client = HttpClient() {
        install(ContentNegotiation) {
            json( Json { ignoreUnknownKeys = true
                         isLenient = true} )
        }
    }

    suspend fun hentMedlemmerIAvdeling(agressoId: String) :OrganisasjonsenhetDto {
        val response: OrganisasjonsenhetDto = client.get("https://teamkatalog-api.dev.intern.nav.no/org/$agressoId").body()

        return response
    }

}