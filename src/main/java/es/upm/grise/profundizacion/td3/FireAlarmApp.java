package es.upm.grise.profundizacion.td3;

public class FireAlarmApp {

	public static void main(String[] args) {

		try {

			String query = "SELECT * FROM SENSORS";
			FireAlarm fireAlarm = new FireAlarm(query);

			// Main loop
			while (true) {

				if (fireAlarm.isTemperatureTooHigh()) {
					
					// ...
				}

			}

		} catch (ConfigurationFileProblemException e) {

			// ...

		} catch (DatabaseProblemException e) {

			// ...

		} catch (SensorConnectionProblemException e) {

			// ...

		} catch (IncorrectDataException e) {

			// ...

		}

	}

}
