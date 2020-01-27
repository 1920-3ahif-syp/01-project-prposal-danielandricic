package at.htl.workmanager;

import com.sun.glass.ui.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class UserWindowController extends Application {
    @Override
    protected void runLoop(Runnable runnable) {

    }

    @Override
    protected void _invokeAndWait(Runnable runnable) {

    }

    @Override
    protected void _invokeLater(Runnable runnable) {

    }

    @Override
    protected Object _enterNestedEventLoop() {
        return null;
    }

    @Override
    protected void _leaveNestedEventLoop(Object o) {

    }

    @Override
    public Window createWindow(Window window, Screen screen, int i) {
        return null;
    }

    @Override
    public Window createWindow(long l) {
        return null;
    }

    @Override
    public View createView() {
        return null;
    }

    @Override
    public Cursor createCursor(int i) {
        return null;
    }

    @Override
    public Cursor createCursor(int i, int i1, Pixels pixels) {
        return null;
    }

    @Override
    protected void staticCursor_setVisible(boolean b) {

    }

    @Override
    protected Size staticCursor_getBestSize(int i, int i1) {
        return null;
    }

    @Override
    public Pixels createPixels(int i, int i1, ByteBuffer byteBuffer) {
        return null;
    }

    @Override
    public Pixels createPixels(int i, int i1, IntBuffer intBuffer) {
        return null;
    }

    @Override
    public Pixels createPixels(int i, int i1, IntBuffer intBuffer, float v, float v1) {
        return null;
    }

    @Override
    protected int staticPixels_getNativeFormat() {
        return 0;
    }

    @Override
    public GlassRobot createRobot() {
        return null;
    }

    @Override
    protected double staticScreen_getVideoRefreshPeriod() {
        return 0;
    }

    @Override
    protected Screen[] staticScreen_getScreens() {
        return new Screen[0];
    }

    @Override
    public Timer createTimer(Runnable runnable) {
        return null;
    }

    @Override
    protected int staticTimer_getMinPeriod() {
        return 0;
    }

    @Override
    protected int staticTimer_getMaxPeriod() {
        return 0;
    }

    @Override
    protected CommonDialogs.FileChooserResult staticCommonDialogs_showFileChooser(Window window, String s, String s1, String s2, int i, boolean b, CommonDialogs.ExtensionFilter[] extensionFilters, int i1) {
        return null;
    }

    @Override
    protected File staticCommonDialogs_showFolderChooser(Window window, String s, String s1) {
        return null;
    }

    @Override
    protected long staticView_getMultiClickTime() {
        return 0;
    }

    @Override
    protected int staticView_getMultiClickMaxX() {
        return 0;
    }

    @Override
    protected int staticView_getMultiClickMaxY() {
        return 0;
    }

    @Override
    protected boolean _supportsTransparentWindows() {
        return false;
    }

    @Override
    protected boolean _supportsUnifiedWindows() {
        return false;
    }

    @Override
    protected int _getKeyCodeForChar(char c) {
        return 0;
    }

    private Parent parent;
    private Scene scene;
    private Stage stage;
    @FXML
    private Text welcomeText;

    public UserWindowController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resources/at.htl.workmanager/UserWindowController.fxml"));
        fxmlLoader.setController(this);
        try {
            parent = (Parent) fxmlLoader.load();
            scene = new Scene(parent, 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void redirectHome(Stage stage, String name) {
        stage.setTitle("Home");
        stage.setScene(scene);
        welcomeText.setText("Hello " + name + "! You are welcome.");
        stage.hide();
        stage.show();
    }
}
