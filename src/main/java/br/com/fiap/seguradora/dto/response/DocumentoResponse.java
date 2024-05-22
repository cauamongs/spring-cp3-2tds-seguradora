
package br.com.fiap.seguradora.dto.response;

import br.com.fiap.seguradora.entity.TipoDocumento;
import lombok.Builder;

@Builder
public record DocumentoResponse(
        Long id,
        String numero,
        TipoDocumento tipo
) {
}
