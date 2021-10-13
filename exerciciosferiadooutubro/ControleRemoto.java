package exerciciosferiadooutubro;

public class ControleRemoto {
	private int volumeMaximo = 100;
	private int volumeMinimo = 0;
	private int canalMaximo = 100;
	private int canalMinimo = 0;
	private int volume;
	private int canal;

	Televisao televisao = new Televisao();

	public ControleRemoto() {
		super();
	}

	public ControleRemoto(int volumeMaximo, int canalMaximo) {
		super();
		this.volumeMaximo = volumeMaximo;
		this.canalMaximo = canalMaximo;
	}

	public void aumentarVolume() {
		volume = televisao.getVolume();
		if (volume < volumeMaximo) {
			televisao.setVolume(volume);
		} else {
			System.out.println("Volume máximo");
		}

	}

	public void diminuirVolume() {
		volume = televisao.getVolume();
		if (volume < volumeMinimo) {
			televisao.setVolume(volume);
		} else {
			System.out.println("Volume mínimo");
		}

	}

	public void subirCanal() {
		canal = televisao.getCanal();
		if (canal < canalMaximo) {
			televisao.setVolume(canal);
		} else {
			System.out.println("Canal máximo");
		}

	}

	public void descerCanal() {
		canal = televisao.getCanal();
		if (canal < canalMinimo) {
			televisao.setVolume(canal);
		} else {
			System.out.println("Canal mínimo");
		}

	}

	public int getVolumeMaximo() {
		return volumeMaximo;
	}

	public void setVolumeMaximo(int volumeMaximo) {
		this.volumeMaximo = volumeMaximo;
	}

	public int getCanalMaximo() {
		return canalMaximo;
	}

	public void setCanalMaximo(int canalMaximo) {
		this.canalMaximo = canalMaximo;
	}

	public Televisao getTelevisao() {
		return televisao;
	}

	public void setTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolumeMinimo() {
		return volumeMinimo;
	}

	public void setVolumeMinimo(int volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}

	public int getCanalMinimo() {
		return canalMinimo;
	}

	public void setCanalMinimo(int canalMinimo) {
		this.canalMinimo = canalMinimo;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

}
