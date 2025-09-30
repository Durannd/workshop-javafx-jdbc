module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	
	opens model.entities to javafx.base;
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
    exports gui;
}
