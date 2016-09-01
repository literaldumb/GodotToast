# GodotToast
- Wrapper for the Toast.makeText functionality of Android in Godot
- Godot version 2.0.4.1 stable.
- Copyright [TeamKrishna](http://teamkrishna.in)
- Tested on Marshmallow.
- Use the readymade binaries from the bin folder directly in godot. 
- Uses only Toast.makeText() as of now. Can be extended to wrap all the available methods of Android Toast

##How to use
- Drop the GodotToast folder inside godot/modules

- Move the GodotToast/GodotToast.java to godot/platform/android/java/src/org/godotengine/godot


**Note:** The GodotToast/android.jar is taken from  *android-sdk-linux/platforms/android-23*. You may choose to use any other api version.

###Compile
1. #> scons platform=android
2. cd godot/platform/android/java
3. #> ./gradlew build
4. The resulting apk will be available at godot/platform/android/java/build/outputs/apk
 
###Configure
Add the following in the engine.cfg file:

> [android]

> modules="org/godotengine/godot/GodotToast"

**Use them in the script:**

> var toastLib = Globals.get_singleton("GodotToast")

> toastLib.initToast(true/false) # initializes the Toast library.

> toastLib.puke(message,duration) # displays the string "message" for duration(integer: 0{short} or 1{long}) seconds on the screen

**Note: 
toastLib.initToast(true) enables the use of toastLib.puke()

toastLib.initToast(false) disables all calls to toastLib.puke() internally. No need to remove or comment them out
**

###Build the game apk
From the settings of the godot engine UI:

> Export->Target->Android


Custom Package (Debug/Release):
> Point to the newly built apk

####License
MIT


Similar plugings: 
- [GodotVibrate](https://github.com/literaldumb/GodotVibrate)
- [Godot-SpeechToText](https://github.com/literaldumb/Godot-SpeechToText)
- [Godot-TextToSpeech](https://github.com/literaldumb/Godot-TextToSpeech)
- [Godot-CustomSpeech](https://github.com/literaldumb/Godot-CustomSpeech)


