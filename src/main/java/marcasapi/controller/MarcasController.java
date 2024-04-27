package marcasapi.controller;

import marcasapi.dto.MarcaConsultaDTO;
import marcasapi.dto.MarcaMapper;
import marcasapi.entity.Marca;
import marcasapi.repository.MarcasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcasController {

    @Autowired
    private MarcasRepository repository;

    @GetMapping("/carros")
    public ResponseEntity<List<MarcaConsultaDTO>> buscarCarros(){
        List<Marca> carros = this.repository.findAllByTpVeiculoIsOrderByNome("CARRO");

        if (carros.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        List<MarcaConsultaDTO> dto = MarcaMapper.toDto(carros);
        return ResponseEntity.status(200).body(dto);
    }

    @GetMapping("/motos")
    public ResponseEntity<List<MarcaConsultaDTO>> buscarMotos(){
        List<Marca> motos = this.repository.findAllByTpVeiculoIsOrderByNome("MOTO");

        if (motos.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        List<MarcaConsultaDTO> dto = MarcaMapper.toDto(motos);
        return ResponseEntity.status(200).body(dto);
    }

    @GetMapping("/caminhoes")
    public ResponseEntity<List<MarcaConsultaDTO>> buscarCaminhoes(){
        List<Marca> caminhoes = this.repository.findAllByTpVeiculoIsOrderByNome("CAMINHAO");

        if (caminhoes.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        List<MarcaConsultaDTO> dto = MarcaMapper.toDto(caminhoes);
        return ResponseEntity.status(200).body(dto);
    }

    @GetMapping()
    public ResponseEntity<List<Marca>> buscarTodos(){
        List<Marca> todos = this.repository.findAll();

        if (todos.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(todos);
    }
}
