# for javafx

```
$ echo $FX_PATH 
/usr/local/lib/java/openjfx-17.0.13_linux-x64_bin-sdk/javafx-sdk-17.0.13/lib
$ javac --module-path $FX_PATH --add-modules javafx.controls,javafx.fxml FileChooserExample.java
$ java --module-path $FX_PATH --add-modules javafx.controls,javafx.fxml FileChooserExample
```