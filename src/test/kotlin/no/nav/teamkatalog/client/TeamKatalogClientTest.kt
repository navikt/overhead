package no.nav.teamkatalog.client

import kotlinx.coroutines.runBlocking
import org.junit.Ignore
import org.junit.Test


class TeamKatalogClientTest {

    val client = TeamKatalogClient()

    @Test
    @Ignore
    //Funker ikke fra GitHub til Dev
    fun hentOrganisasjonsEnhetTest() {

        val response: OrganisasjonsenhetDto = runBlocking { client.hentMedlemmerIAvdeling("8552108") }

        println("Antall:" + response.agressoId)
    }

}