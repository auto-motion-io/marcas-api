package marcasapi.dto;

import marcasapi.entity.Marca;

import java.util.List;

public class MarcaMapper {

    public static MarcaConsultaDTO toDto(Marca marca){
        MarcaConsultaDTO dto = new MarcaConsultaDTO();

        dto.setCodigo(marca.getCodigo());
        dto.setNome(marca.getNome());

        return dto;
    }

    public static List<MarcaConsultaDTO> toDto(List<Marca> entities){
        return entities.stream().map(MarcaMapper::toDto).toList();
    }
}
