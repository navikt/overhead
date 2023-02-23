package no.nav.teamkatalog.client

import kotlinx.serialization.Serializable

@Serializable
data class OrganisasjonsenhetDto(val koblinger: List<RessursDto>)
@Serializable
data class RessursDto(val navIdent: String)
