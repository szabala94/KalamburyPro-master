package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Application dictionary containing useful constances.
 * 
 * @author Piotr Ko�odziejski
 */
@Entity
@Table(name = "s�ownik_aplikacji")
public class AppDictionary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idad;

	@Column(name = "klucz")
	private String key;

	@Column(name = "warto��")
	private String value;

}
