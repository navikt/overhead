package no.nav.teamkatalog.client

import kotlinx.coroutines.runBlocking
import org.junit.Test


class TeamKatalogClientTest {

    val client = TeamKatalogClient()

    @Test
    fun hentOrganisasjonsEnhetTest() {

        val response: OrganisasjonsenhetDto = runBlocking { client.hentMedlemmerIAvdeling("8552108") }

        println("Antall:" + response.koblinger.size)
    }

}