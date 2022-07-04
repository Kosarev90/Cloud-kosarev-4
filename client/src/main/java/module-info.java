module ru.kosarev.client.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kosarev.cloud.cloud to javafx.fxml;
    exports ru.kosarev.cloud;
}