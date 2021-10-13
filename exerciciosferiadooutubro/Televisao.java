package exerciciosferiadooutubro;

public class Televisao {

	private int volume;
	private int canal;
	private boolean ligado;

	public Televisao() {
		super();
	}

	public Televisao(int volume, int canal, boolean ligado) {
		super();
		this.volume = volume;
		this.canal = canal;
		this.ligado = ligado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
