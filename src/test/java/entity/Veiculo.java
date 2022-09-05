package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_VEICULO")
public class Veiculo {
	
	
	@Id
	@Column(name = "ID_VEICULO")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	@Column(name = "ID_FABRICANTE")
	private String fabricante;
	
	@Column(name = "ID_MODELO")
	private String modelo;
	
	@Column(name = "ID_ANOFABRICACAO")
	private Integer anoFabricacao;
	
	@Column(name = "ID_ANOMODELO")
	private Integer anoModelo;
	
	@Column(name = "ID_VALOR")
	private double valor;
    
	
}
