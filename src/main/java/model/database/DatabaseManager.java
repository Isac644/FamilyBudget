package model.database;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DatabaseManager {			
	private static final String FILE_PATH = "resources/db.json";
	private final ObjectMapper objectMapper;
	private Database database;

	public DatabaseManager() {
		objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
		loadDatabase();
	}
	
	public Database getDatabase() {
		return database;
	}

	private void loadDatabase() {
		File file = new File(FILE_PATH);
		try {
			if(file.exists()) {
				database = objectMapper.readValue(file, Database.class);
			} else {
				database = new Database();
				saveDatabase();
			}
		} catch (IOException e) {
			throw new RuntimeException("Failed to save database", e);
		}
	}

	private void saveDatabase() {
		try {
			objectMapper.writeValue(new File(FILE_PATH), database);
		} catch (IOException e) {
			throw new RuntimeException("Failed to save database");
		}
	}
}
