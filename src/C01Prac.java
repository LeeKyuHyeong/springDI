
public class C01Prac {
	private static Settings settings;
	private C01Prac() {
		
	}
	static Settings getSettings() {
		if(settings == null) {
			settings = new Settings();
		}
		return settings;
	}
}

class Settings {
	
}