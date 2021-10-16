package br.com.gsl.controleDeAcesso.POJO;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import br.com.gsl.controleDeAcesso.entity.Permission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPOJO implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 4829887310009236576L;

	private String userName;
	private String password;
	
	private List<Permission> permissions;
	
	
}
