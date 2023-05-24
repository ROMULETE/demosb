package ec.edu.insteclrg.domain;

import java.sql.Date;

import enums.Sexo;
import enums.TipoComunicado;
import enums.TipoIdentificacion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity

public class Comunicado {
			
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(updatable = false, nullable = false)
			private Long id;
			
			@Column(nullable = false, length = 200)
			private TipoIdentificacion titulo;
			
			@Column(nullable = false, length = 200)
			private TipoIdentificacion descripcion;
		
			@Column()
			private Date fecha;
			
			@Column(nullable = false)
			private TipoComunicado tipoComunicado;
			
			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn( nullable = false)
			private Barrio barrio;
			
			
}
