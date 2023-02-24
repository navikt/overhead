package no.nav.teamkatalog.client

import kotlinx.serialization.Serializable

@Serializable
data class OrganisasjonsenhetDto(val agressoId: String, val koblinger: List<OrganisasjonsenhetsKoblingDto>)
@Serializable
data class OrganisasjonsenhetsKoblingDto(val ressurs: RessursDto)
@Serializable
data class RessursDto(val navIdent: String)
