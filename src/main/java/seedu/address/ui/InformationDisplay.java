package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import seedu.address.model.person.Person;

/**
 * An UI component that displays information of a {@code Person} when selected.
 */
public class InformationDisplay extends UiPart<Region> {

    public static final String NO_PERSON_SELECTED_MESSAGE = "";
    private static final String FXML = "InformationDisplay.fxml";

    public final Person person;

    @FXML
    private AnchorPane displayPane;
    @FXML
    private FlowPane tags;
    @FXML
    private ImageView photo;
    @FXML
    private Label name;
    @FXML
    private Label phone;
    @FXML
    private Label address;
    @FXML
    private Label email;
    @FXML
    private Label attendanceRate;
    @FXML
    private Label performance;

    public InformationDisplay(Person selectedPerson) {
        super(FXML);
        this.person = selectedPerson;
        name.setText(this.person.getName().fullName);
        phone.setText(this.person.getPhone().value);
        address.setText(this.person.getAddress().value);
        email.setText(this.person.getEmail().value);
        //setText of attendance and performance. Should attendance and performance be tag to a person?
        attendanceRate.setText("0%");
        performance.setText("superb");
    }
}