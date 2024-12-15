package com.aluracursos.radioalura.modelos;

public class MisFavoritos {

	public void adiciona(Audio audio) { //Audio porque puede ser tanto una canción o un podcast
		if(audio.getClasificacion() >= 8) {
			System.out.println("\n" + audio.getTitulo() + " Es uno de los favoritos del momento");
		} else {
			System.out.print(audio.getTitulo() + " No está dentro de los más preferidos");
		}
		
	}
}
