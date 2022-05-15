package example.soundboard;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label selectedButton;
    @FXML
    private Label soundTitle;
    @FXML
    private Label uploadedSound;
    @FXML
    private Button S1;
    @FXML
    private Button S2;
    @FXML
    private Button S3;
    @FXML
    private Button S4;
    @FXML
    private Button S5;
    @FXML
    private Button S6;
    @FXML
    private Button S7;
    @FXML
    private Button S8;
    @FXML
    private Button S9;
    @FXML
    private Button S10;
    @FXML
    private Button S11;
    @FXML
    private Button S12;
    @FXML
    private Button fileOpen;

    private File selectedFile = null;
    private final ArrayList<File> files = new ArrayList<>();
    private AudioClip mediaPlayer = null;

    private final ArrayList<Button> buttons = new ArrayList<>();

    @FXML
    protected void sound1() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(0)) {
            System.out.println(files.get(0));
            Media sound = new Media(new File(String.valueOf(files.get(0))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound2() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(1)) {
            System.out.println(files.get(1 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(1 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound3() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(2)) {
            System.out.println(files.get(2 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(2 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound4() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(3)) {
            System.out.println(files.get(3 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(3 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound5() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(4)) {
            System.out.println(files.get(4 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(4 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound6() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(5)) {
            System.out.println(files.get(5 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(5 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound7() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(6)) {
            System.out.println(files.get(6 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(6 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound8() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(7)) {
            System.out.println(files.get(7 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(7 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound9() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(8)) {
            System.out.println(files.get(8 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(8 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound10() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(9)) {
            System.out.println(files.get(9 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(9 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound11() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(10)) {
            System.out.println(files.get(10 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(10 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void sound12() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if (null != files.get(11)) {
            System.out.println(files.get(11 % files.size()));
            Media sound = new Media(new File(String.valueOf(files.get(11 % files.size()))).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void stop() {
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
    }

    private int selectedIndex = -1;

    @FXML
    protected void loadSound1() {
        selectedIndex = 0;
        selectedButton.setText("Sound Button 1:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(0).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound2() {
        selectedIndex = 1;
        selectedButton.setText("Sound Button 2:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(1).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound3() {
        selectedIndex = 2;
        selectedButton.setText("Sound Button 3:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(2).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound4() {
        selectedIndex = 3;
        selectedButton.setText("Sound Button 4:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(3).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound5() {
        selectedIndex = 4;
        selectedButton.setText("Sound Button 5:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(4).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound6() {
        selectedIndex = 5;
        selectedButton.setText("Sound Button 6:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(5).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound7() {
        selectedIndex = 6;
        selectedButton.setText("Sound Button 7:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(6).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound8() {
        selectedIndex = 7;
        selectedButton.setText("Sound Button 8:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(7).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound9() {
        selectedIndex = 8;
        selectedButton.setText("Sound Button 9:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(8).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound10() {
        selectedIndex = 9;
        selectedButton.setText("Sound Button 10:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(9).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound11() {
        selectedIndex = 10;
        selectedButton.setText("Sound Button 11:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(10).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    protected void loadSound12() {
        selectedIndex = 11;
        selectedButton.setText("Sound Button 12:");
        if (null != files.get(selectedIndex)) {
            soundTitle.setText(files.get(11).toString().substring(6));
        } else {
            soundTitle.setText("No File Found");
        }
    }

    @FXML
    public void open() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("mp3", "*.mp3"),
            new FileChooser.ExtensionFilter("All Files", "*.*"));
        selectedFile = fileChooser.showOpenDialog(fileOpen.getScene().getWindow());
        if (null != selectedFile) {
            uploadedSound.setText(selectedFile.getName());
        }
    }


    @FXML
    public void addReplace() throws IOException {
        File prevFile = files.get(selectedIndex);
        if(-1 != selectedIndex && null != selectedFile){
            //System.out.println("Sound/"+selectedFile.getName());
            try {
                Files.copy(selectedFile.toPath(), Paths.get("Sound/"+selectedFile.getName()), StandardCopyOption.REPLACE_EXISTING);
                files.set(selectedIndex, new File("Sound/"+selectedFile.getName()));
                buttons.get(selectedIndex).setText(files.get(selectedIndex).toString().substring(6,files.get(selectedIndex).toString().length()-4));
                buttons.get(selectedIndex).setDisable(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (-1 != selectedIndex && null != selectedFile){
            if(null != files.get(selectedIndex) &&
                null!= prevFile &&
                !Objects.equals(prevFile, new File("Sound/" + selectedFile.getName()))){
                Files.deleteIfExists(prevFile.toPath());
            }
        }
    }

    @FXML
    public void playTest(){
        if (null != mediaPlayer) {
            mediaPlayer.stop();
        }
        if(null != selectedFile) {
            Media sound = new Media(new File(String.valueOf(selectedFile)).toURI().toString());
            mediaPlayer = new AudioClip(sound.getSource());
            mediaPlayer.play();
        }
    }
    @FXML
    public void handleDragOver(DragEvent event){
        if(event.getDragboard().hasFiles()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
    @FXML
    public void handleDrop(DragEvent event){
        //List<File> files = event.getDragboard().getFiles();
        if (event.getDragboard().getFiles().get(0).getName().toLowerCase().endsWith(".mp3")) {
            selectedFile = event.getDragboard().getFiles().get(0);
            uploadedSound.setText(selectedFile.getName());
        }else {
            uploadedSound.setText("Invalid File. Upload .mp3");
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File folder = new File("Sound");
        File[] listOfFiles = folder.listFiles();

        for(int i=0;i<12;i++) {
            files.add(null);
        }

        for (int i = 0; i < Objects.requireNonNull(listOfFiles).length; i++) {
            if (listOfFiles[i].isFile() &&
                listOfFiles[i].getName().toLowerCase().endsWith(".mp3")){
                //System.out.println(listOfFiles[i].getName());
                files.set(i, listOfFiles[i]);
            }
        }

        buttons.add(S1);
        buttons.add(S2);
        buttons.add(S3);
        buttons.add(S4);
        buttons.add(S5);
        buttons.add(S6);
        buttons.add(S7);
        buttons.add(S8);
        buttons.add(S9);
        buttons.add(S10);
        buttons.add(S11);
        buttons.add(S12);

        for(int i=1;i<13;i++) {
            if (null != files.get(i-1)) {
                buttons.get(i-1).setText(files.get(i-1).toString().substring(6,files.get(i-1).toString().length()-4));
                buttons.get(i-1).setDisable(false);
            }
        }
    }
}