package tv;

public class TV {
	private boolean power;
	private int channel;	//0~50
	private int volume;		//0~50



	public TV(int channel, int volume, boolean power) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}

	public void power(boolean on) {
		if(on) {
			this.power=true;
		}else {
			this.power=false;
		}
	}

	public void channel(int channel) {
		if(this.power) {
			this.channel = channel;
		}else {
			System.out.println("TV On...Please");
		}
	}

	public void channel(boolean up) {
		if(this.power) {
			if(up) {
				this.channel++;			
				if(this.channel==51) {
					this.channel=0;
				}
			}else {
				this.channel--;
				if(this.channel==-1) {
					this.channel=50;
				}
			}
		}else {
			System.out.println("TV On...Please");
		}
	}

	public void volume(int volume) {
		if(this.power) {
			this.volume = volume;
		}else {
			System.out.println("TV On...Please");
		}
	}

	public void volume(boolean up) {
		if(this.power) {
			if(up) {
				this.volume++;			
				if(this.volume==51) {
					this.volume=0;
				}
			}else {
				this.volume--;
				if(this.volume==-1) {
					this.volume=50;
				}
			}
		}else {
			System.out.println("TV On...Please");
		}
	}

	public void status() {
		System.out.println("TV[power="+power+
				", channel="+channel+
				", volume="+volume+"]");
	}

}
