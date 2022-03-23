package br.com.foodtrack.tracking.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "rastreamento")
public class Rastreamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer codigoRastreamento;
	
	@Column(name = "latitude")
	private Double latitude;
	
	@Column(name = "longitude")
	private Double longitude;
	
	@Column(name = "tempo")
	private LocalDateTime tempo;
	
	
	@ManyToOne
	@JoinColumn(name = "idPedido")
	@JsonIgnoreProperties("listaRastreamentoPedidos")
	private Pedido pedido;


	public Integer getCodigoRastreamento() {
		return codigoRastreamento;
	}


	public void setCodigoRastreamento(Integer codigoRastreamento) {
		this.codigoRastreamento = codigoRastreamento;
	}


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}


	public LocalDateTime getTempo() {
		return tempo;
	}


	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	


	
}
