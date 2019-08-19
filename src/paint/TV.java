package paint;
/*
 * 작성자 : 안태영
 * 작성일 : 2019.08.09
 * 요구조건 
 * 1. 볼륨은 '0'이 되면 더 이상 내려가지 않도록
 * 2. 채널은 로테이션이 돌도록!!!
 * 3. 오버로드 필수
 */
public class TV {

	private static int channel; // 상태값을 저장하기 위해서 static 선언

	private static int volume; // 상태값을 저장하기 위해서 static 선언

	private boolean power;


	public TV() {
		status();
	}

	public TV(int channel, int volume, boolean power) {
		super();

		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
	
//////////////////////////////////////////////////////////////////////////////
	// 전원 On / Off
	public void power(boolean turn) {
		if (turn) {
			System.out.println("Tv가 켜졌습니다: 채널 :" + channel + "번 / 볼륨 : " + volume);
			power = true;
		} else {
			System.out.println("Tv가 꺼졌습니다.");
			power = false;
		}
	}
////////////////////////////////////////////////////////////////////////////////
	// 볼륨조절!!!
	
	// 볼륨조절!!! 디지털 방식
	public void volume(int vol) {
		System.out.println("현재 볼륨 :" + volume);

		if (volume > 100) {
			System.out.println("최대 볼륨입니다.");
		} else if (volume == 0) {
			System.out.println("볼륨이 0입니다/");
		} else if (vol > 100 || vol < 0) {
			System.out.println("볼륨 입력 범위 초과 입니다.");
		} else {
			volume = vol;
		}
	}

	// 볼륨조절!!! 아날로그 방식
	public void volume(boolean updown) {
		System.out.println("현재 볼룸 :" + volume);

		if (updown) {
			if (volume == 100) {
				System.out.println("최대 볼륨입니다.");
			} else {
				volume += 1;
				System.out.println("현재 볼륨 :" + volume);
			}
		} else {
			if (volume == 0) {
				System.out.println("볼륨이 0 입니다.");
			} else {
				volume -= 1;
				System.out.println("현재 볼륨 :" + volume);
			}
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////
	// 채널변경!!

	//채널변경!!! 디지털 방식
	public void channel(int ch) {

		if (ch == 0) {
			System.out.println("없는 채널 입니다.");
		} else {
			if (ch > 0 && ch < 256) {
				channel = ch;
			}
		}
	}
	
	//채널변경!!! 아날로그 방식
	public void channel(boolean up) {
		
		if(channel == 0) {
			channel = 255;
		}else if(channel == 255) {
			channel = 1;
		}
		
		if(up) {
			channel += 1;
		}else {
			channel -= 1;
		}
	}
////////////////////////////////////////////////////////////////////////////////
}
